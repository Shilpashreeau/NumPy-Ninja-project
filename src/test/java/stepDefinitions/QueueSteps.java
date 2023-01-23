package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PageObjectManager;
import utils.TestContextSetup;

public class QueueSteps {
	TestContextSetup context;
	PageObjectManager pageObjectManager;
	
	public QueueSteps(TestContextSetup context) {
		this.context=context;
	}

@When("User clicks on Get started of Queue")
public void user_clicks_on_get_started_of_queue() {
	context.pageObjectManager.getQueuePage().getStartedQFunction();
}

@Then("User should see Queue Page screen")
public void user_should_see_queue_page_screen() {
	context.pageObjectManager.getQueuePage().qTitleDisplay();
}

@When("User clicks on Implementation of Queue in topics covered")
public void user_clicks_on_implementation_of_queue_in_topics_covered() {
	context.pageObjectManager.getQueuePage().implementQ();
}

@Then("Implementation of Queue topic Try here should be visible")
public void implementation_of_queue_topic_try_here_should_be_visible() {
	context.pageObjectManager.getQueuePage().implementQTRyhere() ;
}

@Then("User click that Implementation of Queue Try here")
public void user_click_that_implementation_of_queue_try_here() {
	context.pageObjectManager.getQueuePage().implementQTRyhereClick();
}

@When("User clicks on Implementation of Queue using collection in topics covered")
public void user_clicks_on_implementation_of_queue_using_collection_in_topics_covered() {
	context.pageObjectManager.getQueuePage().dequeueFunction();
}

@Then("Implementation of Queue using collection topic Try here should be visible")
public void implementation_of_queue_using_collection_topic_try_here_should_be_visible() {
	context.pageObjectManager.getQueuePage().dequeueTRyhere();
}

@Then("User click that Implementation of Queue using collection Try here")
public void user_click_that_implementation_of_queue_using_collection_try_here() {
	context.pageObjectManager.getQueuePage().implementationStackTRyhereClick();
}

@When("User clicks on Implementation of Queue using array in topics covered")
public void user_clicks_on_implementation_of_queue_using_array_in_topics_covered() {
	context.pageObjectManager.getQueuePage().implementQarray();
}

@Then("Implementation of Queue using array topic Try here should be visible")
public void implementation_of_queue_using_array_topic_try_here_should_be_visible() {
	context.pageObjectManager.getQueuePage().implementQarrayTRyhere();
}

@Then("User click that Implementation of array using collection Try here")
public void user_click_that_implementation_of_array_using_collection_try_here() {
	context.pageObjectManager.getQueuePage().implementQarrayTRyhereClick();
}

@When("User clicks on Queue operations in topics covered")
public void user_clicks_on_queue_operations_in_topics_covered() {
	context.pageObjectManager.getQueuePage().qOperation();
}

@Then("Queue operations  topic Try here should be visible")
public void queue_operations_topic_try_here_should_be_visible() {
	context.pageObjectManager.getQueuePage().qOperationTRyhere();
}

@Then("User click that Queue operations  Try here")
public void user_click_that_queue_operations_try_here() {
	context.pageObjectManager.getQueuePage().qOperationTRyhereClick();
}
	

}
