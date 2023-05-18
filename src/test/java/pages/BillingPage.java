package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BillingPage extends BasePage{
    public BillingPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "billing_first_name")
    private WebElement firstName;
    @FindBy(id = "billing_last_name")
    private WebElement lastName;
    @FindBy(id = "select2-billing_country-container")
    private WebElement selectCountry;
    @FindBy(css = ".select2-search--dropdown>input")
    private WebElement writeCountry;
    @FindBy(id = "billing_address_1")
    private WebElement billingAdress;
    @FindBy(id = "billing_city")
    private WebElement city;
    @FindBy(id = "select2-billing_state-container")
    private WebElement selectState;
    @FindBy(css = ".select2-search--dropdown>input")
    private WebElement writeState;
    @FindBy(id = "billing_postcode")
    private WebElement pinCode;
    @FindBy(id = "billing_phone")
    private WebElement phone;
    @FindBy(css = "button[name='save_address']")
    private WebElement saveAddressButton;

    public void fillBillingAddress(String fName, String lName, String country, String address,
                                   String cityTown, String state, String pin, String phoneNumber){
        firstName.sendKeys(fName);
        lastName.sendKeys(lName);
        selectCountry.click();
        writeCountry.sendKeys(country);
        writeCountry.sendKeys(Keys.ENTER);
        billingAdress.sendKeys(address);
        city.sendKeys(cityTown);
        selectState.click();
        writeState.sendKeys(state);
        writeState.sendKeys(Keys.ENTER);
        pinCode.sendKeys(pin);
        phone.sendKeys(phoneNumber);
    }
    public void saveBillingAddresses(){
        saveAddressButton.click();
    }
}
