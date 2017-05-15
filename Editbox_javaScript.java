package org.webdriver;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Editbox_javaScript {

	public static void main(String[] args) 
	{
		//Browser Launch
		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
				
		//Write javascript interface to make runtime changes on instant browser
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("window.document.getElementById('u_0_1').value='newuser'");
		
		//Click Registration button
		js.executeScript("window.document.getElementById('u_0_e').click()");
		
		
		
	}

}
