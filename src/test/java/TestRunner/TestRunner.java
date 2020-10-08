package TestRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {
                "src/main/java/features/practice.feature"
        },
        glue= {"StepDefinitions"},
        monochrome = true,
        plugin = {
                "pretty",
                "io.qameta.allure.cucumber4jvm.AllureCucumber4Jvm"
        },
        strict = true)
public class TestRunner
{

}
