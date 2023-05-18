package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ShopPage extends BasePage{
    public ShopPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[text() = 'Black Cross Back Maxi Dress']")
    private WebElement blackCrossDress;
    @FindBy(css = "a[data-product-id='1162']")
    private WebElement addToWishlistDress;
    @FindBy(xpath = "//a[text() = 'black lux graphic t-shirt']")
    private WebElement blackLuxTShirt;
    @FindBy(css = "a[data-product-id='1485']")
    private WebElement addToWishlistTShirt;
    @FindBy(xpath = "//a[text() = 'black pointed toe barely there patent heels']")
    private WebElement blackPointedShoes;
    @FindBy(css = "a[data-product-id='1281']")
    private WebElement addToWishlistShoes;
    Actions moveMouse = new Actions(driver);

    public void hoverOverFirstElement(){
        moveMouse.moveToElement(blackCrossDress).perform();
    }
    public void hoverOverSecondElement(){
        moveMouse.moveToElement(blackLuxTShirt).perform();
    }
    public void hoverOverThirdElement(){
        moveMouse.moveToElement(blackPointedShoes).perform();
    }
    public void clickOnBlackDress(){
        blackCrossDress.click();
    }
    public void clickOnBlackLuxTShirt(){
        blackLuxTShirt.click();
    }
    public void clickOnBlackPointedShoes(){
        blackPointedShoes.click();
    }

    public void addFirstElementToWishlist(){
        moveMouse.moveToElement(addToWishlistDress).perform();
        addToWishlistDress.click();
    }
    public void addSecondElementToWishList(){
        moveMouse.moveToElement(addToWishlistTShirt).perform();
        addToWishlistTShirt.click();
    }
    public void addThirdElementToWishList(){
        moveMouse.moveToElement(addToWishlistShoes).perform();
        addToWishlistShoes.click();
    }
}
