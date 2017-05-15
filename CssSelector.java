package org.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssSelector 
{

	public static void main(String[] args) 
	{
		//launch firefox browser
		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
						
		/*
		 * Locate object using cssselector with id property
		 * 		Syntax:--->			#id
		*/
		driver.findElement(By.cssSelector("#u_0_1")).clear();
		driver.findElement(By.cssSelector("#u_0_1")).sendKeys("only id");
						
		/*
		 * Locate object using cssselector with tagname and id
		 * 		Syntax:---> 		tagname#id
		 */
		driver.findElement(By.cssSelector("input#u_0_1")).clear();
		driver.findElement(By.cssSelector("input#u_0_1")).sendKeys("id and class");
		
		/*
		 * Locate object using cssselector with tagname and id and class
		 * 		Syntax:---> 		tagname#id.classname
		 */
		driver.findElement(By.cssSelector("input#u_0_1.inputtext")).clear();
		driver.findElement(By.cssSelector("input#u_0_1.inputtext")).sendKeys("id,class, tagname");
		
		
		/*
		 * Locate object using cssselector with parent property
		 * 
		 * 	Syntax:--->			#parentid > childtag
		 */
		driver.findElement(By.cssSelector("#u_0_0 > div > input")).clear();
		driver.findElement(By.cssSelector("#u_0_0 > div > input")).sendKeys("parent id");
		
		
		/*
		 * Locate object using cssselector with attribute
		 */
		driver.findElement(By.cssSelector("input[aria-label='First name']")).clear();
		driver.findElement(By.cssSelector("input[aria-label='First name']")).sendKeys("attribute");
		
		
		
		/*
		 * Locate object using cssselector with multiple attributes
		 */
		driver.findElement(By.cssSelector("input[aria-label='First name'][type='text']")).clear();
		driver.findElement(By.cssSelector("input[aria-label='First name'][type='text']")).sendKeys("attribute");
		
		
		/*
		 * Locate element using dynamic css 
		 * 
		 * 	Syntax:-.
		 * 					tagname[prop*='matching characters']
		 */
		
		driver.findElement(By.cssSelector("input[aria-label*='First']")).clear();
		driver.findElement(By.cssSelector("input[aria-label*='First']")).sendKeys("dynamic contains");
		
		driver.findElement(By.cssSelector("input[id$='1']")).clear();
		driver.findElement(By.cssSelector("input[id$='1']")).sendKeys("webdriver");
		
		driver.findElement(By.cssSelector("input[id$='3']")).clear();
		driver.findElement(By.cssSelector("input[id$='3']")).sendKeys("newwebdriver");
		
		
		driver.findElement(By.cssSelector("input[id$='5']")).clear();
		driver.findElement(By.cssSelector("input[id$='5']")).sendKeys("newwebdriver");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
		
				