package Runner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/java/Features", // path to your feature files
    glue = "StepDefinition", // package name of your step definitions
    tags ="@Register_Page",
    plugin = {
        "pretty",
        "html:target/cucumber-reports.html",
        "json:target/cucumber.json"
    },
    monochrome = true
)

public class TestRunner {

}
