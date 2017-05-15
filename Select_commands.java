package org.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_commands {

	public static void main(String[] args)
	{
		
		//launch firefox browser
		WebDriver driver=new FirefoxDriver();
		driver.get("https://login.yahoo.com/");
		driver.manage().window().maximize();
		
		
		//Click Singup link
		driver.findElement(By.linkText("Sign up")).click();
		
		
		Select month=new Select(driver.findElement(By.name("usernamereg-month")));
		boolean flag1=month.isMultiple();
		System.out.println("Value is  "+flag1);
		
		//Select commands for month Dropdown
		Select dmonth=new Select(driver.findElement(By.id("usernamereg-month")));
		dmonth.selectByVisibleText("August");
		dmonth.selectByValue("3");
		dmonth.selectByIndex(11);
		
		//Select Country code
		new Select(driver.findElement(By.name("shortCountryCode"))).selectByValue("TR");
		new Select(driver.findElement(By.name("shortCountryCode"))).selectByVisibleText("Argentina ‪(+54)‬");

		
		
		/*
		 * ismultiple:--->
		 * 			 is multiple is a select dropdown method usefull to verify
		 * 			dropdown selection option single or multiple
		 * 	
		 * 			method is a boolean return type
		 * 			when it return false dropdown allow single option to select
		 * 			when it return true dropdown allow multile options to select
		 */
		Select countryCode=new Select(driver.findElement(By.name("shortCountryCode")));
		boolean flag=countryCode.isMultiple();
		System.out.println("Value is  "+flag);
		
		//Select Multiple options in same dropdown
		countryCode.selectByIndex(1);
		countryCode.selectByIndex(2);
		
		//Deselect by visibleText from multiple selection
		countryCode.deselectByVisibleText("visible option name");
		
		//Deselect By value from multiple selection
		countryCode.deselectByValue("option value from html source");
		
		//Deselect by index from multiple selection
		countryCode.deselectByIndex(3);
		
		//deselect all option from multiple selection
		countryCode.deselectAll();
		
		
		
		
		
		
		
		
		

	}

}
