package sunil_workspace;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hotmail_Registration {

	public static void main(String[] args) throws Exception
	{
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://hotmail.com");
		driver.manage().window().maximize();
		
		
		//Click Create one link
		driver.findElement(By.id("signup")).click();
		
		//Enter Firstname
	    driver.findElement(By.id("FirstName")).clear();
	    driver.findElement(By.id("FirstName")).sendKeys("newuser");
	    
	    //Enter lastname
	    driver.findElement(By.id("LastName")).clear();
	    driver.findElement(By.id("LastName")).sendKeys("webdriver");
	    
	    //Enter username
	    driver.findElement(By.id("MemberName")).clear();
	    driver.findElement(By.id("MemberName")).sendKeys("newuserwebdriver");
	   
	    driver.findElement(By.id("MemberName")).sendKeys(Keys.TAB);
	    Thread.sleep(3000);
	    
	    //Enter password
	    driver.findElement(By.id("Password")).clear();
	    driver.findElement(By.id("Password")).sendKeys("hello12345");

	}

}
