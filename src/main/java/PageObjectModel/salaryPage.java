package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class salaryPage {

    private WebDriver driver;

    public salaryPage(){
        driver = Driver.getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "fuse-navigation .group-items > .nav-item:nth-child(4)")
    private WebElement dropDownHumanResources;

    @FindBy(xpath = "(//span[contains(text(),'Setup')])[4]")
    private WebElement dropDownSetup;



}
