package StepDefinations;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/src/test/resources/Features",
        glue={"StepDefinations"},
        tags = "@test"
)
public class TestRunner {
}
