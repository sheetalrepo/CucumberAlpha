package parallel;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = { "pretty", "html:target/cucumber", "summary","json:target/cucumber/report.json" },
		strict = true, 
		monochrome = true, 
		features = { "classpath:parallel" },
		glue = {"classpath:parallel"}
 )

public class RunCucumberTest {}