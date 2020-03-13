package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/com.cucumber.features.IceHrm/ListOfMap.feature",
        glue = "StepDefinitions",
        dryRun = true,
        monochrome = true


)

public class IceHrmRunner {

}
