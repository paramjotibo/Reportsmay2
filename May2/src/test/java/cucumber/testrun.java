package cucumber;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@cucumber.api.CucumberOptions
( features="src/test/java/Feature/login.feature", glue="Stepdef",
plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)

public class testrun {

}
