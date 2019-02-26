package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends SeleniumUtility {
	By logoutButton = By.xpath(".//*[@id='ctl00_logout']");

	public HomePage(WebDriver driver) {
		super(driver);
	}

	public String getPageTitle() {
		String PageTitle = getTitle();
		return PageTitle;
	}
	/*
	 * public void LogOutOfApplication(){
	 * driver.findElement(logoutButton).click(); }
	 */
}
