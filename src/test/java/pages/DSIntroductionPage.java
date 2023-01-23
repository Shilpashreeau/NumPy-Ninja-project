package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DSIntroductionPage {
		
	public WebDriver driver;
	WebDriverWait wait;
	public DSIntroductionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
		wait=new WebDriverWait(this.driver,Duration.ofSeconds(1));
	}
	@FindBy(xpath="//a[@href='data-structures-introduction']")
	WebElement getStartedDSIntro;
	@FindBy(xpath="//div/h4[text()='Data Structures-Introduction']")
	WebElement DSIntroTitle;
	@FindBy(xpath="//ul/a[@href='time-complexity']")
	WebElement TimeComplexityLink;
	@FindBy(xpath="//a[@href='/tryEditor']")
	WebElement TimeComplexTRyHere;
	@FindBy(xpath="//a[@href='/logout']")
	WebElement LogOutBtn;
	
	public void getStartedDSIntroClick() {
		getStartedDSIntro.click();
	}
	public void dSIntroTitleDisplay() {
		DSIntroTitle.isDisplayed();
	}
	public void timeComplexityLinkClick() {
		TimeComplexityLink.click();
	}
	public void timeComplexityTryherevisibility() {
		TimeComplexTRyHere.isDisplayed();
	}
	public void timeComplexityTryHere() {
				
		TimeComplexTRyHere.click();
	}
	public void naviagteFunction() {
		driver.navigate().back();
	}
	public void signOutFunction() {
		LogOutBtn.click();
	}

}
