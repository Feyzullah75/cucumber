package StepDefinitions.WebOrderStepDefination;

import Pages.WebOrderPage.LoginPage;
import Utils.ConfigReader;
import Utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class WebOrderLoginStepDefs<implement, You> {

    WebDriver driver= Driver.getDriver();
    LoginPage page = new LoginPage();

    @Given("The user navigate to the web orders page")
    public void the_user_navigate_to_the_web_orders_page() {

        System.out.println("navigated to web order page");

        driver.get(ConfigReader.getProperty("url"));

    }



    @When("The user provide the valid username")
    public void the_user_provide_the_valid_username() {

        System.out.println("The user sent tester");

        page.username.sendKeys(ConfigReader.getProperty("username"));

    }



    @When("The user provide the valid password")
    public void the_user_provide_the_valid_password() {

        System.out.println("The user sent test");

        page.password.sendKeys(ConfigReader.getProperty("password"));
        page.loginBtn.click();

    }



    @Then("The user should see home page")
    public void the_user_should_see_home_page() {

        System.out.println("The user validate home page");

        String expectedTitle = "Web Orders";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);


    }

    @When("the user provide username {string}")
    public void the_user_provide_username(String username) {

        page.username.sendKeys(username);

    }



    @When("the user provide password {string}")
    public void the_user_provide_password(String password) {

        page.password.sendKeys(password);
        page.loginBtn.click();

    }


    @Then("the user validate text {string}")
    public void the_user_validate_text(String expectedMessage) {

        String actualMessage=page.errorMessage.getText();
        Assert.assertEquals(actualMessage,expectedMessage);

    }

    @When("the user provide username {int}")
    public void the_user_provide_username(Integer username) {

        page.username.sendKeys(""+username);

    }

    @When("the user provide password {int}")
    public void the_user_provide_password(Integer password){

        page.password.sendKeys(password.toString());
        page.loginBtn.click();

    }

    @When("the user provide username {string} and password {string}")
    public void the_user_provide_username_and_password(String string, String string2) {

        page.username.sendKeys(string);
        page.password.sendKeys(string2);
        page.loginBtn.click();

    }



}
