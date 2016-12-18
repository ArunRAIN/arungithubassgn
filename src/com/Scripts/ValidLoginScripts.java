package com.Scripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.Genric.BasePage;
import com.Pages.ValidLoginPage;

public class ValidLoginScripts  extends BasePage
{
	@Test
	public void verifySucessLogin() throws InterruptedException
	{
		Reporter.log("ValidLoginScript Execution started......",true);
		ValidLoginPage lp=new ValidLoginPage(driver);
		lp.validlogin();
		lp.verifyloginsucessful();
		Reporter.log("ValidLoginScript Execution Ended.....",true);
		
	}

}
