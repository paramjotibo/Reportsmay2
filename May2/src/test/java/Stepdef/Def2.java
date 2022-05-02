package Stepdef;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class Def2 {

    @Given("^user is on homage$")
    public void user_is_on_homage() throws Throwable {
      System.out.println("work done");
    }

    @When("^user click jomage$")
    public void user_click_jomage() throws Throwable {
    	 System.out.println("work not done");
    }

    @Then("^all pops up$")
    public void all_pops_up() throws Throwable {
    	 System.out.println("work will be  done");
    }
    @Then("^everything pops up$")
    public void everything_pops_up() throws Throwable {
     System.out.println("work not done");
    }

}
