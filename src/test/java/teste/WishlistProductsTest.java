package teste;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.IndexPage;
import pages.ShopPage;
import webDriver.LogIn;
import webDriver.ShareData;

import static net.bytebuddy.matcher.ElementMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class WishlistProductsTest extends ShareData {

    @FindBy(css = "a[href=\"https://shop.demoqa.com/product/black-pointed-toe-barely-there-patent-heels/\"]>img")
    private WebElement areShoesInWishlist;

    @Test
    public void test(){
        LogIn logIn = new LogIn(webDriver);
        logIn.logAndNavigate();

        String validateShop = "https://shop.demoqa.com/shop/";
        Assert.assertEquals("Url is wrong", validateShop, webDriver.getCurrentUrl());

        ShopPage shopPage = new ShopPage(webDriver);
        shopPage.hoverOverFirstElement();
        shopPage.addFirstElementToWishlist();

        shopPage.hoverOverSecondElement();
        shopPage.addSecondElementToWishList();

        shopPage.hoverOverThirdElement();
        shopPage.addThirdElementToWishList();

        IndexPage indexPage = new IndexPage(webDriver);

        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("window.scrollBy(0,-250)", "");
        
        indexPage.clickToMyWishlist();

        String validateWishlist = "https://shop.demoqa.com/wishlist/";
        Assert.assertEquals("Url is wrong", validateWishlist, webDriver.getCurrentUrl());

        //Assert.assertTrue(areShoesInWishlist.isDisplayed()); //Cum ar trebui sa validam?
    }
}
