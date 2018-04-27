package com.myproject.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.myproject.generic.BaseTest;
import com.myproject.generic.ExcelData;
import com.myproject.pages.LoginPage;

public class ValidLoginTest extends BaseTest
{
	@Test
	public void testvalidLogin() 
	{
		String username = ExcelData.getData(file_path, "login", 1, 0);
		String password=ExcelData.getData(file_path, "login", 1, 1);
		String logintitle=ExcelData.getData(file_path, "login", 1, 2);
		String version=ExcelData.getData(file_path, "login", 1, 3);
		String errmsg=ExcelData.getData(file_path, "login", 1, 4);
		
		LoginPage lp=new LoginPage(driver);
		lp.enterUsername(username);
		lp.enterPassword(password);
		lp.clickonLogin();
	
		
		lp.verifyTitle(logintitle);
		

		
	}
}
