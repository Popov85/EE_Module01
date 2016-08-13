package com.goit.g2popov.ee01.report;

import org.apache.poi.hssf.usermodel.HSSFHeader;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Андрей on 12.08.2016.
 */
public class Header {

        private Workbook workbook;

        private Sheet sheet;

        private Document document;

        public Header(Workbook workbook, Document document) {
                this.workbook = workbook;
                this.sheet = workbook.getSheet("Report");
                this.document = document;
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
                c.setCellStyle(document.getCsTopLeft());
                c = row.createCell(1);
                c.setCellStyle(document.getCsTop());
                c.setCellValue("Popov A.");
                c.setCellStyle(document.getCsTopRight());

                rowIndex++;
                row = sheet.createRow(rowIndex);
                c = row.createCell(0);
                c.setCellValue("Collections:");
                c.setCellStyle(document.getCsLeft());
                c = row.createCell(1);
                c.setCellValue("[HashSet, TreeSet, ArrayList, LinkedList]");
                c.setCellStyle(document.getCsRight());

                rowIndex++;
                row = sheet.createRow(rowIndex);
                c = row.createCell(0);
                c.setCellValue("Observations:");
                c.setCellStyle(document.getCsBottomLeft());
                c = row.createCell(1);
                c.setCellValue("100");
                c.setCellStyle(document.getCsBottomRight());
                return 0;
        }
}
