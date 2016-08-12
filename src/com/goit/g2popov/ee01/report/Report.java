package com.goit.g2popov.ee01.report;

/**
 * Created by Андрей on 12.08.2016.
 */
public class Report implements Printer {

        Header header;
        Table table;

        public Report(Header header, Table table) {
                this.header = header;
                this.table = table;
        }

        @Override
        public void print() throws Exception {
                header.print();
                table.print(10000,1);
                table.print(100000,2);
                table.print(1000000,3);
        }
}
