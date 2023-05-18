package teste;

import com.beust.ah.A;
import org.junit.Assert;
import org.junit.Test;
import pages.*;
import webDriver.ShareData;

public class CreateLoginAccountTest extends ShareData {

    @Test
    public void testLogin(){
        IndexPage indexPage = new IndexPage(webDriver);
        indexPage.clickDismiss();
        indexPage.clickMyAccountButton();

        String validateMyAccount = "https://shop.demoqa.com/my-account/";
        Assert.assertEquals("Url is wrong", validateMyAccount, webDriver.getCurrentUrl());

        EditAddresses editAddresses = new EditAddresses(webDriver);

        MyAccountPage myAccountPage = new MyAccountPage(webDriver);
        //myAccountPage.fillRegister("marco", "marco@gmail.com", "asc32dSa1423");
        //myAccountPage.logOut();
        myAccountPage.login("Marco", "abc23DE32dfwe");
        myAccountPage.addressesClick();
        //editAddresses.clickBillingAddress();

        BillingPage billingPage = new BillingPage(webDriver);
        //billingPage.fillBillingAddress("marco", "maul", "United States", "carol 11",
        //       "New York", "California", "12134", "0320392394");
        //billingPage.saveBillingAddresses();

        editAddresses.clickShippingAddress();

        ShippingPage shippingPage = new ShippingPage(webDriver);
        shippingPage.fillBillingAddress("marco", "ma", "United States", "caro 11",
                "New York", "California", "12552", "930551632");
        shippingPage.saveShippingAddress();

        myAccountPage.accountDetailsClick();

        AccountDetails accountDetails = new AccountDetails(webDriver);
        accountDetails.fillRestOfFields("marco", "ma");
        accountDetails.saveAccountDetails();
    }
}
