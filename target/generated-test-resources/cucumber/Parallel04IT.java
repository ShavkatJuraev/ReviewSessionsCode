import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        features = {"C:/Users/shava/eclipse-workspace/ReviewSessionsCode/src/test/resources/features/EtsySearch4.feature"},
        plugin = {"json:C:/Users/shava/eclipse-workspace/ReviewSessionsCode/target/cucumber-parallel/4.json"},
        monochrome = false,
        tags = {},
        glue = {"stepdefs"})
public class Parallel04IT {
}
