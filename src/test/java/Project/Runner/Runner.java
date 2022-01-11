package Project.Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/resources/FeatureFiles", glue = "Project/StepDef",
tags = "@test", plugin = { "pretty", "html:target/cucumber-reports.html" })
public class Runner {
}
