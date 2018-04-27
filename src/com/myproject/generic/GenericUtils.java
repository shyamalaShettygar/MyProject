package com.myproject.generic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


// this class contains all the generic methods of select class
public class GenericUtils {

	public static void getScreenShot(WebDriver driver,String name) 
	{
		
	
	try {
		TakesScreenshot t=(TakesScreenshot) driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		FileUtils.copyDirectory(src, new File("./screenshots/"+name+".png"));
	} 
	
	catch (IOException e) 

	{
		
	}
	}
	
	public static void selectByIndex(WebElement element, int index)
	{
		Select sel=new Select(element);
		sel.selectByIndex(index);
	}
	public static void selectByValue(WebElement element, String value) 
	{
		Select sel=new Select(element);
		sel.selectByValue(value);
	}
	public static void selectByVissibleText(WebElement element, String vissibletext)
	{
		Select sel=new Select(element);
		sel.selectByVisibleText(vissibletext);
	}
	
	public static void deselectAll(WebElement element) 
	{
		Select sel=new Select(element);
		sel.deselectAll();
	}
	public static void getOptions(WebElement element)
	{
		Select sel=new Select(element);
		sel.getOptions();
		
	}
	public static void isMultiple(WebElement element) 
	{
		Select sel=new Select(element);
		sel.isMultiple();
	}
	
	//some methods of Actions class
	
	public  static void dragAndDrop(WebDriver driver, WebElement source, WebElement target) 
	{
		Actions act=new Actions(driver);
		act.dragAndDrop(source, target).perform();;
	}
	
	public static void contextClick(WebDriver WebDriver) 
	{
		Actions act=new Actions(WebDriver);
		act.contextClick().perform();;
	}
	public static void DoubleClick(WebDriver driver)
	{
		Actions act=new Actions( driver);
		act.doubleClick().perform();;
	}
}
