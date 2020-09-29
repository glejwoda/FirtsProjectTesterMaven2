package selenium_test.php_travels_project.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import selenium_test.php_travels_project.helpers.TestListener;
import selenium_test.php_travels_project.pages.HomePage;
import selenium_test.php_travels_project.pages.ResultPage;

import java.io.File;
import java.io.IOException;
import java.util.List;

import static selenium_test.php_travels_project.helpers.ExcelHelperDataProvider.readExcelFile;

@Listeners (TestListener.class)
public class SearchHotelTest extends BaseSeleniumTest {

    @Test (dataProvider = "getData")
    public void searchHotelTest (String city, String checkInDate, String checkOutDate, String fHotelName,String fHotelPrice,String sHotelName,String sHotelPrice,
                                              String tHotelName,String tHotelPrice)  {
        driver.get("http://www.kurs-selenium.pl/demo/m-cars");

        HomePage homePage = new HomePage(driver);
        ResultPage resultPage = homePage
                        .setCityHotel(city)
                        .setDateRange(checkInDate,checkOutDate)
                        .openTravelersModal()
                        .addAdultTravelers()
                        .addChildTravelers()
                        .addChildTravelers()
                        .performSearch();


        List <String> hotelNames = resultPage.getHotelsName();
        Assert.assertEquals(hotelNames.get(0),fHotelName);

        List <String> prices =  resultPage.getHotelsPrices();
        Assert.assertEquals(prices.get(0),fHotelPrice);

    }
    @DataProvider
    public Object [][] getData () {
        Object [][] data = null;                                                                                // wewnątrz metody nadajemy implementacje
        try {
            data = readExcelFile(new File("src/main/resources/files_excel/read_data.xlsx"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }


}
