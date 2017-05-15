package sunil_workspace;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkText_And_PartialLinkText 
{

	public static void main(String[] args)
	{
		
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		//Click Link using original linkname
		driver.findElement(By.linkText("Forgotten account?")).click();
		
		//Click Link using partial name
		driver.findElement(By.partialLinkText("I can't identify")).click();
		
		//click link with partial name
		driver.findElement(By.partialLinkText("I have JavaScript enabled")).click();

	}

}
