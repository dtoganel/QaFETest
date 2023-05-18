package webDriver;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.IndexPage;
import pages.MyAccountPage;
import webDriver.ShareData;

public class LogIn extends BasePage {
    public LogIn(WebDriver driver) {
        super(driver);
    }

    @Test
    public void logAndNavigate(){
        IndexPage indexPage = new IndexPage(driver);
        indexPage.clickDismiss();
        indexPage.clickMyAccountButton();

        MyAccountPage myAccountPage = new MyAccountPage(driver);
        myAccountPage.login("Marco", "abc23DE32dfwe");
        myAccountPage.addressesClick();


        driver.navigate().to("https://shop.demoqa.com/shop/");
    }
}
