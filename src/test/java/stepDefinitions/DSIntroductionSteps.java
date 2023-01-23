package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PageObjectManager;
import utils.TestContextSetup;

public class DSIntroductionSteps {
	
	TestContextSetup context;
	PageObjectManager pageObjectManager;
	public DSIntroductionSteps(TestContextSetup context) {
		this.context=context;
	}
	@When("User clicks on Get started of DataStructure Introduction")
	public void user_clicks_on_get_started_of_data_structure_introduction() {
		context.pageObjectManager.getDSIntroPage().getStartedDSIntroClick();
		
	}

	@Then("User should see DataStructure Introduction")
	public void user_should_see_data_structure_introduction() {
		context.pageObjectManager.getDSIntroPage().dSIntroTitleDisplay();
	}

	@When("User clicks on Time Complexity in topics covered")
	public void user_clicks_on_time_complexity_in_topics_covered() {
		context.pageObjectManager.getDSIntroPage().timeComplexityLinkClick();
	}

	@Then("Time Complexity topic Try here should be visible")
	public void time_complexity_topic_try_here_should_be_visible() {
		context.pageObjectManager.getDSIntroPage().timeComplexityTryherevisibility();
	}

	@Then("User click Time Complexity  Try here")
	public void user_click_time_complexity_try_here() {
		context.pageObjectManager.getDSIntroPage().timeComplexityTryHere();
	}

	@Then("navigate back")
	public void navigate_back() {
		context.pageObjectManager.getDSIntroPage().naviagteFunction();
	}

	@Then("click on Signout")
	public void click_on_signout() {
		context.pageObjectManager.getDSIntroPage().signOutFunction();
		
	}


}
