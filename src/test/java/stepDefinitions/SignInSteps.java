package stepDefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PageObjectManager;
import utils.ExcelReader;
import utils.TestContextSetup;

public class SignInSteps {
	TestContextSetup context;
	PageObjectManager pageObjectManager;
	//String Excelpath ;
	

	public SignInSteps(TestContextSetup context) {
		this.context=context;
		
	}
	
	@Then("User should see login username and password fields")
	public void user_should_see_login_username_and_password_fields() {
		context.pageObjectManager.getSignInPage().textFieldVisibility();
	}

	@When("User enters {string} and {string}")
	public void user_enters_and(String string, String string2) {
	
	
		/*ExcelReader reader = new ExcelReader();
		 ExcelReader.getexcelfilepath();
		List<Map<String, String>> testdata = reader.getData(Excelpath, string);
		String username= testdata.get(rownumber).get("username");
		String password = testdata.get(rownumber).get("password");*/
		
		
		
			context.pageObjectManager.getSignInPage().login(string, string2);
		
	    
	}

	@Then("User clicks on Login")
	public void user_clicks_on_login() {
		context.pageObjectManager.getSignInPage().loginBtnFunction();
	}
	@Then("Login failure message is displayed")
	public void login_failure_message_is_displayed() {
		context.pageObjectManager.getSignInPage().loginFailAlert();
	}
	

}
