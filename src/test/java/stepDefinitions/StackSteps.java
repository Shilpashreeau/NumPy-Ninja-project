package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PageObjectManager;
import utils.TestContextSetup;

public class StackSteps {
	TestContextSetup context;
	PageObjectManager pageObjectManager;
	

	public StackSteps(TestContextSetup context) {
		this.context=context;
		
	}
	@When("User clicks on Get started of Stack")
	public void user_clicks_on_get_started_of_stack() {
		context.pageObjectManager.getStackPage().getStartedStackFunction();
	   
	}

	@Then("User should see Stack Page screen")
	public void user_should_see_stack_screen() {
		context.pageObjectManager.getStackPage().stackTitleDisplay();
	}

	@When("User clicks on Operations in Stack in topics covered")
	public void user_clicks_on_operations_in_stack_in_topics_covered() {
		context.pageObjectManager.getStackPage().operationStack();
	}

	@Then("Operations in Stack topic Try here should be visible")
	public void operations_in_stack_topic_try_here_should_be_visible() {
		context.pageObjectManager.getStackPage().operationStackTRyhere();
	}

	@Then("User click that Operations in Stack Try here")
	public void user_click_that_operations_in_stack_page_try_here() {
		context.pageObjectManager.getStackPage().operationStackTRyhereClick();
	}

	@When("User clicks on Implementation in Stack in topics covered")
	public void user_clicks_on_implementation_in_topics_covered() {
		context.pageObjectManager.getStackPage().implementationStack();
	}

	@Then("Implementation in Stack topic Try here should be visible")
	public void implementation_topic_try_here_should_be_visible() {
		context.pageObjectManager.getStackPage().implementationStackTRyhere();
	}

	@Then("User click that Implementation in Stack Try here")
	public void user_click_that_implementation_page_try_here() {
		context.pageObjectManager.getStackPage().implementationStackTRyhereClick();
		
	}

	@When("User clicks on Applications in Stack in topics covered")
	public void user_clicks_on_applications_in_topics_covered() {
		context.pageObjectManager.getStackPage().applicationStack();
	}

	@Then("Applications in Stack topic Try here should be visible")
	public void applications_topic_try_here_should_be_visible() {
		context.pageObjectManager.getStackPage().applicationStackTRyhere();
	}

	@Then("User click that Applications in Stack Try here")
	public void user_click_that_applications_page_try_here() {
		context.pageObjectManager.getStackPage().applicationStackTRyhereClick();
	}

}
