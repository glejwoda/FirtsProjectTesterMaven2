package selenium_test.php_travels_project.helpers;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.Iterator;

public class ExcelHelper {

    public static void readExcelFile () throws IOException {

        InputStream inputStream = new FileInputStream(new File("src/main/resources/files_excel/read_data_1.xls"));
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(inputStream);

        Sheet sheet = xssfWorkbook.getSheetAt(0);
        Iterator <Row> iterator = sheet.rowIterator();

        while (iterator.hasNext()) {
            Row row = iterator.next();
            Iterator <Cell> cellIterator = row.cellIterator();
            while (cellIterator.hasNext()) {
                Cell cell = cellIterator.next();
                System.out.println(cell.getStringCellValue());
            }
        }
    }

    public static void main(String[] args) throws IOException {
        readExcelFile();
    }
}
