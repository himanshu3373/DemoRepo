package test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FileUploadTest {
  @Test
  public void testFileUpload() throws IOException {
	  WebDriver driver = new FirefoxDriver();
	  driver.get("http://demo.guru99.com/test/upload/");
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath(".//*[@id='uploadfile_0']")).click();
	  Runtime.getRuntime().exec("E:\\abcd.exe");
  }
}
