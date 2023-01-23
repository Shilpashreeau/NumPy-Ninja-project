package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class QueuePage {
	public WebDriver driver;
	WebDriverWait wait;
	
	public QueuePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
		wait=new WebDriverWait(this.driver,Duration.ofSeconds(1));
	}
	
	@FindBy(xpath="//a[@href='queue']")
	WebElement GetStartedQueue;
	
	@FindBy(xpath="//div/h4[text()='Queue']")
	WebElement QueueTitle;
	@FindBy(xpath="//div/ul/a[text()='Implementation of Queue in Python']")
	WebElement ImplOfQueue;
	@FindBy(xpath="//a[@class='btn btn-info']")
	WebElement ImplOfQueueTryHere;
	
	@FindBy(xpath="//div/ul/a[text()='Implementation using collections.deque']")
	WebElement Dequeue;
	@FindBy(xpath="//a[@class='btn btn-info']")
	WebElement DequeueTryHere;
	
	@FindBy(xpath="//div/ul/a[text()='Implementation using array']")
	WebElement ImplQueueArray;
	@FindBy(xpath="//a[@class='btn btn-info']")
	WebElement ImplQueueArrayTryHere;
	
	
	@FindBy(xpath="//div/ul/a[text()='Queue Operations']")
	WebElement QueueOp;
	@FindBy(xpath="//a[@class='btn btn-info']")
	WebElement  QueueOpTryHere;
	
	
	
	
	public void getStartedQFunction() {
		GetStartedQueue.click();
	}
	public void qTitleDisplay() {
		QueueTitle.isDisplayed();
	}
	public void implementQ() {
		ImplOfQueue.click();
		
	}
	public void implementQTRyhere() {
		ImplOfQueueTryHere.isDisplayed();
	}
	public void implementQTRyhereClick() {
		ImplOfQueueTryHere.click();
	}
	
	public void dequeueFunction() {
		Dequeue.click();
		
	}
	public void dequeueTRyhere() {
		DequeueTryHere.isDisplayed();
	}
	public void implementationStackTRyhereClick() {
		DequeueTryHere.click();
	}
	
	public void implementQarray() {
		ImplQueueArray.click();
		
	}
	public void implementQarrayTRyhere() {
		ImplQueueArrayTryHere.isDisplayed();
	}
	public void implementQarrayTRyhereClick() {
		ImplQueueArrayTryHere.click();
	}
	
	public void qOperation() {
		QueueOp.click();
		
	}
	public void qOperationTRyhere() {
		QueueOpTryHere.isDisplayed();
	}
	public void qOperationTRyhereClick() {
		QueueOpTryHere.click();
	}
	
	
	
	
	

}
