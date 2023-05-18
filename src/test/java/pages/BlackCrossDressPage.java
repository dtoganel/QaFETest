package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class BlackCrossDressPage extends BasePage{
    public BlackCrossDressPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "pa_color")
    private WebElement colour;
    @FindBy(id = "pa_size")
    private WebElement size;
    @FindBy(xpath = "//button[text() = 'Add to cart']")
    private WebElement addToCartButton;

    public void selectColour(){
        Select select = new Select(colour);
        select.selectByIndex(2);
    }
    public void selectSize(){
        Select select = new Select(size);
        select.selectByIndex(3);
    }
    public void addToCart(){
        addToCartButton.click();
    }
}
