package selenium_test.refactored_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;


public class DoubleClickTest extends BaseSeleniumTest {

    @Test
    public void doubleClickTest () {
        SeleniumHelper helper = new SeleniumHelper(driver);
        driver.get("C:\\Users\\glejwoda\\Desktop\\AUTO projects\\FirtsProjectTesterMaven\\src\\main\\resources\\zasoby\\DoubleClick.html");

        WebElement twiceClickBtn = driver.findElement(By.id("bottom"));

        Actions actions = new Actions(driver);
        actions.moveToElement(twiceClickBtn).doubleClick().build().perform();
        helper.takeScreenshot();

        Assert.assertTrue(driver.getWindowHandles().size() > 1);
    }
}
