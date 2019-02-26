package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductTest extends TestBase {
	
	@Test
	public void verifyAllProduct() {
		String actualPageTitle = homepage.getPageTitle();
		Assert.assertEquals(actualPageTitle, "Web Orders", "Home page title mismatch");
		System.out.println("Home page title: " + actualPageTitle);
	}
}
