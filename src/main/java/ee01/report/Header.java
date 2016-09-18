package ee01.report;

import org.apache.poi.hssf.usermodel.HSSFHeader;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Class Header creates and prints a table with statistics on Java collections on MS Excel sheet
 * @Author Andrey P.
 */
public class Header {

        private Workbook workbook;

        private Sheet sheet;

        private Format format;

        public Header(Workbook workbook, Format format) {
                this.workbook = workbook;
                this.sheet = workbook.getSheet("Report");
                this.format = format;
        }

        public void print() throws IOException, InvalidFormatException {

                Date date = new Date();
                SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy h:mm:ss a");
                String formattedDate = sdf.format(date);

                //Set Header Information
                org.apache.poi.ss.usermodel.Header header = sheet.getHeader();
                header.setLeft("*** GOJAVAONLINE #3 ***");
                header.setCenter(HSSFHeader.font("Arial", "Bold") +
                        HSSFHeader.fontSize((short) 14) + "REPORT ON JAVA COLLECTIONS");
                header.setRight(sdf.format(date));

                // Header for author, aim and observations
                insertHeaderInfo();
        }


        private int insertHeaderInfo() {
                int rowIndex = 2;
                Row row = null;
                Cell c = null;

                rowIndex++;
                row = sheet.createRow(rowIndex);
                c = row.createCell(0);
                c.setCellValue("Author:");
                c.setCellStyle(format.getCsTopLeft());
                c = row.createCell(1);
                c.setCellStyle(format.getCsTop());
                c.setCellValue("Popov A.");
                c.setCellStyle(format.getCsTopRight());

                rowIndex++;
                row = sheet.createRow(rowIndex);
                c = row.createCell(0);
                c.setCellValue("Collections:");
                c.setCellStyle(format.getCsLeft());
                c = row.createCell(1);
                c.setCellValue("[HashSet, TreeSet, ArrayList, LinkedList]");
                c.setCellStyle(format.getCsRight());

                rowIndex++;
                row = sheet.createRow(rowIndex);
                c = row.createCell(0);
                c.setCellValue("Observations:");
                c.setCellStyle(format.getCsBottomLeft());
                c = row.createCell(1);
                c.setCellValue("100");
                c.setCellStyle(format.getCsBottomRight());
                return 0;
        }
}
