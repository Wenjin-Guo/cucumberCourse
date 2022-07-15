package testRunners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/FeatureFiles"},
        glue = {"stepDefinitions"},
        //tags = "@RegularTest",
        plugin = {"pretty","junit:target/reports/cucumber.xml",
                "json:target/reports/cucumber.json","html:target/reports"
        },
        monochrome = true
        //plugin = {"pretty","html:target/reports"}
        //plugin = {"pretty","json:target/reports/cucumber.json"}
        //plugin = {"pretty","junit:target/reports/cucumber.xml"}
)
public class MenuManagementTest {
}
