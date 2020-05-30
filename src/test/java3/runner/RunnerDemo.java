package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java3/feature/",

        dryRun = false,
        glue = "stepdefinitions" )

public class RunnerDemo {
}
