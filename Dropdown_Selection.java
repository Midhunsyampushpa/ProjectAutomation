package org.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Selection {

	public static void main(String[] args) 
	{
		//launch firefox browser
		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		//Create object for Select Class
		Select ref_day=new Select(driver.findElement(By.id("day")));
		ref_day.selectByVisibleText("16");
		
		//Select Dropdown month
		Select ref_month=new Select(driver.findElement(By.id("month")));
		ref_month.selectByVisibleText("Aug");
		
		//Select year dropdown option
		Select ref_year=new Select(driver.findElement(By.id("year")));
		ref_year.selectByVisibleText("1990");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
