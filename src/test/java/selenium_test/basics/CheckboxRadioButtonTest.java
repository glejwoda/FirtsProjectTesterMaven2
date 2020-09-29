package selenium_test.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CheckboxRadioButtonTest {

    @Test
    public void googleOpenTest () throws InterruptedException {

        String driverPath = "src/main/resources/executables.drivers/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",driverPath);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("C:\\Users\\glejwoda\\Desktop\\AUTO projects\\FirtsProjectTesterMaven\\src\\main\\resources\\zasoby\\Test.html");

        WebElement checkBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        Thread.sleep(5000);
        checkBox.click();

        WebElement radioBtn = driver.findElement(By.xpath("//input[@value='male']"));
        radioBtn.click();

    }
}
