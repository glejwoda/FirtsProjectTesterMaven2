package selenium_test.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SprawdzanieElementówDwa {

    @Test
    public void googleOpenTest (){

        String driverPath = "src/main/resources/executables.drivers/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",driverPath);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("C:\\Users\\glejwoda\\Desktop\\AUTO projects\\FirtsProjectTesterMaven\\src\\main\\resources\\zasoby\\Test.html");

/*        checkIfElementExist(By.tagName("a"),driver);
        checkIfElementExist(By.tagName("aasdsa"),driver);*/

        checkIfElementExist(driver,By.tagName("a"));
        checkIfElementExist(driver,By.tagName("abcd"));
    }

    public boolean  checkIfElementExist (By locator, WebDriver driver) {
        if (driver.findElements(locator).size() > 0 ) {
            System.out.println("Element istnieje na stronie ");
            return true;
        }
        System.out.println("Element nie istnieje na stronie ");
        return false;
    }

    public void checkIfElementExist (WebDriver driver, By locator) {
        try {
            driver.findElement(locator);
            System.out.println("Element istnieje na stronie");

        } catch (NoSuchElementException exc) {
            System.out.println("Element nie istnieje");
        }
    }

}
