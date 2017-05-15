package org.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicCss {

	public static void main(String[] args) 
	{
		
		//launch Firefox Browser
		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.cssSelector("#month > option[value='6']")).click();
		

	}

}
