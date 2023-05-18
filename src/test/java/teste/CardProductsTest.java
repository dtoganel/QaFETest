package teste;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.*;
import webDriver.LogIn;
import webDriver.ShareData;

import java.util.concurrent.TimeUnit;

public class CardProductsTest extends ShareData {

    @FindBy(xpath = "//span[text() = 'Cart(3)']")
    private WebElement validateProducts;

    @Test
    public void addToCardTest(){

        LogIn logIn = new LogIn(webDriver);
        logIn.logAndNavigate();

        String validateShop = "https://shop.demoqa.com/shop/";
        Assert.assertEquals("Url is wrong", validateShop, webDriver.getCurrentUrl());

        ShopPage shopPage = new ShopPage(webDriver);
        shopPage.hoverOverFirstElement();
        shopPage.clickOnBlackDress();

        BlackCrossDressPage blackCrossDressPage = new BlackCrossDressPage(webDriver);
        blackCrossDressPage.selectSize();
        blackCrossDressPage.selectColour();
        blackCrossDressPage.addToCart();

        webDriver.navigate().to("https://shop.demoqa.com/shop/");
        shopPage.hoverOverSecondElement();
        shopPage.clickOnBlackLuxTShirt();
        BlackLuxTShirtPage blackLuxTShirtPage = new BlackLuxTShirtPage(webDriver);
        blackLuxTShirtPage.selectSize();
        blackLuxTShirtPage.selectColor();
        blackLuxTShirtPage.addToCart();

        webDriver.navigate().to("https://shop.demoqa.com/shop/");
        shopPage.hoverOverThirdElement();
        shopPage.clickOnBlackPointedShoes();
        BlackPointedShoesPage blackPointedShoesPage = new BlackPointedShoesPage(webDriver);
        blackPointedShoesPage.selectColor();
        blackPointedShoesPage.selectSize();
        blackPointedShoesPage.addToCart();

        IndexPage indexPage = new IndexPage(webDriver);
        indexPage.clickMyAccountButton();

        String validateMyAccount = "https://shop.demoqa.com/my-account/";
        Assert.assertEquals("Url is wrong", validateMyAccount, webDriver.getCurrentUrl());

        //String valiProd = "Cart(3)";
        //Assert.assertEquals("no products", valiProd, validateProducts.getTagName());

        indexPage.clickCheckoutButton();

        CheckoutPage checkoutPage = new CheckoutPage(webDriver);
        checkoutPage.checkTermsBox();
        checkoutPage.placeOrder();

        webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        indexPage.clickMyAccountButton();

        MyAccountPage myAccountPage = new MyAccountPage(webDriver);
        myAccountPage.ordersClick();


    }
}
