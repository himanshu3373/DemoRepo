package pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends SeleniumUtility {
/*	private By userName = By.xpath("//*[@type='text']");
	private By password = By.xpath("//*[@type='password']");
	private By loginButton = By.xpath(".//*[@value='Login']");*/
	Properties pFile;

	public LoginPage(WebDriver driver) {
		super(driver);
		try {
			FileInputStream fis = new FileInputStream("locators/loginPage.properties");
			pFile = new Properties();
			pFile.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void enterUserName(String usernameValue) {
		//driver.findElement(userName).sendKeys(usernameValue);
		By userName = By.xpath(pFile.getProperty("username"));
		enter(userName, usernameValue);
	}

	public void enterPassword(String passwordValue) {
		//driver.findElement(password).sendKeys(passwordValue);
		By password = By.xpath(pFile.getProperty("password"));
		enter(password, passwordValue);
	}

	public void clickLoginButton() {
		//driver.findElement(loginButton).click();
		By loginButton = By.xpath(pFile.getProperty("loginbutton"));
		click(loginButton);
 
	}
}