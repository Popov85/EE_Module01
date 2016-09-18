package ee01.report;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;

/**
 * Class Document creates a new xls. - file in a given pathway
 * It sets sheet parameters and settings
 * @Author Andrey P.
 */
public class Document {

        public static final String PATH = "Report.xls";

        public Workbook createNewDocument() {
                Workbook workbook = new HSSFWorkbook();
                Sheet sheet = workbook.createSheet("Report");

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
}
