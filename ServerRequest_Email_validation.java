package org.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ServerRequest_Email_validation 
{

	public static void main(String[] args) throws Exception 
	{
		
		//Browser Launch 
		WebDriver driver=new FirefoxDriver();
		driver.get("http://hotmail.com");
		driver.manage().window().maximize();
		
		//Enter Text into Editbox
		driver.findElement(By.id("i0116")).clear();
		driver.findElement(By.id("i0116")).sendKeys("sunilreddy.gajjala@outlook.com");
		
		//click Next button To Validate Email Id
		driver.findElement(By.id("idSIButton9")).click();
		
		//manage Server Timeout
		Thread.sleep(4000);
		
		//Enter password 
		driver.findElement(By.id("i0118")).clear();
		driver.findElement(By.id("i0118")).sendKeys("680806sunil");
		
		//Click SignIn button
		driver.findElement(By.id("idSIButton9")).click();
		
	}

}
