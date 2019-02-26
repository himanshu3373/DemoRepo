package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import pages.HomePage;
import pages.LoginPage;

public class TestBase {
	String url;
	String browserType;
	String userName;
	String password;
	WebDriver driver;
	
	//Page Objects
	LoginPage loginpage;
	HomePage homepage;
	 
	
  @BeforeMethod
  public void beforeMethod() {
	  loginpage.enterUserName(userName);
	  loginpage.enterPassword(password);
	  loginpage.clickLoginButton();
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass() {
	  try {
		FileInputStream fis = new FileInputStream("files/config.properties");
		Properties pFile = new Properties();
		pFile.load(fis);
		url = pFile.getProperty("url");
		browserType = pFile.getProperty("browser");
		userName = pFile.getProperty("username");
		password = pFile.getProperty("password");
		createWebDriver();
		driver.get(url);
		initializePageObjects();
		
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	  
  }

  @AfterClass
  public void afterClass() {
  }

  public void createWebDriver(){
	  if(browserType.equalsIgnoreCase("chrome")){
		  
		  driver = new ChromeDriver();
	  }
	  else
		  driver = new FirefoxDriver();
  }
  
  public void initializePageObjects(){
	  loginpage = new LoginPage(driver);
	  homepage = new HomePage(driver);
  }
}
