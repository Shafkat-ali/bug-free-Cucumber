package cukeRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	    features = "src/test/resources/featureFiles",
		glue = "stepDefinitions",
		plugin = {"pretty", "html:target/cucumber-reports.html"},
		monochrome = true,
		dryRun = true,
		tags = "@fixingThis"
	)


public class SmokeRunner {

}
