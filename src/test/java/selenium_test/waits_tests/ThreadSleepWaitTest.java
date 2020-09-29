package selenium_test.waits_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium_test.refactored_tests.BaseSeleniumTest;

import java.io.File;


public class ThreadSleepWaitTest extends BaseSeleniumTest {

    @Test
    public void waitTest () throws InterruptedException {
        driver.get("C:\\Users\\glejwoda\\Desktop\\AUTO projects\\FirtsProjectTesterMaven\\src\\main\\resources\\zasoby\\Waits.html");
        driver.findElement(By.id("clickOnMe")).click();
        Thread.sleep(4000);

        WebElement paragraph = driver.findElement(By.tagName("p"));

        Assert.assertTrue(paragraph.getText().equals("Dopiero się pojawiłem!"));
    }

}
