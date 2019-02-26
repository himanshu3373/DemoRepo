package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SeleniumUtility {
	WebDriver driver;

	public SeleniumUtility(WebDriver driver) {
		this.driver = driver;
	}

	protected void click(By locater) {
		driver.findElement(locater).click();
	}

	protected void entervalue(By locater, String value) {
		driver.findElement(locater).sendKeys(value);
	}

	protected void selectByValue(By locater, String value) {
		WebElement element = driver.findElement(locater);
		Select s = new Select(element);
		s.selectByVisibleText(value);
	}

	public WebElement findElement(By locator) {
		WebElement element = driver.findElement(locator);
		return element;
	}
}