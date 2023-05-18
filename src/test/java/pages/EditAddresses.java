package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditAddresses extends BasePage{
    public EditAddresses(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = ".woocommerce-Address>header>a")
    private WebElement billingAddressAdd;
    @FindBy(css = ".col-2>header>a")
    private WebElement shippingAddressButton;

    public void clickBillingAddress(){
        billingAddressAdd.click();
    }

    public void clickShippingAddress(){
        shippingAddressButton.click();
    }
}
