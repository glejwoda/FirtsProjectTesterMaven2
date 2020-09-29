package selenium_test.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class PrzełączanieOkienPrzeglądarki {

    @Test
    public void googleOpenTest() {

        String driverPath = "src/main/resources/executables.drivers/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("C:\\Users\\glejwoda\\Desktop\\AUTO projects\\FirtsProjectTesterMaven\\src\\main\\resources\\zasoby\\Test.html");

        WebElement newPageBtn = driver.findElement(By.id("newPage"));
        newPageBtn.click();

        String currentWindowName = driver.getWindowHandle();
        switchToNewWindow (driver,currentWindowName);

        System.out.println("Tytuł strony to " + driver.getTitle());
        System.out.println("Obecny URL to  " + driver.getCurrentUrl());

        driver.switchTo().window(currentWindowName);
        driver.findElement(By.name("username")).sendKeys("Marek Mostowiak");

    }

    private void switchToNewWindow(WebDriver driver, String currentWindowName) {
        System.out.println("Wartość dla obecnego okna to " + currentWindowName);
        Set<String> windows =  driver.getWindowHandles();
        System.out.println("Ilość okien przeglądarki  " + windows.size());

        for (String window : windows) {
            if (!window.equals(currentWindowName)) {
                driver.switchTo().window(window);
            }
        }
    }
}
