package StepDefinition;

import org.testng.Assert;


import Browser.browser;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Url {
	@Given("open the browser")
	public void open_the_browser() {
	  browser.setDriver();

	}

	@When("enter the {string}")
	public void enter_the(String string) {
		browser.getURL(string);
	   
	}

	@Then("Page is displayed")
	public void page_is_displayed() {
		
	    browser.display();
	    browser.closeBrowser();
	}


}
