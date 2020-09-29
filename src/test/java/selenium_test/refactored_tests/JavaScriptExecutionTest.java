package selenium_test.refactored_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;


public class JavaScriptExecutionTest extends BaseSeleniumTest {

    @Test
    public void javaScriptExecutionTest () {
        driver.get("https://www.google.com");
        WebElement searchInputGoogle = driver.findElement(By.name("q"));

        JavascriptExecutor executor = (JavascriptExecutor) driver;

        Actions actions = new Actions(driver);
        actions.contextClick().build().perform(); //symulacja kliknięcia prawym przyciskiem myszy

        executor.executeScript("arguments[0].setAttribute('value', 'Selenium')",searchInputGoogle); /*1 metoda na wpisanie wartości w Input*/
        searchInputGoogle.sendKeys(Keys.ENTER);

        WebElement seleniumLink = driver.findElement(By.xpath("//h3[text()='Selenium']"));
        executor.executeScript("arguments[0].click();",seleniumLink); //2 metoda na kliknięcię elementu

        Assert.assertEquals(driver.getTitle(),"SeleniumHQ Browser Automation");
    }
}
