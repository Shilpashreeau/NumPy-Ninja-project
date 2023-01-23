package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PageObjectManager;
import utils.TestContextSetup;

public class GraphSteps {
	TestContextSetup context;
	PageObjectManager pageObjectManager;
	

	public GraphSteps(TestContextSetup context) {
		this.context=context;
		
	}

@Given("User clicks Get Started")
public void user_clicks_get_started() {
	
	context.pageObjectManager.getGraphPage().getStartedFunction();
	
}

@When("User clicks on sign in button")
public void user_clicks_on_sign_in_button() {
	context.pageObjectManager.getGraphPage().signInFunction();
	
}

@Then("User should see login screen")
public void user_should_see_login_screen() {
	context.pageObjectManager.getGraphPage().isSignInPageDisplayed();
   
}

@When("User enters username as {string} and password as {string}")
public void user_enters_username_as_and_password_as(String string, String string2) {
	context.pageObjectManager.getGraphPage().loginFunctionusingUSerNamePwd(string,string2);
}

@When("click Login button")
public void click_login_button() {
	context.pageObjectManager.getGraphPage().clickLogin();
}

@Then("User should see {string} msg")
public void user_should_see_msg(String string) {
	context.pageObjectManager.getGraphPage().isLoginMsgDisplayed(string);
}

@When("User clicks on Get started of Graph")
public void user_clicks_on_get_started_of_graph() {
	context.pageObjectManager.getGraphPage().graphGetStaertedBtnclick();
}

@Then("User should see Graph Page screen")
public void user_should_see_graph_page_screen() {
	context.pageObjectManager.getGraphPage().graphTitleVisibility();
}

@When("User clicks on Graph in topics covered")
public void user_clicks_on_graph_in_topics_covered() {
	context.pageObjectManager.getGraphPage().graphTopicClickFunction();
}

@Then("Graph topic Try here should be visible")
public void graph_topic_try_here_should_be_visible() {
	context.pageObjectManager.getGraphPage().tryHereIsVisible();
}

@Then("User click that Try here")
public void user_click_that_try_here() {
	context.pageObjectManager.getGraphPage().tryHereBtnClick();
}

@Then("User should see tryEditor page")
public void user_should_see_try_editor_page() {
	context.pageObjectManager.getGraphPage().editorBoxDisplay();
}

@Then("enters following code in editor")
public void enters_following_code_in_editor(io.cucumber.datatable.DataTable dataTable) {
	context.pageObjectManager.getGraphPage().inputCodeInEditor(dataTable);
}

@Then("clicks Run")
public void clicks_run() {
	context.pageObjectManager.getGraphPage().runPgm();
}

@When("User clicks on Graph Representations in topics covered")
public void user_clicks_on_graph_representations_in_topics_covered() {
	context.pageObjectManager.getGraphPage().graphRepTopicClickFunction();
}

@Then("Graph Representation topic Try here should be visible")
public void graph_representation_topic_try_here_should_be_visible() {
	context.pageObjectManager.getGraphPage().graphRepTryhereVisibility();
}

@Then("User click that Graph Representation Try here")
public void user_click_that_graph_representation_try_here() {
	context.pageObjectManager.getGraphPage().graphRepTryHereClick();
}

}
