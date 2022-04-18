package StepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",
glue={"StepDefinition"},strict=true,monochrome=false,
plugin= {"pretty","html:target/htmlreports","json:target/jsonreports/jsonreports.json",
		"junit:target/junitreports/junitreports.xml"})

public class TestRunner2 {

}
