import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        features = {"C:/Users/shava/eclipse-workspace/ReviewSessionsCode/src/test/resources/features/EtsySearch5.feature"},
        plugin = {"json:C:/Users/shava/eclipse-workspace/ReviewSessionsCode/target/cucumber-parallel/5.json"},
        monochrome = false,
        tags = {},
        glue = {"stepdefs"})
public class Parallel05IT {
}
