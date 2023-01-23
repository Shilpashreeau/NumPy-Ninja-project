package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StackPage {
	
	public WebDriver driver;
	WebDriverWait wait;
	public StackPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
		wait=new WebDriverWait(this.driver,Duration.ofSeconds(1));
	}
	
	@FindBy(xpath="//a[@href='stack']")
	WebElement getStartedStack;
	@FindBy(xpath="//div/h4[text()='Stack']")
	WebElement StackTitle;
	@FindBy(xpath="//div/ul/a[text()='Operations in Stack']")
	WebElement OpInstack;
	@FindBy(xpath="//a[@class='btn btn-info']")
	WebElement OpInstackTryHere;
	
	@FindBy(xpath="//div/ul/a[text()='Implementation']")
	WebElement Implementationstack;
	@FindBy(xpath="//a[@class='btn btn-info']")
	WebElement ImplementationTryHere;
	
	@FindBy(xpath="//div/ul/a[text()='Applications']")
	WebElement Applicationsstack;
	@FindBy(xpath="//a[@class='btn btn-info']")
	WebElement ApplicationsTryHere;
	
	public void getStartedStackFunction() {
		getStartedStack.click();
	}
	public void stackTitleDisplay() {
		StackTitle.isDisplayed();
	}
	public void operationStack() {
		OpInstack.click();
		
	}
	public void operationStackTRyhere() {
		OpInstackTryHere.isDisplayed();
	}
	public void operationStackTRyhereClick() {
		OpInstackTryHere.click();
	}
	
	public void implementationStack() {
		Implementationstack.click();
		
	}
	public void implementationStackTRyhere() {
		ImplementationTryHere.isDisplayed();
	}
	public void implementationStackTRyhereClick() {
		ImplementationTryHere.click();
	}
	
	public void applicationStack() {
		Applicationsstack.click();
		
	}
	public void applicationStackTRyhere() {
		ApplicationsTryHere.isDisplayed();
	}
	public void applicationStackTRyhereClick() {
		ApplicationsTryHere.click();
	}
	
	
	
	
}
