package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\AutomationTest\\src\\test\\java\\Runner",
        glue={"steps"},
        plugin = {"json:target/cucumber.json"})
public class TestRunner {
}
