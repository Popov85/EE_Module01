package com.goit.g2popov.ee01.report;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;

/**
 * Created by Андрей on 13.08.2016.
 */
public class Document {

        public static final String PATH = "Report.xls";

        private CellStyle cs;
        private CellStyle csBold;
        private CellStyle csTop;
        private CellStyle csRight;
        private CellStyle csBottom;
        private CellStyle csLeft;
        private CellStyle csTopLeft;
        private CellStyle csTopRight;
        private CellStyle csBottomLeft;
        private CellStyle csBottomRight;

        public CellStyle getCsBold() {
                return csBold;
        }

        public CellStyle getCs() {
                return cs;
        }

        public CellStyle getCsTop() {
                return csTop;
        }

        public CellStyle getCsRight() {
                return csRight;
        }

        public CellStyle getCsBottom() {
                return csBottom;
        }

        public CellStyle getCsLeft() {
                return csLeft;
        }

        public CellStyle getCsTopLeft() {
                return csTopLeft;
        }

        public CellStyle getCsTopRight() {
                return csTopRight;
        }

        public CellStyle getCsBottomLeft() {
                return csBottomLeft;
        }

        public CellStyle getCsBottomRight() {
                return csBottomRight;
        }

        public Workbook createNewDocument() {
                Workbook workbook = new HSSFWorkbook();
                Sheet sheet = workbook.createSheet("Report");

                //Setup some styles that we need for the Cells
                setCellStyles(workbook);

                //Set Column Widths
                sheet.setColumnWidth(0, 3000);
                sheet.setColumnWidth(1, 5000);
                sheet.setColumnWidth(2, 5000);
                sheet.setColumnWidth(3, 5000);
                sheet.setColumnWidth(4, 5000);

                //Setup the Page margins - Left, Right, Top and Bottom
                sheet.setMargin(Sheet.LeftMargin, 0.25);
                sheet.setMargin(Sheet.RightMargin, 0.25);
                sheet.setMargin(Sheet.TopMargin, 0.75);
                sheet.setMargin(Sheet.BottomMargin, 0.75);

                //Setup the Header and Footer Margins
                sheet.setMargin(Sheet.HeaderMargin, 0.25);
                sheet.setMargin(Sheet.FooterMargin, 0.25);

                return workbook;
        }

        private void setCellStyles(Workbook wb) {

                //font size 10
                Font f = wb.createFont();
                f.setFontHeightInPoints((short) 10);

                //Simple style
                cs = wb.createCellStyle();
                cs.setFont(f);

                //Bold Fond
                Font bold = wb.createFont();
                bold.setBoldweight(Font.BOLDWEIGHT_BOLD);
                bold.setFontHeightInPoints((short) 10);

                //Bold style
                csBold = wb.createCellStyle();
                csBold.setBorderBottom(CellStyle.BORDER_THIN);
                csBold.setBottomBorderColor(IndexedColors.BLACK.getIndex());
                csBold.setFont(bold);

                //Setup style for Top Border Line
                csTop = wb.createCellStyle();
                csTop.setBorderTop(CellStyle.BORDER_THIN);
                csTop.setTopBorderColor(IndexedColors.BLACK.getIndex());
                csTop.setFont(f);

                //Setup style for Right Border Line
                csRight = wb.createCellStyle();
                csRight.setBorderRight(CellStyle.BORDER_THIN);
                csRight.setRightBorderColor(IndexedColors.BLACK.getIndex());
                csRight.setFont(f);

                //Setup style for Bottom Border Line
                csBottom = wb.createCellStyle();
                csBottom.setBorderBottom(CellStyle.BORDER_THIN);
                csBottom.setBottomBorderColor(IndexedColors.BLACK.getIndex());
                csBottom.setFont(f);

                //Setup style for Left Border Line
                csLeft = wb.createCellStyle();
                csLeft.setBorderLeft(CellStyle.BORDER_THIN);
                csLeft.setLeftBorderColor(IndexedColors.BLACK.getIndex());
                csLeft.setFont(f);

                //Setup style for Top/Left corner cell Border Lines
                csTopLeft = wb.createCellStyle();
                csTopLeft.setBorderTop(CellStyle.BORDER_THIN);
                csTopLeft.setTopBorderColor(IndexedColors.BLACK.getIndex());
                csTopLeft.setBorderLeft(CellStyle.BORDER_THIN);
                csTopLeft.setLeftBorderColor(IndexedColors.BLACK.getIndex());
                csTopLeft.setFont(f);

                //Setup style for Top/Right corner cell Border Lines
                csTopRight = wb.createCellStyle();
                csTopRight.setBorderTop(CellStyle.BORDER_THIN);
                csTopRight.setTopBorderColor(IndexedColors.BLACK.getIndex());
                csTopRight.setBorderRight(CellStyle.BORDER_THIN);
                csTopRight.setRightBorderColor(IndexedColors.BLACK.getIndex());
                csTopRight.setFont(f);

                //Setup style for Bottom/Left corner cell Border Lines
                csBottomLeft = wb.createCellStyle();
                csBottomLeft.setBorderBottom(CellStyle.BORDER_THIN);
                csBottomLeft.setBottomBorderColor(IndexedColors.BLACK.getIndex());
                csBottomLeft.setBorderLeft(CellStyle.BORDER_THIN);
                csBottomLeft.setLeftBorderColor(IndexedColors.BLACK.getIndex());
                csBottomLeft.setFont(f);

                //Setup style for Bottom/Right corner cell Border Lines
                csBottomRight = wb.createCellStyle();
                csBottomRight.setBorderBottom(CellStyle.BORDER_THIN);
                csBottomRight.setBottomBorderColor(IndexedColors.BLACK.getIndex());
                csBottomRight.setBorderRight(CellStyle.BORDER_THIN);
                csBottomRight.setRightBorderColor(IndexedColors.BLACK.getIndex());
                csBottomRight.setFont(f);
        }
}
