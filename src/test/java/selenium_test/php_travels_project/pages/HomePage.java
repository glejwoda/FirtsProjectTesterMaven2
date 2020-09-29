package selenium_test.php_travels_project.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import selenium_test.php_travels_project.helpers.SeleniumHelper;



public class HomePage {

    @FindBy (xpath = "//span[contains(text(),'Search by Hotel or City Name')]" )
    private WebElement searchSpan;

    @FindBy (xpath = "//div[@id='select2-drop']//input[@class='select2-input select2-focused']" )
    private WebElement srchByCityInput;

    @FindBy (xpath = "//span[contains(text(),'Hotels')]" )
    private WebElement bookmarkHotels;

    @FindBy (name = "checkin" )
    private WebElement checkInInput;

    @FindBy (name = "checkout" )
    private WebElement checkOutInput;

    @FindBy (id = "travellersInput" )
    private WebElement travellersSpan;

    @FindBy (id = "adultPlusBtn" )
    private WebElement adultPlusBtn;

    @FindBy (id = "childPlusBtn" )
    private WebElement childPlusBtn;

    @FindBy (xpath = "//button[text()=' Search']" )
    private WebElement submitBtn;

    @FindBy (xpath = "//div[@class='select2-result-label']")
    private WebElement resultLabel;

    private SeleniumHelper helper;

    private WebDriver driver;



    public HomePage (WebDriver driver) {              // construktor klasy HomePage wraz z inicjalizacją elementów FindBy dzięki PageFactory
        PageFactory.initElements(driver,this);
        this.helper = new SeleniumHelper(driver);
        this.driver = driver;
    }

    public HomePage setCityHotel (String cityName)  {
        bookmarkHotels.click();
        helper.implicitlyWaitForWebElements(searchSpan);
        searchSpan.click();
        srchByCityInput.sendKeys(cityName);
        helper.waitForElementToBeDisplayed(resultLabel);
        srchByCityInput.sendKeys(Keys.ENTER);
        return this;
    }

    public HomePage setDateRange (String checkInDate, String checkOutDate) {
        checkInInput.sendKeys(checkInDate);
        checkOutInput.sendKeys(checkOutDate);
        checkOutInput.click();
        return this;
    }

    public HomePage openTravelersModal () {
        travellersSpan.click();
        return this;
    }

    public HomePage addAdultTravelers () {
        adultPlusBtn.click();
        return this;
    }

    public HomePage addChildTravelers () {
        childPlusBtn.click();
        return this;
    }

    public ResultPage performSearch () {
        submitBtn.click();
        return new ResultPage(driver);
    }
}
