package TestRunnerFile;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src//test//java//feature//features.feature"},
		glue={"StepDefinition"}) 

public class TestRunners {
	
	

}
