package org.webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_MultipleSelection 
{

	public static void main(String[] args)
	{
		/*
		 * ismultiple:---->

		 	* method usefull to find Dropdown selection state single or multiple.
		 	* ismultiple is a boolean return type it return <<<true>>> on multiple 		   selection, and <<<false>>> on single option selection

			Syntax:--->
			boolean flag=new Select(webelement).ismultiple();
			System.out.println(flag);
		 */
		
				//launch Firefox Browser
				WebDriver driver=new FirefoxDriver();
				//Set Url to browser window
				driver.get("http://www.facebook.com");
				//maximize browser window
				driver.manage().window().maximize();
				
				
				//Verify Month Dropdown allow single or multiple selection
				Select Month_Dropdown=new Select(driver.findElement(By.name("birthday_month")));
				//using Referral Find Dropdown status
				boolean flag=Month_Dropdown.isMultiple();
				System.out.println("Dropdown multiple Selection State   "+flag);
		
				
				
			//Select Two options at same time with in Dropdown 	
				Month_Dropdown.selectByVisibleText("May");
				Month_Dropdown.selectByValue("10");
				Month_Dropdown.selectByVisibleText("Feb");
				Month_Dropdown.selectByValue("12");
				
				
			//Deselect oct Option From Selection
				Month_Dropdown.deselectByVisibleText("Oct");
			
			//Deselect Feb option From Multiple Selection
				Month_Dropdown.deselectByIndex(2);
				
			//Deselect Dec Option From Multiple Selection
				Month_Dropdown.deselectByValue("12");
				
				
			//Deselect All Dropdown option from multiple selection
				Month_Dropdown.deselectAll();
				
				
			//Get All Dropdown options
				List<WebElement> All_dropdown_Option=Month_Dropdown.getOptions();
				System.out.println("Option Count is   "+All_dropdown_Option.size());
				
			//Get All Selected Option [on multiple Selction]
				List<WebElement> All_Selected_options=Month_Dropdown.getAllSelectedOptions();
				System.out.println("Selected options Count under Dropdown   "+All_Selected_options.size());
	}

}
