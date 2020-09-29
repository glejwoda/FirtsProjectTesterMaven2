package selenium_test.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;


public class GoogleTestAsercje {

     private WebDriver driver;

     @BeforeClass
     public void setUp (){
         System.out.println("Wykonuje się przed klasą");
         String driverPath = "src/main/resources/executables.drivers/chromedriver.exe";
         System.setProperty("webdriver.chrome.driver", driverPath);
         driver = new ChromeDriver();
         driver.manage().window().maximize();
     }


    @Test
    public void googleOpenTest() {
        driver.get("https://www.google.com");
        WebElement searchInputGoogle = driver.findElement(By.name("q"));
//        WebElement searchBtn = driver.findElement(By.name("btnK"));
        searchInputGoogle.sendKeys("Selenium");
        searchInputGoogle.sendKeys(Keys.ENTER);
/*        searchInputGoogle.sendKeys(Keys.ESCAPE);
        searchBtn.click();*/
      /*  WebElement seleniumPageLink = driver.findElement(By.xpath("//a[@href='https://selenium.dev/']"));
        WebElement seleniumPageLink2 = driver.findElement(By.xpath("//*[@class='LC20lb DKV0Md']"));*/
        driver.findElement(By.xpath("//h3[text()='Selenium']")).click();
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(),"SeleniumHQ Browser Automation");

    }

    @AfterClass
    public void tearDown () {
        System.out.println("Wykonuje się po klasie");
        driver.quit();
    }

}
