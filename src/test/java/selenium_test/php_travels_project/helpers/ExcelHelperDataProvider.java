package selenium_test.php_travels_project.helpers;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

public class ExcelHelperDataProvider {

    public static Object [][] readExcelFile (File file) throws IOException {                    // zwracamy tablicę dwuwymiarową którą użyjemy w data providerze

        InputStream inputStream = new FileInputStream(file);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(inputStream);
        Sheet sheet = xssfWorkbook.getSheetAt(0);
        int rowNumbers = sheet.getLastRowNum();                                                 // ilość wierszy w arkuszu
        int columnNumbers = sheet.getRow(0).getLastCellNum();                         // ilość kolumn  w arkuszu
        String [][] data = new String[rowNumbers][columnNumbers];                        // tworzymy tablicę typu String z danymi integerów

        for (int i = 0; i < rowNumbers; i++) {
            Row row = sheet.getRow(i +1);                                                          // wewnątrz for-a pobieramy konkretny typ w celu iterowania po wszystkich kolumnach
            for (int j = 0; j < row.getLastCellNum(); j++) {
                data [i][j] = row.getCell(i).getStringCellValue();
            }
        }
        return data;
    }

/*    public static void main(String[] args) throws IOException {                               // za pomocą metody "psvm" testujemy metodę readExcelFile czy czyta poprawnie dane z pliku
        Object [] [] data = readExcelFile(new File("src/main/resources/files_excel/read_data.xlsx"));
        System.out.println(data[0][0]);
        System.out.println(data[0][1]);
        System.out.println(data[0][2]);
    }*/
}
