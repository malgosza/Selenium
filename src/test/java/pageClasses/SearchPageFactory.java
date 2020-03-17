package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPageFactory {
    @FindBy(id="tab-flight-tab")
    WebElement flightTab;

    @FindBy(id="flight-type-roundtrip-label")
    WebElement roundTrip;

    @FindBy(id="flight-type-multi-dest-label")
    WebElement multipleDestination;

    WebDriver driver;

    @FindBy(id="header-history")
    WebElement headerHistory;

    @FindBy(id="tab-flight-tab")
    WebElement fligthsTab;

    @FindBy(id="flight-origin")
    WebElement originCity;

    @FindBy(id="flight-destination")
    WebElement destinationCity;

    @FindBy(id="flight-departing")
    WebElement departureDate;

    @FindBy(id="flight-returning")
    WebElement returnDate;

    public void clickroundTrip() {
        roundTrip.click();
    }

    public void clickMultipleDestination() {
        multipleDestination.click();
    }

    public SearchPageFactory(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickFlightsTab() {
        headerHistory.click();
        fligthsTab.click();
    }

    public void setOriginCity(String origin) {
        originCity.sendKeys(origin);
    }

    public void setDestinationCity(String destination) {
        destinationCity.sendKeys(destination);
    }

    public void setDepartureDate(String departure) {
        departureDate.sendKeys(departure);
    }

    public void setReturnDate(String dateReturn) {
        returnDate.sendKeys(dateReturn);
    }
}
