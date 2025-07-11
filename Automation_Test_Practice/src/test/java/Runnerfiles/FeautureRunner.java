package Runnerfiles;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/featurefiles",
        glue = "Stepdefenitionfiles",
        tags = " @Test_Login",
        plugin = {"pretty", "html:target/cucumber-reports"}

)

public class FeautureRunner {

}
