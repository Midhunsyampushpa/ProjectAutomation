package org.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScript_Executor {

	public static void main(String[] args) throws Exception 
	{
		
		//Launching webpage
		WebDriver driver=new FirefoxDriver();
		driver.get("http://hotmail.com");
		driver.manage().window().maximize();
		
		//Write javascript interface to make runtime changes on instant browser
		JavascriptExecutor js=((JavascriptExecutor)driver);
		//Above Interface class allow user to make runtime changes on Application
		//It enabled developer option on Browser
		
		//Disable Element
		js.executeScript("window.document.getElementById('i0116').disabled=true");
		Thread.sleep(5000);
		
		//Enable element using javascript code
		js.executeScript("window.document.getElementById('i0116').disabled=false");
		Thread.sleep(5000);
		
		
		driver.findElement(By.id("i0116")).sendKeys("sunilreddy.gajjala@outlook.com");

		//Write a program to hide next button
		js.executeScript("window.document.getElementById('idSIButton9').style.visibility='hidden'");
		Thread.sleep(5000);
						
		//Write a program to hide next button
		js.executeScript("window.document.getElementById('idSIButton9').style.visibility='visible'");
		Thread.sleep(5000);
				
		//Click Button using javscript executor
		js.executeScript("window.document.getElementById('idSIButton9').click()");
		
	}

}
