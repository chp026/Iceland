package org.example.StepDefinitionPackage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.PageObjectPackage.Homepage;
import org.openqa.selenium.WebDriver;

public class HomepageSteps {
    public static WebDriver driver;
    Homepage homepage = new Homepage();

    @Given("^User is on Iceland homepage$")
    public void user_is_on_Iceland_homepage() throws Throwable {
        Thread.sleep(1000);
        homepage.homePageURL();
    }

    @When("^user checks main menu for special offers$")
    public void user_wants_to_check_their_delivery_postcode() throws Throwable {
        Thread.sleep(1000);
        homepage.Menu();
    }

    @And("^user checks for all the special offers$")
    public void user_enters_his_her_postcode_to_check_delivery_time() throws Throwable {
        Thread.sleep(1000);
        homepage.specialOffersMenu();
        Thread.sleep(1000);
        homepage.AllSpecialOffersMenu();
    }

    @Then("^user is on special offers webpage$")
    public void user_sees_all_the_available_delivery_slots() throws Throwable {
        Thread.sleep(1000);
        homepage.ResultPageURL();
        Thread.sleep(3000);
        homepage.homepageScreenShot();
    }

}
