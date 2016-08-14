package com.goit.g2popov.ee01.report;

import org.apache.poi.ss.usermodel.Workbook;

/**
 * Class App is an entry point to create an xls.-based report on Java collections
 * @Author Andrey P.
 */
public class App {
        public static void main(String[] args) throws Exception {
                Document document = new Document();
                Workbook workbook = document.createNewDocument();
                Format format = new Format(workbook);
                Header header= new Header(workbook, format);
                Table table = new Table(workbook, format);
                Report report = new Report(header, table);
                report.print();
        }
}
