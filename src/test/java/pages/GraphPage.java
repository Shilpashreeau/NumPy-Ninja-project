package pages;

import static org.junit.Assert.assertEquals;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.datatable.DataTable;

public class GraphPage {
	public WebDriver driver;
	WebDriverWait wait;
	public GraphPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
		wait=new WebDriverWait(this.driver,Duration.ofSeconds(1));
	}
	
	@FindBy(xpath="//button[text()='Get Started']")
	WebElement getStartedBtn;
	@FindBy(linkText="Sign in")
	WebElement signInBTn;
	@FindBy(xpath="//input[@id='id_username']")
	WebElement usernameTextBox;
	@FindBy(xpath="//input[@id='id_password']")
	WebElement pwdTextBox ;
	@FindBy(xpath="//input[@value='Login']")
	WebElement LoginBtn;
	@FindBy(xpath="//div[@class='alert alert-primary']")
	WebElement LoginMsg;
	
	@FindBy(xpath="//a[@href='graph']")
	WebElement graphGetStartedBtn;
	
	@FindBy(xpath="//div/h4[text()='Graph']")
	WebElement GraphTitle;
	@FindBy(xpath="//div/ul/a[text()='Graph']")
	WebElement GraphTopic;
	@FindBy(xpath="//a[@class='btn btn-info']")
	WebElement GraphTryHereBtn;
	@FindBy(xpath="//form[@id='answer_form']")
	WebElement EditorBox;
	@FindBy(xpath="//button[@type='button']")
	WebElement RunBtn;
	
	@FindBy(linkText="Graph Representations")
	WebElement GrpahRep;
	
	@FindBy(xpath="//a[@href='/tryEditor']")
	WebElement GraphRepTryhere;
	
	public void getStartedFunction() {
		getStartedBtn.isDisplayed();
		getStartedBtn.click();
	}
	
	public void signInFunction() {
		signInBTn.click();
		
	}
	public void isSignInPageDisplayed() {
		
		wait.until(ExpectedConditions.visibilityOf(usernameTextBox));
		usernameTextBox.isDisplayed();
		
	}
	public void loginFunctionusingUSerNamePwd(String usrname,String pwd) {
		usernameTextBox.sendKeys(usrname);
		pwdTextBox.sendKeys(pwd);
		
	}
	public void clickLogin() {
		LoginBtn.click();
	}
	public void isLoginMsgDisplayed(String successMsg) {
		
		wait.until(ExpectedConditions.visibilityOf(LoginMsg));
		LoginMsg.isDisplayed();
		String msg=LoginMsg.getText();
		assertEquals(successMsg,msg);
		
	}
	public void graphGetStaertedBtnclick() {
		graphGetStartedBtn.click();
	}
	public void graphTitleVisibility() {
		wait.until(ExpectedConditions.visibilityOf(GraphTitle));
		GraphTitle.isDisplayed();
	}
	public void graphTopicClickFunction() {
		GraphTopic.click();
	}
	public void tryHereIsVisible() {
		wait.until(ExpectedConditions.visibilityOf(GraphTryHereBtn));
		GraphTryHereBtn.isDisplayed();
	}
	public void tryHereBtnClick() {
		GraphTryHereBtn.click();
	}
	public void editorBoxDisplay() {
		wait.until(ExpectedConditions.visibilityOf(EditorBox));
		EditorBox.isDisplayed();
	}
		public void inputCodeInEditor(DataTable testData)  {
		
		wait.until(ExpectedConditions.visibilityOfAllElements(EditorBox));
		wait.until(ExpectedConditions.elementToBeClickable(EditorBox));
		EditorBox.isDisplayed();
		
		List<String> pgm = testData.asList(String.class);
		/*JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='Entered data'", EditorBox);*/
		Actions action = new Actions(driver);   
        action.moveToElement(EditorBox).click().perform();
        action.sendKeys(pgm.get(0)).perform();
       
		}
	public void runPgm() {
		RunBtn.click();
	}
	
	public void graphRepTopicClickFunction() {
		GrpahRep.click();
	}
	
	public void graphRepTryhereVisibility() {
		GraphRepTryhere.isDisplayed();
	}
	
	
	public void graphRepTryHereClick() {
	GraphRepTryhere.click();
	
	}

}
