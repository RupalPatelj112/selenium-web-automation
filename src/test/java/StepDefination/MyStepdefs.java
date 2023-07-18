package StepDefination;

import PageClass.AbstractSteps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class MyStepdefs{

    AbstractSteps abs = new AbstractSteps();

    @Given("^Launch the google web page$")
    public void launch_the_google_web_page() throws Throwable {
        Thread.sleep(200);
        abs.clickAcceptAll();
    }
    @When("^I search for ([^\"]*)$")
    public void iSearchForListOfCloudPlatform (String str) throws InterruptedException{
        Thread.sleep(300);
        abs.getSearchbar(str);
    }

    @And("^It landing into that page$")
    public void itLandingIntoThatPage() {
    }

    @Then("^I click on view at aws button$")
    public void iClickOnViewAtAwsButton() {
    }
}
