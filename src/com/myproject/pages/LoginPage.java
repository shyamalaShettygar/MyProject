package com.myproject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.myproject.generic.BasePage;

//here am declaring all the elements which is present in the login page
public class LoginPage extends BasePage {

	@FindBy(id="username")
	private WebElement usernameTB;
	
	@FindBy(name="pwd")
	private WebElement passwordTB;
	
	@FindBy(xpath="//div[.=Login ]")
	private WebElement LoginBTN;
	
	@FindBy(xpath="//span contains(text(='invalid')")
	private WebElement errMessage;
	
	@FindBy(xpath="//nobr[.='actiTIME']")
	private WebElement version;
	
	// here am intialising the elements by using constructor
//	public LoginPage(WebDriver driver)
//	{
//		super(driver);
//		PageFactory.initElements(driver, this);
//	}
	
	// calling methods to perform the actions
	
	public LoginPage(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public  void enterUsername(String username)
	{
		usernameTB.sendKeys(username);
	}
	
	public void enterPassword(String password)
	{
		passwordTB.sendKeys(password);
	}
	
	
	public void clickonLogin()
	{
		LoginBTN.click();
	}
	
	public void verifylogintitle() 
	{
		verifylogintitle();

	}

	 
		
	}
