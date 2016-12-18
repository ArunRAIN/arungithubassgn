package com.Genric;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BasePage
{
	public WebDriver driver;
	
	@BeforeMethod
	public void precondition()
	{
		System.setProperty("webdriver.gecko.driver", ".\\Drivers\\geckodriver.exe");
		driver=new FirefoxDriver();
		Reporter.log("Firefox :Browser Opened",true);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.github.com");
		Reporter.log("Expected Url opened :https://www.github.com",true);
	}
	
	@AfterMethod
	public void postcondition()
	{
		driver.quit();
		Reporter.log("Firefox :Browser closed",true);
	}

}
