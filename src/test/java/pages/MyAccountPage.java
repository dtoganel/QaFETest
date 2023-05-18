package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.security.Key;

public class MyAccountPage extends BasePage{
    public MyAccountPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "reg_username")
    private WebElement regUsername;
    @FindBy(id = "reg_email")
    private WebElement regEmailAddress;
    @FindBy(id = "reg_password")
    private WebElement regPassword;
    @FindBy(css = "button[name='register']")
    private WebElement registerButton;
    @FindBy(css = ".post-8>div>div>nav>ul>li:nth-child(6)")
    private WebElement logoutButton;
    @FindBy(css = ".post-8>div>div>nav>ul>li:nth-child(4)>a")
    private WebElement addressesButton;
    @FindBy(css = ".post-8>div>div>nav>ul>li:nth-child(5)>a")
    private WebElement accountDetailsButton;
    @FindBy(css = ".post-8>div>div>nav>ul>li:nth-child(2)>a")
    private WebElement ordersButton;
    @FindBy(id = "username")
    private WebElement username;
    @FindBy(id = "password")
    private WebElement password;
    @FindBy(css = "button[name='login']")
    private WebElement loginButton;


    public void fillRegister(String usn, String email, String pass){
        regUsername.sendKeys(usn);
        regEmailAddress.sendKeys(email);
        regPassword.sendKeys(pass);
        registerButton.click();
    }

    public void logOut(){
        logoutButton.click();
    }

    public void login(String usn, String pass){
        username.sendKeys(usn);
        password.sendKeys(pass);
        loginButton.click();
    }

    public void addressesClick(){
        addressesButton.click();
    }

    public void accountDetailsClick(){
        accountDetailsButton.click();
    }
    public void ordersClick(){
        ordersButton.click();
    }
}
