package selenium_test.refactored_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;


public class HandlingFrameTest  extends BaseSeleniumTest{

    @Test
    public void handlingFrameTest () {
        driver.get("C:\\Users\\glejwoda\\Desktop\\AUTO projects\\FirtsProjectTesterMaven\\src\\main\\resources\\zasoby\\iFrameTest.html");
        driver.switchTo().frame(0);
        WebElement clickOnMe = driver.findElement(By.id("clickOnMe"));
        clickOnMe.click();
        driver.switchTo().alert().accept();
        driver.switchTo().defaultContent();

        List <WebElement> headers = driver.findElements(By.tagName("h1"));
        System.out.println(headers.size());

        System.out.println(headers.get(0).getText());

    }

}
