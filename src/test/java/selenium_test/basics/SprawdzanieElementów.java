package selenium_test.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchContextException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SprawdzanieElementów {

    @Test
    public void googleOpenTest ()  {

        String driverPath = "src/main/resources/executables.drivers/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",driverPath);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("C:\\Users\\glejwoda\\Desktop\\AUTO projects\\FirtsProjectTesterMaven\\src\\main\\resources\\zasoby\\Test.html");

/*        WebElement checkBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkBox.click();

        WebElement radioBtn = driver.findElement(By.xpath("//input[@value='male']"));
        radioBtn.click();*/

        /*---------------------------------------------POBIERANIE TEKSTU Z NIEWIDOCZNEGO ELEMENT---------------------------------------------------------*/

        WebElement hiddenElement = driver.findElement(By.className("topSecret"));
        System.out.println("Mój tekst to " + hiddenElement.getText());
        System.out.println("Mój tekst to " + hiddenElement.getAttribute("value"));
        System.out.println("Mój tekst to " + hiddenElement.getAttribute("textContent"));// <------------ atrybut dla ukrytych elementów


        /*---------------------------------------------SPRAWDZENIE POPRAWNOŚCI ZAŁADOWANIA OBRAZKA NA STRONIE------------------------------------*/

        WebElement smileImg = driver.findElement(By.id("smileImage"));
        System.out.println(smileImg.getSize().getHeight());
        System.out.println(smileImg.getAttribute("naturalHeight"));
        System.out.println(smileImg.getSize().getWidth());

        /*---------------------------------------------SPRAWDZENIE CZY ELEMENT JEST EDYTOWALNY-------------------------------------------------------------*/

        WebElement firstNameInput = driver.findElement(By.name("fname"));
        if (firstNameInput.isEnabled()) {
            System.out.println("Element nie jest zablokowany");
            firstNameInput.sendKeys("Janusz Molak");
        } else {
            System.out.println("Element zablokowany");
        }
        /*---------------------------------------------SPRAWDZENIE CZY CHECKBOX JEST ZAZNACZONY-------------------------------------------------------------*/


        WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        if (checkbox.isSelected()) {
            System.out.println("Checkbox jest zaznaczony");
            checkbox.click();
            System.out.println("Checkbox został odznaczony");

        } else {
            System.out.println("Checkbox nie jest zaznaczony");
        }

        /*---------------------------------------------SPRAWDZENIE CZY ELEMENT  JEST WIDOCZNY NA STRONIE -------------------------------------------------------------*/

        WebElement topSecret = driver.findElement(By.className("topSecret"));
        if (topSecret.isDisplayed()) {
            System.out.println("Element jest widoczny");
            System.out.println(topSecret.getText());
            topSecret.click();
        } else {
            System.out.println("Element nie jest widoczny");
            System.out.println(topSecret.getAttribute("textContent"));
        }

        /*---------------------------------------------SPRAWDZENIE CZY ELEMENT ISTNIEJE NA STRONIE -------------------------------------------------------------*/







    }
}
