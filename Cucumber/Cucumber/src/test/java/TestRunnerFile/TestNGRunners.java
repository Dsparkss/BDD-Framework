package TestRunnerFile;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@Test
@CucumberOptions(
		features = "src/test/java/feature",
		glue = "StepDefinition")

public class TestNGRunners extends AbstractTestNGCucumberTests {

}
