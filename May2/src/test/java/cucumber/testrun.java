package cucumber;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@cucumber.api.CucumberOptions
( features="src/test/java/Feature/login.feature", glue="Stepdef")


public class testrun {

}
