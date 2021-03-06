package StepDefinitions.AutomationStepDefinition;

import Pages.StorePage.HomePage;
import Utils.ConfigReader;
import Utils.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.util.Map;

public class PracticeSteps {

    WebDriver driver = Driver.getDriver();
    HomePage homePage = new HomePage();



    @Then("the user navigate to automation practice website")
    public void the_user_navigate_to_automation_practice_website() {
        driver.get(ConfigReader.getProperty("shoppingUrl"));
    }
    @Then("the user search with value {string}")
    public void the_user_search_with_value(String string) {

        homePage.searchBox.sendKeys(string);
        homePage.searchButton.click();
    }
    @Then("the user validate the of the page {string}")
    public void the_user_validate_the_of_the_page(String expectedTitle) {
        String actualTitle=driver.getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }
    @Then("the user validate search value {string}")
    public void the_user_validate_search_value(String expectedSearch) {
        String actualSearchValue = homePage.searchResult.getText().toLowerCase();
        Assert.assertEquals(expectedSearch.toLowerCase(),actualSearchValue);

    }
    @Then("the user validate the of the page")
    public void the_user_validate_the_of_the_page(Map<String,String> titles) {
        String expectedTitle= titles.get("Title");
        String actualTitle= driver.getTitle();

        Assert.assertEquals(expectedTitle,actualTitle);

    }

    @Then("the user search with doc types")
    public void the_user_search_with_doc_types(String docString) {
        homePage.searchBox.sendKeys(docString);
    }

}

