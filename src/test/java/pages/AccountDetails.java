package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountDetails extends BasePage{
    public AccountDetails(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "account_first_name")
    private WebElement firstName;
    @FindBy(id = "account_last_name")
    private WebElement lastName;
    @FindBy(css = "button[name='save_account_details']")
    private WebElement saveButton;

    public void fillRestOfFields(String fName, String lName){
        firstName.sendKeys(fName);
        lastName.sendKeys(lName);
    }

    public void saveAccountDetails(){
        saveButton.click();
    }
}
