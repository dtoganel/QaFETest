package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShippingPage extends BasePage {
    public ShippingPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "shipping_first_name")
    private WebElement firstName;
    @FindBy(id = "shipping_last_name")
    private WebElement lastName;
    @FindBy(id = "select2-shipping_country-container")
    private WebElement selectCountry;
    @FindBy(css = ".select2-dropdown--above>span>input")
    private WebElement writeCountry;
    @FindBy(id = "shipping_address_1")
    private WebElement shippingAddress;
    @FindBy(id = "shipping_city")
    private WebElement city;
    @FindBy(id = "select2-shipping_state-container")
    private WebElement selectState;
    @FindBy(css = ".select2-dropdown--below>span>input")
    private WebElement writeState;
    @FindBy(id = "shipping_postcode")
    private WebElement pinCode;
    @FindBy(css = "button[name='save_address']")
    private WebElement saveAddressButton;

    public void fillBillingAddress(String fName, String lName, String country, String address,
                                   String cityTown, String state, String pin, String phoneNumber) {
        firstName.sendKeys(fName);
        lastName.sendKeys(lName);
        selectCountry.click();
        writeCountry.sendKeys(country);
        writeCountry.sendKeys(Keys.ENTER);
        shippingAddress.sendKeys(address);
        city.sendKeys(cityTown);
        selectState.click();
        writeState.sendKeys(state);
        writeState.sendKeys(Keys.ENTER);
        pinCode.sendKeys(pin);
    }
    public void saveShippingAddress(){
        saveAddressButton.click();
    }
}
