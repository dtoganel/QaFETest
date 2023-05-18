package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IndexPage extends BasePage{
    public IndexPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = ".demo_store>a")
    private WebElement dismissButton;
    @FindBy(css = ".noo-topbar-right>li:nth-child(2)>a")
    private WebElement myAccountButton;
    @FindBy(xpath = "//a[text() = 'My Wishlist']")
    private WebElement myWishlistButton;
    @FindBy(xpath = "//a[text() = 'Checkout']")
    private WebElement checkoutButton;

    public void clickToMyWishlist(){
        myWishlistButton.click();
    }
    public void clickDismiss(){
        dismissButton.click();
    }
    public void clickMyAccountButton(){
        myAccountButton.click();
    }
    public void clickCheckoutButton(){
        checkoutButton.click();
    }
}
