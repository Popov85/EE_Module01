package com.goit.g2popov.ee01.report;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Workbook;

/**
 * Class Format creates style or report content representation on a sheet of MS Excel
 * @Author Andrey P.
 */
public class Format {

        private Workbook workbook;

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

        public CellStyle getCs() {
                return cs;
        }

        public CellStyle getCsBold() {
                return csBold;
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

        public Format(Workbook workbook) {

                this.workbook = workbook;

                //font size 10
                Font f = this.workbook.createFont();
                f.setFontHeightInPoints((short) 10);

                //Simple style
                cs = this.workbook.createCellStyle();
                cs.setFont(f);

                //Bold Fond
                Font bold = this.workbook.createFont();
                bold.setBoldweight(Font.BOLDWEIGHT_BOLD);
                bold.setFontHeightInPoints((short) 10);

                //Bold style
                csBold = this.workbook.createCellStyle();
                csBold.setBorderBottom(CellStyle.BORDER_THIN);
                csBold.setBottomBorderColor(IndexedColors.BLACK.getIndex());
                csBold.setFont(bold);

                //Setup style for Top Border Line
                csTop = this.workbook.createCellStyle();
                csTop.setBorderTop(CellStyle.BORDER_THIN);
                csTop.setTopBorderColor(IndexedColors.BLACK.getIndex());
                csTop.setFont(f);

                //Setup style for Right Border Line
                csRight = this.workbook.createCellStyle();
                csRight.setBorderRight(CellStyle.BORDER_THIN);
                csRight.setRightBorderColor(IndexedColors.BLACK.getIndex());
                csRight.setFont(f);

                //Setup style for Bottom Border Line
                csBottom = this.workbook.createCellStyle();
                csBottom.setBorderBottom(CellStyle.BORDER_THIN);
                csBottom.setBottomBorderColor(IndexedColors.BLACK.getIndex());
                csBottom.setFont(f);

                //Setup style for Left Border Line
                csLeft = this.workbook.createCellStyle();
                csLeft.setBorderLeft(CellStyle.BORDER_THIN);
                csLeft.setLeftBorderColor(IndexedColors.BLACK.getIndex());
                csLeft.setFont(f);

                //Setup style for Top/Left corner cell Border Lines
                csTopLeft = this.workbook.createCellStyle();
                csTopLeft.setBorderTop(CellStyle.BORDER_THIN);
                csTopLeft.setTopBorderColor(IndexedColors.BLACK.getIndex());
                csTopLeft.setBorderLeft(CellStyle.BORDER_THIN);
                csTopLeft.setLeftBorderColor(IndexedColors.BLACK.getIndex());
                csTopLeft.setFont(f);

                //Setup style for Top/Right corner cell Border Lines
                csTopRight = this.workbook.createCellStyle();
                csTopRight.setBorderTop(CellStyle.BORDER_THIN);
                csTopRight.setTopBorderColor(IndexedColors.BLACK.getIndex());
                csTopRight.setBorderRight(CellStyle.BORDER_THIN);
                csTopRight.setRightBorderColor(IndexedColors.BLACK.getIndex());
                csTopRight.setFont(f);

                //Setup style for Bottom/Left corner cell Border Lines
                csBottomLeft = this.workbook.createCellStyle();
                csBottomLeft.setBorderBottom(CellStyle.BORDER_THIN);
                csBottomLeft.setBottomBorderColor(IndexedColors.BLACK.getIndex());
                csBottomLeft.setBorderLeft(CellStyle.BORDER_THIN);
                csBottomLeft.setLeftBorderColor(IndexedColors.BLACK.getIndex());
                csBottomLeft.setFont(f);

                //Setup style for Bottom/Right corner cell Border Lines
                csBottomRight = this.workbook.createCellStyle();
                csBottomRight.setBorderBottom(CellStyle.BORDER_THIN);
                csBottomRight.setBottomBorderColor(IndexedColors.BLACK.getIndex());
                csBottomRight.setBorderRight(CellStyle.BORDER_THIN);
                csBottomRight.setRightBorderColor(IndexedColors.BLACK.getIndex());
                csBottomRight.setFont(f);
        }
}
