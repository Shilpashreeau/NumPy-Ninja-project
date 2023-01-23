package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PageObjectManager;
import utils.TestContextSetup;

public class TreeSteps {
	TestContextSetup context;
	PageObjectManager pageObjectManager;
	

	public TreeSteps(TestContextSetup context) {
		this.context=context;
		
	}

@When("User clicks on Get started of Tree")
public void user_clicks_on_get_started_of_tree() {
	context.pageObjectManager.getTreePage().getStartedTreeFunction();
}

@Then("User should see Tree Page screen")
public void user_should_see_tree_page_screen() {
	context.pageObjectManager.getTreePage().treeTitleDisplay();
}

@When("User clicks on Overview of Tree in topics covered")
public void user_clicks_on_overview_of_tree_in_topics_covered() {
	context.pageObjectManager.getTreePage().treeOverview();
}

@Then("Overview of Tree topic Try here should be visible")
public void overview_of_tree_topic_try_here_should_be_visible() {
	context.pageObjectManager.getTreePage().treeOverviewTRyhere();
}

@Then("User click that Overview of Tree Try here")
public void user_click_that_overview_of_tree_try_here() {
	context.pageObjectManager.getTreePage().treeOverviewTRyhereClick();
}

@When("User clicks on Terminologies in topics covered")
public void user_clicks_on_terminologies_in_topics_covered() {
	context.pageObjectManager.getTreePage().terminologiesFunction();
}

@Then("Terminologies topic Try here should be visible")
public void terminologies_topic_try_here_should_be_visible() {
	context.pageObjectManager.getTreePage().terminologiesTRyhere();
}

@Then("User click that Terminologies  Try here")
public void user_click_that_terminologies_try_here() {
	context.pageObjectManager.getTreePage().terminologiesTRyhereClick();
}

@When("User clicks on Types of trees in topics covered")
public void user_clicks_on_types_of_trees_in_topics_covered() {
	context.pageObjectManager.getTreePage().typesOfTreesFunction();
}

@Then("Types of trees topic Try here should be visible")
public void types_of_trees_topic_try_here_should_be_visible() {
	context.pageObjectManager.getTreePage().treetypesTRyhere();
}

@Then("User click that Types of trees  Try here")
public void user_click_that_types_of_trees_try_here() {
	context.pageObjectManager.getTreePage().treeTypesTRyhereClick();
}

@When("User clicks on Tree traversals in topics covered")
public void user_clicks_on_tree_traversals_in_topics_covered() {
	context.pageObjectManager.getTreePage().treeTraversalFunction();
}

@Then("Tree traversals topic Try here should be visible")
public void tree_traversals_topic_try_here_should_be_visible() {
	context.pageObjectManager.getTreePage().treeTraversalsTRyhere();
}

@Then("User click that Tree traversals  Try here")
public void user_click_that_tree_traversals_try_here() {
	context.pageObjectManager.getTreePage().treeTraversalTRyhereClick();
}

@When("User clicks on Binary trees in topics covered")
public void user_clicks_on_binary_trees_in_topics_covered() {
	context.pageObjectManager.getTreePage().binaryTreeFunction();
}

@Then("Binary trees topic Try here should be visible")
public void binary_trees_topic_try_here_should_be_visible() {
	context.pageObjectManager.getTreePage().binaryTreesTRyhere();
}

@Then("User click that Binary trees  Try here")
public void user_click_that_binary_trees_try_here() {
	context.pageObjectManager.getTreePage().binaryTreeTRyhereClick();
}

@When("User clicks on Binary search trees in topics covered")
public void user_clicks_on_binary_search_trees_in_topics_covered() {
	context.pageObjectManager.getTreePage().binarySearchTreeFunction();
}

@Then("Binary search trees topic Try here should be visible")
public void binary_search_trees_topic_try_here_should_be_visible() {
	context.pageObjectManager.getTreePage().binarySearchTreesTRyhere();
}

@Then("User click that Binary search trees  Try here")
public void user_click_that_binary_search_trees_try_here() {
	context.pageObjectManager.getTreePage().binarySearchTreeTRyhereClick();

}

}
