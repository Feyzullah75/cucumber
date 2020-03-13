package StepDefinitions.IceHrmStepDefinition;

import Pages.IceHrm.IceHrmHomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class QualificationSteps {

    IceHrmHomePage iceHrmHomePage=new IceHrmHomePage();

    @Given("the user click qualification setup button")
    public void the_user_click_qualification_setup_button() {

        iceHrmHomePage.qualificationButton.click();

    }



    @Then("the user click education tab")
    public void the_user_click_education_tab() {

        iceHrmHomePage.educationButton.click();


    }
    @Then("the user validate personal info displayed")
    public void the_user_validate_personal_info_displayed(io.cucumber.datatable.DataTable dataTable) {

        Map<String, String> expectedPersonInfo=dataTable.asMap(String.class, String.class);
        Map<String, String> actualPersonInfo=iceHrmHomePage.getQualificationInfo(iceHrmHomePage.personalInfoNames, iceHrmHomePage.personalInfoValues);
        Set<String> keys=expectedPersonInfo.keySet();

        for (String key : keys){
            Assert.assertEquals(expectedPersonInfo.get(key), actualPersonInfo.get(key));
        }
    }

    @Given("the user click project client setup button")
    public void the_user_click_project_client_setup_button() {

        iceHrmHomePage.projectsClientSetupButton.click();


    }


    @Then("the user validate client info")
    public void the_user_validate_client_info(io.cucumber.datatable.DataTable dataTable) {
        List<String> strings=dataTable.asList();
        List<WebElement> webElements =iceHrmHomePage.adresses;
        for (int i=0;i<strings.size();i++ ){
            System.out.println(strings.get(i));
        }
    }


}
