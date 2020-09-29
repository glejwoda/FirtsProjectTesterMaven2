package selenium_test.refactored_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class HoverElementTest extends BaseSeleniumTest {

    @Test
    public void hoverMouseElementTest () {
        driver.get("https://www.w3schools.com/");

        Actions actions = new Actions(driver);
//        actions.contextClick().build().perform(); //symulacja kliknięcia prawym przyciskiem myszy

        actions.moveToElement(driver.findElement(By.id("navbtn_tutorials"))).build().perform();

    }
}
