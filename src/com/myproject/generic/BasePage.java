package com.myproject.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import net.sourceforge.htmlunit.corejs.javascript.ast.CatchClause;

public class BasePage {
	//declaration
	public WebDriver driver;
	  
	//intialisation
		public BasePage(WebDriver driver)
		{
		 this.driver=driver;
		}
		
		//utilisation
		
		//verify the title of the page
		public void verifyTitle(String etitle)
		{
				try
				{
					WebDriverWait wait=new WebDriverWait(driver, 10);
					wait.until(ExpectedConditions.titleIs(etitle));
					Reporter.log("title is matching"+ etitle, true);
				}
		catch(Exception e)
			{
			
			Reporter.log("title is not matching"+driver.getTitle()+"title should be"+etitle,true);
			Assert.fail();
			}
		}
		
		//check element is present or not
		
		public void verifyElement(WebElement element)
		{
			try
			{
			WebDriverWait wait=new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.visibilityOf(element));
			Reporter.log("element is present",true);
			
		}
	catch(Exception e)
		{
			Reporter.log("element is not present", true);
		}
		
	
		}
}
