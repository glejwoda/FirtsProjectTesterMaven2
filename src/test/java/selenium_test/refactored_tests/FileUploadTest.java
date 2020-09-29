package selenium_test.refactored_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;


public class FileUploadTest extends BaseSeleniumTest {

    @Test
    public void fileUploadTest () {

        driver.get("C:\\Users\\glejwoda\\Desktop\\AUTO projects\\FirtsProjectTesterMaven\\src\\main\\resources\\zasoby\\FileUpload.html");

        String path = new File("src/main/resources/screenshots/test.png").getAbsolutePath();

        WebElement inputFile = driver.findElement(By.id("myFile"));
        inputFile.sendKeys(path);
    }

    @Test
    public void fileUploadGuru99 () {

        driver.get("http://demo.guru99.com/test/upload/");

        String path = new File("src/main/resources/screenshots/test.png").getAbsolutePath();

        WebElement inputFile = driver.findElement(By.name("uploadfile_0"));
        inputFile.sendKeys(path);
    }

}
