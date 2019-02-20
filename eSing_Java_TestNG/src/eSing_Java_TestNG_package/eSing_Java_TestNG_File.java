package eSing_Java_TestNG_package;

import org.testng.annotations.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;

public class eSing_Java_TestNG_File {
  public String baseURL = "http://demo.guru99.com/test/newtours";
  String driverPath = "/Volumes/Data/eTestIt4U/geckodriver";
  public WebDriver driver;
  
  @Test(priority = 3)
  public void c_test() {
	  Assert.fail(null);
  }
  
  @Test(priority = 0)
  public void a_test() {
	  Assert.assertTrue(true);
  }
  
  @Test(priority = 7)
  public void b_test() {
	  throw new SkipException ("skipping b_test...");
  }
  
	
  @Test
  public void verifyHomePageTitle() {
	  System.out.println("launching firefox browser");
	  System.setProperty("webdriver.gecko.driver", driverPath);
	  driver = new FirefoxDriver();
	  driver.get(baseURL);
	  String expectedTitle = "Welcome: Mercury Tours";
	  String actualTitle = driver.getTitle();
	  Assert.assertEquals(actualTitle, expectedTitle);
	  driver.close();
  }
}
