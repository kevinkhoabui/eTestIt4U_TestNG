package eSing_Java_TestNG_package;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class eSing_Java_TestNG_File2 {
	public String baseURL = "http://demo.guru99.com/test/newtours";
	String driverPath = "/Volumes/Data/eTestIt4U/geckodriver";
	public WebDriver driver;
	public String expected = null;
	public String actual = null;
	
	@BeforeTest
		public void launchBrowser() {
			System.out.println("Launch Web Browser");
			System.setProperty("webdriver.gecko.driver",driverPath);
			driver = new FirefoxDriver();
			driver.get(baseURL);
	}
	
	@BeforeMethod
	public void verifyHomePageTitle() {
		String expectedTitle = "Welcome: Mercury Tours";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@Test(priority = 0)
	public void register() {
		driver.findElement(By.linkText("REGISTER")).click();
		expected = "Register: Mercury Tours";
		actual = driver.getTitle();
		Assert.assertEquals(actual, expected);
		}
	
	@Test(priority = 1)
	public void support() {
		driver.findElement(By.linkText("SUPPORT")).click();
		expected = "Under Construction: Mercury Tours";
		actual = driver.getTitle();
		Assert.assertEquals(actual, expected);
	}
	
	@AfterMethod
	public void goBackToHomePage () {
		driver.findElement(By.linkText("Home")).click();
	}
	
	@AfterTest
	public void terminateBrowser() {
		driver.close();
	}
}
