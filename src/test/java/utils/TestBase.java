package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestBase {
	public WebDriver driver;
	public WebDriver WebDriverManager() throws IOException {
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//global.properties");
		Properties prop=new Properties();
		prop.load(fis);
		String url=prop.getProperty("Url");
		
		if(driver==null) {
			if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
		String path=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",path+"/src/test/resources/Drivers/chromedriver.exe");
		driver=new ChromeDriver();
			}
			if(prop.getProperty("browser").equalsIgnoreCase("msedge")) {
				String path=System.getProperty("user.dir");
				System.setProperty("webdriver.chrome.driver",path+"/src/test/resources/Drivers/msedgedriver.exe");
				driver=new ChromeDriver();
					}
			
		driver.get(url);
		}
		return driver;
	/*	FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//global.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String url = prop.getProperty("QAUrl");
		String browser_properties = prop.getProperty("browser");
		String browser_maven=System.getProperty("browser");
		// result = testCondition ? value1 : value2
		
		String browser = browser_maven!=null ? browser_maven : browser_properties;
		
		
		
		if(driver == null)
		{
			if(browser.equalsIgnoreCase("chrome"))
			{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//src//test//resources//chromedriver");
		driver = new ChromeDriver();// driver gets the life
			}
			if(browser.equalsIgnoreCase("edge"))
			{
				System.setProperty("webdriver.gecko.driver","//Users//rahulshetty//Downloads//geckodriver 5");
				driver = new EdgeDriver();
			}
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(url);
		}
		
		return driver;
		
	}*/
		
	}
}


