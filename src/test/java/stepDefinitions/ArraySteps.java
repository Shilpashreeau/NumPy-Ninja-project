package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PageObjectManager;
import utils.TestContextSetup;

public class ArraySteps {
	TestContextSetup context;
	PageObjectManager pageObjectManager;
	public ArraySteps(TestContextSetup context) {
		this.context=context;
	}
	@When("User clicks on Get started of Array")
	public void user_clicks_on_get_started_of_array() {
		context.pageObjectManager.getArrayPage().getStartedArrayFunction();
	}

	@Then("User should see Array Page screen")
	public void user_should_see_array_page_screen() {
		context.pageObjectManager.getArrayPage().arrayTitleDisplay();
	}

	@When("User clicks on Arrays in Python in topics covered")
	public void user_clicks_on_arrays_in_python_in_topics_covered() {
		context.pageObjectManager.getArrayPage().arrayInPython();
	}

	@Then("Arrays in Python topic Try here should be visible")
	public void arrays_in_python_topic_try_here_should_be_visible() {
		context.pageObjectManager.getArrayPage().operationStackTRyhere();
	}

	@Then("User click that Arrays in Python Try here")
	public void user_click_that_arrays_in_python_try_here() {
		context.pageObjectManager.getArrayPage().operationStackTRyhereClick();
	}

	@When("User clicks on Arrays using list in topics covered")
	public void user_clicks_on_arrays_using_list_in_topics_covered() {
		context.pageObjectManager.getArrayPage().arrayUsingListPython();
	}

	@Then("Arrays using list topic Try here should be visible")
	public void arrays_using_list_topic_try_here_should_be_visible() {
		context.pageObjectManager.getArrayPage().arrayListTRyhere();
	}

	@Then("User click that Arrays using lists Try here")
	public void user_click_that_arrays_using_lists_try_here() {
		context.pageObjectManager.getArrayPage().arrayListTRyhereClick();
	}

	@When("User clicks on Basic Operations in list in topics covered")
	public void user_clicks_on_basic_operations_in_list_in_topics_covered() {
		context.pageObjectManager.getArrayPage().basicOPerationArray();
	}

	@Then("Operations in list topic Try here should be visible")
	public void operations_in_list_topic_try_here_should_be_visible() {
		context.pageObjectManager.getArrayPage().arrayOperationTRyhere();
	}

	@Then("User click that Operations in listTry here")
	public void user_click_that_operations_in_list_try_here() {
		context.pageObjectManager.getArrayPage().arrayOperationTRyhereClick();
	}

	@When("User clicks on Applications of array in topics covered")
	public void user_clicks_on_applications_of_array_in_topics_covered() {
		context.pageObjectManager.getArrayPage().applicationOfArray() ;
	}

	@Then("Applications of array topic Try here should be visible")
	public void applications_of_array_topic_try_here_should_be_visible() {
		context.pageObjectManager.getArrayPage().applicationOfArrayTRyhere();
	}

	@Then("User click that Applications of array in listTry here")
	public void user_click_that_applications_of_array_in_list_try_here() {
		context.pageObjectManager.getArrayPage().applicationOfArrayTRyhereClick();
	}

}
