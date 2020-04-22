package automationPractice.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/resources/features",
        glue= "automationPractice/Step_definitions",
        dryRun = true,
        tags = "@"
)
public class Run {


}
