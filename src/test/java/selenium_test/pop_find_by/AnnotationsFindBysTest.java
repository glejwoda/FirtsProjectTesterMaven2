package selenium_test.pop_find_by;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium_test.refactored_tests.BaseSeleniumTest;
import selenium_test.refactored_tests.SeleniumHelper;

import java.util.List;


public class AnnotationsFindBysTest extends BaseSeleniumTest {

    /*---------------------------------------------------------------------------------------FindBy---------------------------------------------------------------------------------------------------*/
    @FindBy (xpath = "//button")
    private List <WebElement> allButtons;

    @FindBy (xpath = "//input")
    private List <WebElement> allInputs;

    @FindBy (xpath = "//select")
    private List <WebElement> allSelects;


    /*---------------------------------------------------------------------------------------FindBys-----------------------------------------------------------------------------------------------*/

    /*w wyszukiwaniu poprzez adnotację FindBys ważna jest kolejność wyszukiwania  elementów, ze względu na ich java_kurs.dziedziczenie i zależności w HTML-u */

    @FindBys({
            @FindBy (tagName = "table"), // tagname table jest nadrzędny nad tableHeader dlatego musi być podany pierwszy na liście
            @FindBy (className = "tableHeader")
    })
    private List <WebElement> elements;

    /*---------------------------------------------------------------------------------------FindAll-----------------------------------------------------------------------------------------------*/

    @FindAll ({
            @FindBy (xpath = "//input" ),
            @FindBy (xpath = "//button" )
    })
    private List <WebElement> inputsAndButtons;



    @Test
    public void annotationsTest () {
        SeleniumHelper helper = new SeleniumHelper(driver);
        PageFactory.initElements(driver,this);  //---> INICJALIZACJA ELEMENTÓW W METODZIE TESTOWEJ dla adnotacji FindBy / FindBys
        driver.get("C:\\Users\\glejwoda\\Desktop\\AUTO projects\\FirtsProjectTesterMaven\\src\\main\\resources\\zasoby\\Test.html");
        System.out.println("Element size is  " + elements.size());
        System.out.println("Inputs size is  " + allInputs.size());
        System.out.println("Buttons size is  " + allButtons.size());
        System.out.println("Selects size is  " + allSelects.size());
        System.out.println("Inputs and buttons size is  " + inputsAndButtons.size());

    }
}
