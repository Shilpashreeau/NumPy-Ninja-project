package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ArrayPage {
	WebDriver driver;
	WebDriverWait wait;
	public ArrayPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		wait=new WebDriverWait(this.driver,Duration.ofSeconds(1));
	}
	
	@FindBy(xpath="//a[@href='array']")
	WebElement GetStartedArray;
	
	@FindBy(xpath="//div/h4[text()='Array']")
	WebElement ArrayTitle;
	@FindBy(xpath="//div/ul/a[text()='Arrays in Python']")
	WebElement ArrayPython;
	@FindBy(xpath="//a[@class='btn btn-info']")
	WebElement ArrayPythonTryHere;
	
	@FindBy(xpath="//div/ul/a[text()='Arrays Using List']")
	WebElement ArrayListPython;
	@FindBy(xpath="//a[@class='btn btn-info']")
	WebElement ArrayListTryHere;
	
	@FindBy(xpath="//div/ul/a[text()='Basic Operations in Lists']")
	WebElement BasicOP;
	@FindBy(xpath="//a[@class='btn btn-info']")
	WebElement BasicOPTryHere;
	
	@FindBy(xpath="//div/ul/a[text()='Applications of Array']")
	WebElement AppliacationOfArray;
	@FindBy(xpath="//a[@class='btn btn-info']")
	WebElement AppliactionOFPTryHere;
	
	public void getStartedArrayFunction() {
		GetStartedArray.click();
	}
	public void arrayTitleDisplay() {
		ArrayTitle.isDisplayed();
	}
	public void arrayInPython() {
		ArrayPython.click();
		
	}
	public void operationStackTRyhere() {
		ArrayPythonTryHere.isDisplayed();
	}
	public void operationStackTRyhereClick() {
		ArrayPythonTryHere.click();
	}
	
	public void arrayUsingListPython() {
		ArrayListPython.click();
		
	}
	public void arrayListTRyhere() {
		ArrayListTryHere.isDisplayed();
	}
	public void arrayListTRyhereClick() {
		ArrayListTryHere.click();
	}
	
	public void basicOPerationArray() {
		BasicOP.click();
		
	}
	public void arrayOperationTRyhere() {
		BasicOPTryHere.isDisplayed();
	}
	public void arrayOperationTRyhereClick() {
		BasicOPTryHere.click();
	}
	
	public void applicationOfArray() {
		AppliacationOfArray.click();
		
	}
	public void applicationOfArrayTRyhere() {
		AppliactionOFPTryHere.isDisplayed();
	}
	public void applicationOfArrayTRyhereClick() {
		AppliactionOFPTryHere.click();
	}
	
	
	
	

}
