package org.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Email_Validation_Using_KeyboardInput 
{

	public static void main(String[] args) throws Exception 
	{
		
		//Browser Launch 
		WebDriver driver=new FirefoxDriver();
		driver.get("http://hotmail.com");
		driver.manage().window().maximize();
		
		//Click SignIn button
		driver.findElement(By.id("signup")).click();
		
		//Enter Text into Firstname Editbox
	    driver.findElement(By.id("FirstName")).clear();
	    driver.findElement(By.id("FirstName")).sendKeys("newuser");
	    
	    //Enter Text into Lastname Editbox
	    driver.findElement(By.id("LastName")).clear();
	    driver.findElement(By.id("LastName")).sendKeys("webdriver");
	    
	    //Enter Text into Email  Editbox
	    driver.findElement(By.id("MemberName")).clear();
	    driver.findElement(By.id("MemberName")).sendKeys("newuserwebdriver");
	    
	    //using Keyboard shortcut
	    driver.findElement(By.id("MemberName")).sendKeys(Keys.TAB);
	    Thread.sleep(2000);
	    
	    
	    //Enter Text into password Editbox
	    driver.findElement(By.id("Password")).clear();
	    driver.findElement(By.id("Password")).sendKeys("hello12345");
		
		
		

	}

}
