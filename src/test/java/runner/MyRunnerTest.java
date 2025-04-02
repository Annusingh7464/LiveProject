package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		         features = "src/test/java/features",
		         glue={"stepDefinitions","hooks"},
		         publish = true,
		         plugin= {"pretty","html:target/cucumberReports/cucumber.html"}
		         
		         )
public class MyRunnerTest 
{
	

}
