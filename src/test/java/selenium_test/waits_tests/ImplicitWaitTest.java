package selenium_test.waits_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium_test.refactored_tests.BaseSeleniumTest;

import java.util.concurrent.TimeUnit;


public class ImplicitWaitTest extends BaseSeleniumTest {

    @Test
    public void implicitWaitTest ()  {

    /*-------------------Implicity Wait sprawdza co chwilę dostępność elementu, działa dla każdego elementu który na którym wykonywana jest operacja--------------------------------------*/

        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.get("C:\\Users\\glejwoda\\Desktop\\AUTO projects\\FirtsProjectTesterMaven\\src\\main\\resources\\zasoby\\Waits2.html");
        driver.findElement(By.id("clickOnMe")).click();
        WebElement paragraph = driver.findElement(By.tagName("p"));
        Assert.assertEquals(paragraph.getText(), "Dopiero się pojawiłem!");
    }
}
