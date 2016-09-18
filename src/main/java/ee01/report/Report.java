package ee01.report;

/**
 * Class Report creates and prints a report with deep statistics on Java collections on MS Excel sheet
 * Report consists of:
 * 1) a header and 2) three tables with measurements on collections 10000, 100000 and 1000000 capacities
 * @Author Andrey P.
 */
public class Report implements Printer {

        private Header header;
        private Table table;

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
