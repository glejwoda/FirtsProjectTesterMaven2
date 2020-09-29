package selenium_test.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class PobieranieTekstuZElementu {

    @Test
    public void googleOpenTest (){

        String driverPath = "src/main/resources/executables.drivers/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",driverPath);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("C:\\Users\\glejwoda\\Desktop\\AUTO projects\\FirtsProjectTesterMaven\\src\\main\\resources\\zasoby\\Test.html");

        WebElement firstNameInput = driver.findElement(By.name("fname"));
        firstNameInput.sendKeys("Janusz Molak");
//        System.out.println("Wartość tekstu to " + firstNameInput.getText());
        System.out.println("Wartość tekstu to " + firstNameInput.getAttribute("value"));

        WebElement label = driver.findElement(By.tagName("label"));
        System.out.println("Wartość tekstu to " + label.getText());

    }
}
