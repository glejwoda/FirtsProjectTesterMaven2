package selenium_test.php_travels_project.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import selenium_test.php_travels_project.helpers.SeleniumHelper;

import java.util.List;
import java.util.stream.Collectors;

public class ResultPage {

    @FindBy (xpath = "//table[@class='bgwhite table table-striped']" )
    private WebElement resultslTable;

    private SeleniumHelper helper;


    public ResultPage(WebDriver driver) {              // construktor klasy HomePage wraz z inicjalizacją elementów FindBy dzięki PageFactory
        PageFactory.initElements(driver,this);
        this.helper = new SeleniumHelper(driver);
    }

    public List <String> getHotelsName ()  {
        List <WebElement> hotelNamesWebElements = resultslTable.findElements(By.xpath(".//h4/a/b"));
        helper.waitForListOfWebElements(resultslTable.findElements(By.xpath(".//h4/a/b")));
        List <String> hotelNames = hotelNamesWebElements.stream().map(element -> element.getText()).collect(Collectors.toList());
        System.out.println(hotelNames);
        return hotelNames;
    }

    public List <String> getHotelsPrices () {
        List <WebElement> hotelPrices = resultslTable.findElements(By.xpath("//div[contains(@class,'price_tab')]//b")); // <---- ważny xpath
        List <String> prices = hotelPrices.stream().map(element -> element.getText()).collect(Collectors.toList());
        System.out.println(prices);
        return prices;
        }
    }
