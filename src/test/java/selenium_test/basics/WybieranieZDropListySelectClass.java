package selenium_test.basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class WybieranieZDropListySelectClass {

    @Test
    public void googleOpenTest (){

        String driverPath = "src/main/resources/executables.drivers/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",driverPath);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("C:\\Users\\glejwoda\\Desktop\\AUTO projects\\FirtsProjectTesterMaven\\src\\main\\resources\\zasoby\\Test.html");

        Select carSelect = new Select(driver.findElement(By.tagName("select")));
//        carSelect.selectByIndex(2);
//        carSelect.selectByVisibleText("Mercedes");
        carSelect.selectByValue("audi");

    }
}
