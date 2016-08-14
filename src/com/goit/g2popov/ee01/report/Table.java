package com.goit.g2popov.ee01.report;

import com.goit.g2popov.ee01.analysis.AbstractAverageCalculator;
import com.goit.g2popov.ee01.analysis.ArrayGenerator;
import com.goit.g2popov.ee01.analysis.AverageCalculatorList;
import com.goit.g2popov.ee01.analysis.AverageCalculatorSet;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Class Table creates and prints a table with statistics on Java collections on MS Excel sheet
 * @Author Andrey P.
 */
public class Table {

        private static final String OPERATIONS[]= {"Populate", "Add", "Contains", "Remove", "Get", "IterAdd", "IterRemove"};

        private int position = 0;

        private Workbook workbook;

        private Sheet sheet;

        private Format format;

        public Table(Workbook workbook, Format format) throws IOException, InvalidFormatException {
                this.workbook = workbook;
                this.sheet = workbook.getSheet("Report");
                this.format = format;
        }

        public void print(int arraySize, int number) throws Exception {
                this.position +=10;
                printTableHeader(arraySize, number);
                printFirstColumn();
                Integer data[] = new ArrayGenerator(arraySize).generate();
                printColumn(0, data);
                printColumn(1, data);
                printColumn(2, data);
                printColumn(3, data);
                save();
        }

        private void printTableHeader(int arraySize, int number) {
                Row row = sheet.createRow(position);
                Cell cell = row.createCell(0);
                cell.setCellValue("Table #"+number+" (Capacity: " + arraySize+")");
                cell.setCellStyle(format.getCsBold());
                position++;
        }

        private void printFirstColumn() {
                int counter = position;
                sheet.createRow(counter);
                for(String next : OPERATIONS){
                        counter++;
                        Row row = sheet.createRow(counter);
                        Cell cell = row.createCell(0);
                        cell.setCellValue(next);
                }
        }

        private void printColumn(int code, Integer data[]) throws Exception {
                AbstractAverageCalculator collection = getCollection(code, data);
                double suit[] = collection.avg();
                int counter = position;
                // First line of a table
                Row row = sheet.getRow(counter++);
                Cell cell = row.createCell(code+1);
                cell.setCellValue(collection.getType());
                cell.setCellStyle(format.getCsBold());
                // The following lines of the table
                for(Double avg : suit){
                        row = sheet.getRow(counter++);
                        cell = row.createCell(code+1);
                        double avgInMs = avg/1000000;
                        cell.setCellValue(round(avgInMs,4)+" ms");
                }
        }

        // Got from http://stackoverflow.com/questions/2808535/round-a-double-to-2-decimal-places
        private double round(double value, int places) {
                BigDecimal bd = new BigDecimal(value);
                bd = bd.setScale(places, RoundingMode.HALF_UP);
                return bd.doubleValue();
        }

        private void save() throws IOException {
                FileOutputStream fileOut = new FileOutputStream(Document.PATH);
                workbook.write(fileOut);
                fileOut.close();
        }

        private AbstractAverageCalculator getCollection(int code, Integer data[]) throws Exception {
                AbstractAverageCalculator collection = null;
                switch(code){
                        case 0:
                                collection = new AverageCalculatorSet(data,0, 90);
                                break;
                        case 1:
                                collection = new AverageCalculatorSet(data,1, 90);
                                break;
                        case 2:
                                collection = new AverageCalculatorList(data,0, 90);
                                break;
                        case 3:
                                collection = new AverageCalculatorList(data,1, 90);
                                break;
                        default:
                                throw new Exception("Wrong type!");
                }
                return collection;
        }
}
