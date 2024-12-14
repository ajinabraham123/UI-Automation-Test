package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/features"},
        glue = {"steps"},
        plugin = {"pretty", "html:report/Report1.html"}
//        dryRun = true,
//        tags = "@P1"
//        name = {"Logo"}
)
public class TestRunner {
}
