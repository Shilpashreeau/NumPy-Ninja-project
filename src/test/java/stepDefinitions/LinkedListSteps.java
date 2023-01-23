package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PageObjectManager;
import utils.TestContextSetup;

public class LinkedListSteps {
	TestContextSetup context;
	PageObjectManager pageObjectManager;
	

	public LinkedListSteps(TestContextSetup context) {
		this.context=context;
		
	}

	@When("User clicks on Get started of Linked List")
	public void user_clicks_on_get_started_of_linked_list() {
		context.pageObjectManager.getLinkedListPage().linkedListGetStartedFunction();
	    
	}

	@Then("User should see Linked List screen")
	public void user_should_see_linked_list_screen() {
		context.pageObjectManager.getLinkedListPage().linkedListTitleDisplay();
	}

	@When("User clicks on Introduction in topics covered")
	public void user_clicks_on_introduction_in_topics_covered() {
		context.pageObjectManager.getLinkedListPage().linkedlistintroductionFunction();
	}

	@Then("Introduction topic Try here should be visible")
	public void introduction_topic_try_here_should_be_visible() {
		context.pageObjectManager.getLinkedListPage().introductionTryhere();
	}

	@Then("User click that Introduction page Try here")
	public void user_click_that_introduction_page_try_here() {
		context.pageObjectManager.getLinkedListPage().introductionTryhereClickFunction();
	}

	@When("User clicks on Creating linked list in topics covered")
	public void user_clicks_on_creating_linked_list_in_topics_covered() {
		context.pageObjectManager.getLinkedListPage().creatingLinkedlistFunction();
	}

	@Then("Creating linked list topic Try here should be visible")
	public void creating_linked_list_topic_try_here_should_be_visible() {
		context.pageObjectManager.getLinkedListPage().creatingLLTryhere();
	}

	@Then("User click that Creating linked list Try here")
	public void user_click_that_creating_linked_list_try_here() {
		context.pageObjectManager.getLinkedListPage().creatingLLTryhereClickFunction();
	}

	@When("User clicks on Types of linked list in topics covered")
	public void user_clicks_on_types_of_linked_list_in_topics_covered() {
		context.pageObjectManager.getLinkedListPage().typesOfLLFunction() ;
	}

	@Then("Types of linked list topic Try here should be visible")
	public void types_of_linked_list_topic_try_here_should_be_visible() {
		context.pageObjectManager.getLinkedListPage().typesOfLLTryhere();
	}

	@Then("User click that Types of linked list Try here")
	public void user_click_that_types_of_linked_list_try_here() {
		context.pageObjectManager.getLinkedListPage().typesOfLLTryhereClickFunction();
	}

	@When("User clicks on Implement linked list in python in topics covered")
	public void user_clicks_on_implement_linked_list_in_python_in_topics_covered() {
		context.pageObjectManager.getLinkedListPage().implementLLFunction();
	}

	@Then("Implement linked list in python topic Try here should be visible")
	public void implement_linked_list_in_python_topic_try_here_should_be_visible() {
		context.pageObjectManager.getLinkedListPage().implementLLTryhere();

	}

	@Then("User click that Implement linked list in python Try here")
	public void user_click_that_implement_linked_list_in_python_try_here() {
		context.pageObjectManager.getLinkedListPage().implementLLTryhereClickFunction();
	}

	@When("User clicks on Traversal in topics covered")
	public void user_clicks_on_traversal_in_topics_covered() {
		context.pageObjectManager.getLinkedListPage().llTraversalFunction();
	}

	@Then("Traversal topic Try here should be visible")
	public void traversal_topic_try_here_should_be_visible() {
		context.pageObjectManager.getLinkedListPage().llTraversalTryhere();
	}

	@Then("User click that Traversal Try here")
	public void user_click_that_traversal_try_here() {
		context.pageObjectManager.getLinkedListPage().llTraversalTryhereClickFunction();
	}

	@When("User clicks on Insertion in topics covered")
	public void user_clicks_on_insertion_in_topics_covered() {
		context.pageObjectManager.getLinkedListPage().llInsertionFunction();
	}

	@Then("Insertion topic Try here should be visible")
	public void insertion_topic_try_here_should_be_visible() {
		context.pageObjectManager.getLinkedListPage().llInsertionTryhere();
	}

	@Then("User click that Insertion Try here")
	public void user_click_that_insertion_try_here() {

		context.pageObjectManager.getLinkedListPage().llInsertionTryhereClickFunction();
	}

	@When("User clicks on Deletion in topics covered")
	public void user_clicks_on_deletion_in_topics_covered() {
		context.pageObjectManager.getLinkedListPage().lldeletionFunction();

	}

	@Then("Deletion topic Try here should be visible")
	public void deletion_topic_try_here_should_be_visible() {
		context.pageObjectManager.getLinkedListPage().llDeletionTryhere() ;
	}

	@Then("User click that Deletion Try here")
	public void user_click_that_deletion_try_here() {

		context.pageObjectManager.getLinkedListPage().llDeletionTryhereClickFunction();
	}

}
