package com.goit.g2popov.ee01.report;

import org.apache.poi.ss.usermodel.Workbook;

/**
 * Created by Андрей on 10.08.2016.
 */
public class App {
        public static void main(String[] args) throws Exception {
                Document document = new Document();
                Workbook workbook = document.createNewDocument();
                Header header= new Header(workbook);
                Table table = new Table(workbook);
                Report report = new Report(header, table);
                report.print();
        }
}
