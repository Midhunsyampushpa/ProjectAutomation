package sunil_workspace;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_UserListBox_item {

	public static void main(String[] args) throws Exception
	{
		
		//launch firefox browser
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.air.irctc.co.in/IndianRailways/");
		driver.manage().window().maximize();
		
		
		//close advertise message
		driver.findElement(By.linkText("Close")).click();
		
		
		//Enter refferal text into Origin Listbox
		driver.findElement(By.id("origin")).clear();
		driver.findElement(By.id("origin")).sendKeys("HYD");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Hyderabad,HYD")).click();
		
		
		//Enter Text into Destination Listbox
		driver.findElement(By.id("destination")).clear();
		driver.findElement(By.id("destination")).sendKeys("JAI");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Jaipur,JAI")).click();
		
		
		//Click date picker image
		driver.findElement(By.className("ui-datepicker-trigger")).click();
		//click Date link
		driver.findElement(By.linkText("29")).click();
		
		
		//Select airline
		new Select(driver.findElement(By.name("airlinePreference"))).selectByVisibleText("Air India");
		
		//Click Search flight button
		driver.findElement(By.className("srchbtn")).click();
		
		
	}

}
