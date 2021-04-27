package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = {"src/Features"},
		glue = {"StepDef"},
		plugin = {"pretty","html:target/cucumber-reports"},
		
		//Before add this tag this is regression 
		// after i add the tag here.
		//i have to add same @smoke annotation in the feature file
		// which one i want define @smoke or @uat testing 
		tags = {"@smoke"} 
		
		)

public class RegressionTest {

}
