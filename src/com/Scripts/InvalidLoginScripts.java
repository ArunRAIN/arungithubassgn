package com.Scripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.Genric.BasePage;
import com.Pages.InvalidLoginPage;

public class InvalidLoginScripts  extends BasePage
{
	@Test
	public void verifyFailedLogin() throws InterruptedException
	{
		Reporter.log("InvalidLoginScript Execution started...",true);
		InvalidLoginPage lp=new InvalidLoginPage(driver);
		lp.Invalidlogin();
		lp.verifyFailedlogin();
		Reporter.log("InvalidLoginScript Execution Ended...",true);
		
	}

}
