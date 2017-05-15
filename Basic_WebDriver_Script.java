package org.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Basic_WebDriver_Script 
{

	public static void main(String[] args) 
	{
		
		
		//launch firefox browser
		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		//Enter text into Firstname Editbox
		driver.findElement(By.id("u_0_1")).clear();
		driver.findElement(By.id("u_0_1")).sendKeys("firstuser");
		
		//Enter Text into Surname Editbox
		driver.findElement(By.id("u_0_3")).clear();
		driver.findElement(By.id("u_0_3")).sendKeys("webdriver");
		
		//Enter Text into Email and Phone Editbox
	    driver.findElement(By.id("u_0_5")).clear();
	    driver.findElement(By.id("u_0_5")).sendKeys("webdrivernewuser@gmail.com");
	    
	    //Enter Text into retype email and phone editbox
	    driver.findElement(By.id("u_0_8")).clear();
	    driver.findElement(By.id("u_0_8")).sendKeys("webdrivernewuser@gmail.com");
	    
	    //Enter Text into password Edtibox
	    driver.findElement(By.id("u_0_a")).clear();
	    driver.findElement(By.id("u_0_a")).sendKeys("hello12345");
		
		//Select Day Dropdown option
		driver.findElement(By.name("birthday_day")).sendKeys("7");
	    
	    //Select month Dropdown option
		driver.findElement(By.id("month")).sendKeys("d");
	    
	    //Select year dropdown option
		driver.findElement(By.id("year")).sendKeys("2003");
		
		
		
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
