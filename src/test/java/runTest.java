import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/project/features",
        plugin = {"pretty", "html:target/cucumber-html-report:"},
        strict = true)
public class runTest {
}
