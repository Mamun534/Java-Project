package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = {"src/features"},
		glue = {"StepDef"},
		plugin = {"pretty","html:target/cucumber-reports"},
		tags = {"@regression"}
		)

public class RegressionTest {

}
