package stepDefinition;

import PageObjectModel.SignInPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.Driver;
import utilities.ReadPropertiesFile;

import java.util.concurrent.TimeUnit;

public class denemeStep {

    WebDriver driver;
    SignInPage sip = new SignInPage();

    @Given("^Go to mersys website$")
    public void go_to_mersys_website() throws Throwable {
        driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.get(ReadPropertiesFile.getData("URL"));
        driver.manage().timeouts().implicitlyWait( 20, TimeUnit.SECONDS );


    }

    @Given("^Type the username and password and click on login button$")
    public void type_the_username_and_password_and_click_on_login_button() throws Throwable {
        sip.typeIninputUserName();
        sip.typeIninputPassword();
        sip.clickOnbuttonLogin();

    }

    @Given("^Click on human resources on top$")
    public void click_on_human_resources_on_top() throws Throwable {

    }

    @Given("^Click on setup$")
    public void click_on_setup() throws Throwable {

    }

    @Given("^Click on position salary$")
    public void click_on_position_salary() throws Throwable {

    }

    @Given("^Click on plus icon$")
    public void click_on_plus_icon() throws Throwable {

    }

    @Given("^Type in new positions salary \"(.*?)\"$")
    public void type_in_new_positions_salary(String arg1) throws Throwable {

    }

    @When("^Click on save button$")
    public void click_on_save_button() throws Throwable {

    }

    @Then("^\"(.*?)\" should be displayed$")
    public void should_be_displayed(String arg1) throws Throwable {

    }

    @Then("^Remove the data \"(.*?)\"$")
    public void remove_the_data(String arg1) throws Throwable {

    }

    @Then("^Verify data is removed \"(.*?)\"$")
    public void verify_data_is_removed(String arg1) throws Throwable {

    }

}
