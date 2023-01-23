package pages;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPage {
	
	public WebDriver driver;
	WebDriverWait wait;
	public RegisterPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
		wait=new WebDriverWait(this.driver,Duration.ofSeconds(1));
	}
	
	@FindBy(xpath="//ul/a[@href='/register']")
	WebElement HomeRegisterBtn;
	@FindBy(xpath="//input[@value='Register']")
	WebElement RegisterRegisterBtn;
	@FindBy(xpath=" //input[@id='id_username']")
	WebElement UsernameField;
	@FindBy(xpath=" //input[@id='id_password1']")
	WebElement passwordField;
	@FindBy(xpath=" //input[@id='id_password2']")
	WebElement confirmPwdField;
	@FindBy(xpath="//div[@class='alert alert-primary']")
	WebElement failureMsg;
	@FindBy(xpath="//div[contains(text(),'New Account')]")
	WebElement successMsg;
	
	public void homeRegisterbtnFunction() {
		HomeRegisterBtn.isDisplayed();
		HomeRegisterBtn.click();
	}
	public void registerRegisterbtnFunction() {
		RegisterRegisterBtn.isDisplayed();
	}
	public void userCredential(String un,String pwd,String pwd2) {
		UsernameField.sendKeys(un);
		passwordField.sendKeys(pwd);
		confirmPwdField.sendKeys(pwd2);
		 
		
	}
	public void clickOnRegister() {
		RegisterRegisterBtn.click();
	}
	public String statusMSgDisplay(String msg) {
		wait.until(ExpectedConditions.visibilityOf(successMsg));
		successMsg.isDisplayed();
		wait.until(ExpectedConditions.visibilityOf(failureMsg));
		failureMsg.isDisplayed();
		
		if(msg==failureMsg.getText()) {
			System.out.println("failed to register");
		}
		//Assert.assertEquals(msg,failureMsg.getText());
		if(msg==successMsg.getText()) {
			System.out.println("Registration successful");
		}
		
		return msg;
	}
	

}
