package selenium_test.waits_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium_test.refactored_tests.BaseSeleniumTest;

import java.time.Duration;
import java.util.List;
import java.util.function.Function;


public class OurOwnWaitTest extends BaseSeleniumTest {

    @Test
    public void fluentWaitTest () {

        driver.get("C:\\Users\\glejwoda\\Desktop\\AUTO projects\\FirtsProjectTesterMaven\\src\\main\\resources\\zasoby\\Waits2.html");
        driver.findElement(By.id("clickOnMe")).click();
        waitForWebElement(By.tagName("p"));
        WebElement paragraph = driver.findElement(By.tagName("p"));
        Assert.assertEquals(paragraph.getText(), "Dopiero się pojawiłem!");
    }


    private void waitForWebElement (By locator) {
        WebDriverWait wait = new WebDriverWait(driver,10);

        wait.until(driver1 ->  {
                System.out.println("Sprawdzam czy element jest wyświetlony");
                if (driver1.findElement(locator).isDisplayed()) {
                    System.out.println("Element jest wyświetlony !");
                    return true;
                } else {
                    System.out.println("Element nie jest wyświetlony ;(");
                    return false;
                }
        });
    }
    
}
