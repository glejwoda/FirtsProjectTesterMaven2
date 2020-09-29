package selenium_test.refactored_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;


public class GoogleSearchTest extends BaseSeleniumTest {

    @Test
    public void googleSearchTest () {
        SeleniumHelper helper = new SeleniumHelper(driver);
        driver.get("https://www.google.com");
        WebElement searchInputGoogle = driver.findElement(By.name("q"));
        searchInputGoogle.sendKeys("Selenium");
        helper.takeScreenshot();
        searchInputGoogle.sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//h3[text()='Selenium']")).click();
        helper.takeScreenshot();
        Assert.assertEquals(driver.getTitle(),"SeleniumHQ Browser Automation");
    }
}
