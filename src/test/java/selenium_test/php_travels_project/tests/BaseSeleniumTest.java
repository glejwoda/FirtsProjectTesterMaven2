package selenium_test.php_travels_project.tests;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import selenium_test.php_travels_project.helpers.DriverFactory;
import selenium_test.php_travels_project.helpers.DriverType;
import selenium_test.php_travels_project.helpers.NoSuchDriverExeception;


public class BaseSeleniumTest {

     protected WebDriver driver;

     @BeforeMethod
     public void setUp () throws NoSuchDriverExeception {
         String driverPath = "src/main/resources/executables.drivers/chromedriver.exe";
         System.setProperty("webdriver.chrome.driver", driverPath);
         driver = DriverFactory.getDriver(DriverType.CHROME);
     }

    @AfterMethod
    public void tearDown () {
        driver.quit();
        DriverFactory.resetDriver();
    }

}
