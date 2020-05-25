package org.example.StepDefinitionPackage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.PageObjectPackage.Homepage;
import org.example.PageObjectPackage.Resultpage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ResultpageSteps {
    public static WebDriver driver;
    Homepage homepage = new Homepage();
    Resultpage resultpage = new Resultpage();

    @When("^user clicks on all £(\\d+) products$")
    public void user_clicks_on_all_£_products(int arg1) throws Throwable {
        Thread.sleep(2000);
        resultpage.scrollpage();
        Thread.sleep(2000);
        resultpage.AllpoundProducts();
    }

    @Then("^user should be able to see all the £(\\d+) products on offer$")
    public void user_should_be_able_to_see_all_the_£_products_on_offer(int arg1) throws Throwable {
        Thread.sleep(3000);
        resultpage.homepageScreenShot1();
    }
}
