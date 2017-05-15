package org.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Targeting_Object_WithClassLocator {

	public static void main(String[] args) throws Exception 
	{
		
		//launch firefox browser
		WebDriver driver=new FirefoxDriver();
		driver.get("http://outlook.com");
		driver.manage().window().maximize();
		
		
		//Target username Locator
		driver.findElement(By.className("form-control")).clear();
		driver.findElement(By.className("form-control")).sendKeys("sunilreddy.gajjala@outlook.com");

		//Click Next button to validate email
		driver.findElement(By.className("btn-primary")).click();
		
		Thread.sleep(5000);
		
		//Enter password using classname locator
		driver.findElement(By.className("form-control")).clear();
		driver.findElement(By.className("form-control")).sendKeys("680806sunil");
		
		//Click Sign in button
		driver.findElement(By.className("btn-primary")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
