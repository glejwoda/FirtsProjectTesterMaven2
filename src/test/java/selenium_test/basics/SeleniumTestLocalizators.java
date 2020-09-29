package selenium_test.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class SeleniumTestLocalizators {

    @Test
    public void googleOpenTest (){

        String driverPath = "src/main/resources/executables.drivers/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",driverPath);
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("C:\\Users\\glejwoda\\Desktop\\AUTO projects\\FirtsProjectTesterMaven\\src\\main\\resources\\zasoby\\Test.html");

        /*LOKALIZOWANIE ZA POMOCĄ ID,TAGNAME ITP. */
/*        WebElement firstNameInputById =  driver.findElement(By.id("clickOnMe"));
        WebElement secondElementByName =  driver.findElement(By.name("fname"));
        WebElement thirdElementByLinkText =  driver.findElement(By.linkText("Visit W3Schools.com!"));
        WebElement fourthElementByPartialLinkText =  driver.findElement(By.partialLinkText("Weird"));
        WebElement fifthElementByLinkText =  driver.findElement(By.partialLinkText("Weird"));
        WebElement sixthElementByClass =  driver.findElement(By.className("topSecret"));
        WebElement seventhElementByTagName =  driver.findElement(By.tagName("input"));
        WebElement firstLinkk=  driver.findElement(By.tagName("a"));

        *//*LOKALIZOWANIE ZA POMOCĄ CSS SELECTORÓW *//*
        WebElement clickOnMeByCssSelector =  driver.findElement(By.cssSelector("#clickOnMe"));
        WebElement linkByCssSelector =  driver.findElement(By.cssSelector("a"));
        WebElement hiddenParagahByCssSelector =  driver.findElement(By.cssSelector(".topSecret"));
        WebElement tdFirstChildByCssSelector =  driver.findElement(By.cssSelector("td:first-child"));

        *//*LOKALIZOWANIE ZA POMOCĄ XPATH *//*
        WebElement clickOnMeXpathButton = driver.findElement(By.xpath("/html/body/button"));
        WebElement clickOnMeXpathButton2 = driver.findElement(By.xpath("//button"));
        WebElement linksXpath = driver.findElement(By.xpath("//a"));
        WebElement topSecretXpath = driver.findElement(By.xpath("//p[@class='topSecret']"));
        WebElement topSecretXpath2 = driver.findElement(By.xpath("//*[@class='topSecret']"));
        WebElement linkTextXpath = driver.findElement(By.xpath("//a[text()='Visit W3Schools.com!']"));

        //łapanie całej listy elementów po tagName//*/

        WebElement firstLink = driver.findElement(By.tagName("a"));

       List<WebElement> linksAll =  driver.findElements(By.tagName("a"));
        System.out.println("Znaleziono " + linksAll.size() + " linki");
        if (linksAll.size() > 0) {
            System.out.println("Linki istnieją");
        } else {
            System.out.println("Linki nie istnieją");
        }

        WebElement clickOnMeXpth = driver.findElement(By.xpath("//*[@id=\"clickOnMe\"]"));

    }
}
