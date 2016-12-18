package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class ValidLoginPage 
{
	WebDriver driver;
	
	public ValidLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	@FindBy(xpath="//a[text()='Sign in']")
	private WebElement signIn;
	
	@FindBy(id="login_field")
	private WebElement ursname;
	
	@FindBy(id="password")
	private WebElement pwdd;
	
	@FindBy(name="commit")
	private WebElement signbtn;
	
	
	
	public void validlogin()
	{
		
		try
		{
			signIn.click();
			ursname.sendKeys("arunrain23");
			Reporter.log("Entered Username : arunain23",true);
			pwdd.sendKeys("arun12345");
			Reporter.log("Entered Username : arun12345",true);
			signbtn.click();
			Reporter.log("Clicked on signIn Button",true);
		}
		catch(Exception e)
		{
			Reporter.log(e.getMessage(),true);
		}
				
	}
	
	
	public void verifyloginsucessful() throws InterruptedException
	{
		Thread.sleep(3000);
		Reporter.log("Trying to get Title of the Page.........",true);
		String hmetitle = driver.getTitle();
		Reporter.log("Page Title is : "+hmetitle,true);
		Reporter.log("Veryfying Login Action  .........",true);
			if(hmetitle.equals("GitHub"))
			{
			     Reporter.log("Sucessfully Logged In GitHub",true);
			}
			else
			{
				Reporter.log("Github login was unsuccessful",true);
				
			}
	}

}
