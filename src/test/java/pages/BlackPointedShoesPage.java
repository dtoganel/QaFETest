package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class BlackPointedShoesPage extends BasePage{
    public BlackPointedShoesPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "pa_color")
    private WebElement color;
    @FindBy(id = "pa_size")
    private WebElement size;
    @FindBy(xpath = "//button[text() = 'Add to cart']")
    private WebElement addToCartButton;

    public void selectColor(){
        Select select = new Select(color);
        select.selectByIndex(1);
    }
    public void selectSize(){
        Select select = new Select(size);
        select.selectByIndex(1);
    }
    public void addToCart(){
        addToCartButton.click();
    }
}
