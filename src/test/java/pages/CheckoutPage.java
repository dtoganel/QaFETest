package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage{
    public CheckoutPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "terms")
    private WebElement termsCheckbox;
    @FindBy(id = "place_order")
    private WebElement placeOrderButton;

    public void checkTermsBox(){
        Actions moveMouse = new Actions(driver);
        moveMouse.moveToElement(termsCheckbox).perform();
        termsCheckbox.click();
    }

    public void placeOrder(){
        placeOrderButton.click();
    }
}
