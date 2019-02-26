package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderPage {
	By orderPage = By.linkText("Order");
	By quantity = By.xpath(".//*[@id='ctl00_MainContent_fmwOrder_txtQuantity']");
	By calculate = By.xpath(".//*[@class='btn_dark']");
	By cusName = By.xpath(".//*[@id='ctl00_MainContent_fmwOrder_txtName']");
	By street = By.xpath(".//*[@id='ctl00_MainContent_fmwOrder_TextBox2']");
	By city = By.xpath(".//*[@id='ctl00_MainContent_fmwOrder_TextBox3']");
	By state = By.xpath(".//*[@id='ctl00_MainContent_fmwOrder_TextBox4']");
	By zip = By.xpath(".//*[@id='ctl00_MainContent_fmwOrder_TextBox5']");
	By visa = By.xpath(".//*[@value='Visa']");
	By cardNr = By.xpath(".//*[@id='ctl00_MainContent_fmwOrder_TextBox6']");
	By expDate = By.xpath(".//*[@id='ctl00_MainContent_fmwOrder_TextBox1']");
	By submit = By.xpath(".//*[@id='ctl00_MainContent_fmwOrder_InsertButton']");

	WebDriver driver;

	public OrderPage(WebDriver driver) {
		this.driver = driver;
	}

	public void processsOrderPage() {
		driver.findElement(orderPage).click();
		driver.findElement(quantity).sendKeys("100");
		driver.findElement(calculate).click();
		driver.findElement(cusName).sendKeys("Himanshu");
		driver.findElement(street).sendKeys("Umrer");
		driver.findElement(city).sendKeys("Nagpur");
		driver.findElement(state).sendKeys("Maharashtra");
		driver.findElement(zip).sendKeys("441203");
		driver.findElement(visa).click();
		driver.findElement(cardNr).sendKeys("1111222233334444");
		driver.findElement(expDate).sendKeys("10/12");
		driver.findElement(submit).click();
	}
}
