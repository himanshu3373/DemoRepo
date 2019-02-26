package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.OrderPage;

public class LoginTest extends TestBase {
	WebDriver driver = new FirefoxDriver();

	@BeforeTest
	public void verifySuccessfullLogin() {
		driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
		
		HomePage homepage = new HomePage(driver);
		String actualTitle = homepage.getPageTitle();
		String expectedTitle = "Web Orders";
		Assert.assertEquals(actualTitle, expectedTitle, "Login Unsuccessfull");

		/* homepage.LogOutOfApplication();*/ 
	}

	@Test
	public void orderPage() {
		OrderPage orderpage = new OrderPage(driver);
		orderpage.processsOrderPage();
	}
}
