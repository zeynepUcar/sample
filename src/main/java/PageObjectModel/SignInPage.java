package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.ReadPropertiesFile;

public class SignInPage extends BasePage{

    private WebDriver driver;

    public SignInPage(){
        driver = Driver.getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath="//input[@placeholder='Username']")
    private WebElement inputUserName;

    @FindBy(xpath="//input[@placeholder='Password']")
    private WebElement inputPassword;

    @FindBy(xpath="//button[@aria-label='LOGIN']")
    private WebElement buttonLogin;

    public void typeIninputUserName() {
        sendKeysFunction(inputUserName,  ReadPropertiesFile.getData("Username"));


    }

    public void typeIninputPassword() {
        sendKeysFunction(inputPassword,ReadPropertiesFile.getData("Password"));

    }

    public void clickOnbuttonLogin() {
        clickFunction(buttonLogin);
    }
}



