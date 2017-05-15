package org.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Working_With_Link_and_PartialLInktext {

	public static void main(String[] args) 
	{
		
		
		//launch firefox browser
		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		
		/*
		 * target link elemment with visible Text
		 */
		driver.findElement(By.linkText("Badges")).click();

		
		
		/*
		 * Target link element with matching characters
		 */
		driver.findElement(By.partialLinkText("previous page")).click();
	}

}
