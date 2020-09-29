package selenium_test.basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class SeleniumTestActions {

    @Test
    public void googleOpenTest (){

        String driverPath = "src/main/resources/executables.drivers/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",driverPath);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("C:\\Users\\glejwoda\\Desktop\\AUTO projects\\FirtsProjectTesterMaven\\src\\main\\resources\\zasoby\\Test.html");

        WebElement clickOnMeBtn = driver.findElement(By.id("clickOnMe"));
        clickOnMeBtn.click();

        Alert alert = driver.switchTo().alert();
        alert.accept();


        WebElement firstNameInput = driver.findElement(By.name("fname"));
        firstNameInput.sendKeys("Janusz Gówno");
        firstNameInput.clear();
        firstNameInput.sendKeys("Tadeusz");

    }
}
