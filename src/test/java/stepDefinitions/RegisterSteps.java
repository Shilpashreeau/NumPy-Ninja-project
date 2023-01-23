package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PageObjectManager;
import utils.TestContextSetup;

public class RegisterSteps {
	TestContextSetup context;
	PageObjectManager pageObjectManager;
	
	public RegisterSteps(TestContextSetup context) {
		this.context=context;
		
	}
	@When("User should see Register button in home page and clicks Register")
	public void user_should_see_register_button_in_home_page_and_clicks_register() {
	    context.pageObjectManager.getRegisterPage().homeRegisterbtnFunction();
	}

	@Then("User should navigate to Register page")
	public void user_should_navigate_to_register_page() {
		context.pageObjectManager.getRegisterPage().registerRegisterbtnFunction();
	}

/*	@When("^User enters \"([^\"]*) \"([^\"]*) \"([^\"]*)$")
	public void user_enters(String username,String password,String confirm_password) {
		context.pageObjectManager.getRegisterPage().userCredential(username,password,confirm_password);
	}
	

	@Then("User should see \"([^\"]*)")
	public void user_should_see(String status_message ) {
		context.pageObjectManager.getRegisterPage().statusMSgDisplay(status_message);
	}*/

	@When("User enters {string} {string} {string}")
	public void user_enters(String string, String string2, String string3) {
		
		context.pageObjectManager.getRegisterPage().userCredential(string,string2,string3);
	}
	@When("User clicks on Register button")
	public void user_clicks_on_register_button() {
		context.pageObjectManager.getRegisterPage().clickOnRegister();
	}

	@Then("User should see {string}")
	public void user_should_see(String string) {
		
		context.pageObjectManager.getRegisterPage().statusMSgDisplay(string);
		
	}

	
}