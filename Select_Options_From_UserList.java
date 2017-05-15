package org.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Options_From_UserList 
{

	public static void main(String[] args) throws Exception
	{
		
		/*
		 * Example:---> Select Option From userList
		 * 				Select autocompleted Options From Listbox
		 * 				Select Option From Menu Item
		 */
		
		//launch Firefox Browser
		WebDriver driver=new FirefoxDriver();
		//Set Url to browser window
		driver.get("http://www.air.irctc.co.in/IndianRailways/");
		//maximize browser window
		driver.manage().window().maximize();
		
		
		//Close advertise message
		driver.findElement(By.className("optionsTopic")).click();
		
		
		//Select list option from origin listbox
		driver.findElement(By.id("origin")).clear();
		driver.findElement(By.id("origin")).sendKeys("JAI");
		//java timeout
		Thread.sleep(2000);
		//Click Option from listbox
		driver.findElement(By.linkText("Jaipur,JAI")).click();
		
	
		//Select Destination From user List
		driver.findElement(By.id("destination")).clear();
		driver.findElement(By.id("destination")).sendKeys("HYD");
		//java timeout
		Thread.sleep(2000);
		driver.findElement(By.linkText("Hyderabad,HYD")).click();
		
		
		//Click datepicker Image
		driver.findElement(By.className("ui-datepicker-trigger")).click();
		//Select date
		driver.findElement(By.linkText("12")).click();
		
		//Select airlines
		new Select(driver.findElement(By.name("airlinePreference"))).selectByVisibleText("Air India");
		
		//Click search Button
		driver.findElement(By.className("srchbtn")).click();
		
	}

}
