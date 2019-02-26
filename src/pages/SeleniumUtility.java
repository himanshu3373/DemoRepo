package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumUtility {
	WebDriver driver;
	WebDriverWait wait;
	
	public SeleniumUtility(WebDriver driver){
		this.driver = driver;
		wait = new WebDriverWait(this.driver, 30);
	}
	
	protected void click(By locator){
		waitForElementToBeVisible(locator);
		waitForElementToBeClickable(locator);
		driver.findElement(locator).click();
	}
	
	protected void enter(By locator, String value){
		waitForElementToBeVisible(locator);
		driver.findElement(locator).sendKeys(value);
	}
	
	protected String getTitle(){
		return driver.getTitle();
	}
	
	protected WebElement findElement(By locator){
		waitForElementToBeVisible(locator);
		return driver.findElement(locator);
	}
	
	protected void selectByVisibleText(By locator, String val){
		Select s = new Select(findElement(locator));
		s.selectByVisibleText(val);
	}
	
	public void waitForElementToBeVisible(By locator){
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	public void waitForElementToBeClickable(By locator){
		wait.until(ExpectedConditions.elementToBeClickable(locator));
	}
}
