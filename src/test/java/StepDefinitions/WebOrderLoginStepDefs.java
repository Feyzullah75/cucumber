package StepDefinitions;

import Pages.LoginPage;
import Utils.ConfigReader;
import Utils.Driver;
import com.google.gson.JsonObject;
import io.cucumber.core.gherkin.Step;
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
}
