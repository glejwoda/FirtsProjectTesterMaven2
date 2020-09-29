package selenium_test.pop_find_by;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium_test.refactored_tests.BaseSeleniumTest;
import selenium_test.refactored_tests.SeleniumHelper;

import java.util.List;


public class AnnotationsFindByTest extends BaseSeleniumTest {

    @FindBy (name = "q" )
    private WebElement searchInput; //POJEDYNCZY ELEMENT

    @FindBy (xpath = "//h3[text()='Selenium']" )
    private WebElement linkSelenium1;

    @FindBy (name = "q" )
    private List <WebElement> searchInputs;     //LISTA WEBELEMENTÓW


    @Test
    public void googleSearchTest () {
        SeleniumHelper helper = new SeleniumHelper(driver);
        PageFactory.initElements(driver,this);  //---> INICJALIZACJA ELEMENTÓW W METODZIE TESTOWEJ
        driver.get("https://www.google.com");
        searchInputs.get(0).sendKeys("Selenium");
        helper.takeScreenshot();
        searchInputs.get(0).sendKeys(Keys.ENTER);
        linkSelenium1.click();
        helper.takeScreenshot();
        Assert.assertEquals(driver.getTitle(),"SeleniumHQ Browser Automation");
    }
}
