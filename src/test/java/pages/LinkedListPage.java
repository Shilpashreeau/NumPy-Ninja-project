package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LinkedListPage {
	public WebDriver driver;
	WebDriverWait wait;
	public LinkedListPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
		wait=new WebDriverWait(this.driver,Duration.ofSeconds(1));
	}
	
	@FindBy(xpath="//a[@href='linked-list']")
	WebElement graphGetStartedBtn;
	
	@FindBy(xpath="//div/h4[text()='Linked List']")
	WebElement LinkedListTitle;
	
	@FindBy(xpath="//div/ul/a[text()='Introduction']")
	WebElement LlIntroductionLink;
	
	@FindBy(xpath="//a[@class='btn btn-info']")
	WebElement LlIntroductionTryHere;
	
	@FindBy(xpath="//form[@id='answer_form']")
	WebElement EditorBox;
	
	@FindBy(xpath="//button[@type='button']")
	WebElement RunBtn;
	
	@FindBy(xpath="//div/ul/a[text()='Creating Linked LIst']")
	WebElement CreatingLinkedListLink;
	
	@FindBy(xpath="//a[@class='btn btn-info']")
	WebElement CreatingLinkedListTryHere;
	
	@FindBy(xpath="//div/ul/a[text()='Types of Linked List']")
	WebElement TypesLinkedListLink;
	
	@FindBy(xpath="//a[@class='btn btn-info']")
	WebElement TypesLinkedListTryhere;
	
	@FindBy(xpath="//div/ul/a[text()='Implement Linked List in Python']")
	WebElement ImplementLinkedListlink;
	
	@FindBy(xpath="//a[@class='btn btn-info']")
	WebElement ImplementLinkedListTryhere;
	
	@FindBy(xpath="//div/ul/a[text()='Traversal']")
	WebElement TraversalLink;
	
	@FindBy(xpath="//a[@class='btn btn-info']")
	WebElement TraversalTryhere;
	
	@FindBy(xpath="//div/ul/a[text()='Insertion']")
	WebElement InsertionLink;
	
	@FindBy(xpath="//a[@class='btn btn-info']")
	WebElement InsertionTryhere;
	
	@FindBy(xpath="//div/ul/a[text()='Deletion']")
	WebElement DeletionLink;
	
	@FindBy(xpath="//a[@class='btn btn-info']")
	WebElement DeletionTryhere;
	
	public void linkedListGetStartedFunction() {
		graphGetStartedBtn.click();
		
	}
	public void linkedListTitleDisplay() {
		LinkedListTitle.isDisplayed();
		
		}
	public void linkedlistintroductionFunction() {
		LlIntroductionLink.click();
		
	}
	public void introductionTryhere() {
		LlIntroductionTryHere.isDisplayed();
		
	}
	
	public void introductionTryhereClickFunction() {
		LlIntroductionTryHere.click();
		
	}
	
	public void creatingLinkedlistFunction() {
		LlIntroductionLink.click();
		
	}
	public void creatingLLTryhere() {
		LlIntroductionTryHere.isDisplayed();
		
	}
	
	public void creatingLLTryhereClickFunction() {
		LlIntroductionTryHere.click();
		
	}
	public void typesOfLLFunction() {
		LlIntroductionLink.click();
		
	}
	public void typesOfLLTryhere() {
		LlIntroductionTryHere.isDisplayed();
		
	}
	
	public void typesOfLLTryhereClickFunction() {
		LlIntroductionTryHere.click();
		
	}
	public void implementLLFunction() {
		LlIntroductionLink.click();
		
	}
	public void implementLLTryhere() {
		LlIntroductionTryHere.isDisplayed();
		
	}
	
	public void implementLLTryhereClickFunction() {
		LlIntroductionTryHere.click();
		
	}
	public void llTraversalFunction() {
		LlIntroductionLink.click();
		
	}
	public void llTraversalTryhere() {
		LlIntroductionTryHere.isDisplayed();
		
	}
	
	public void llTraversalTryhereClickFunction() {
		LlIntroductionTryHere.click();
		
	}
	public void llInsertionFunction() {
		LlIntroductionLink.click();
		
	}
	public void llInsertionTryhere() {
		LlIntroductionTryHere.isDisplayed();
		
	}
	
	public void llInsertionTryhereClickFunction() {
		LlIntroductionTryHere.click();
		
	}
	public void lldeletionFunction() {
		LlIntroductionLink.click();
		
	}
	public void llDeletionTryhere() {
		LlIntroductionTryHere.isDisplayed();
		
	}
	
	public void llDeletionTryhereClickFunction() {
		LlIntroductionTryHere.click();
		
	}
	
	
	
	
	

}
