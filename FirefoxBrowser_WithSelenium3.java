package org.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser_WithSelenium3 {

	public static void main(String[] args) 
	{
		/*
		 * how to download gecko driver
		 * 		1. Visit selenium official website   http://seleniumhq.org
		 * 		2. click on download tab
		 * 		3. under thirdparty browser bindings and plugins
		 * 		4. click on mozilla geckodriver
		 * 		5. w.r.t operating system download zip file
		 * 		6. after download unzip location and store into backupdriver
		 * 	
		 * 		before lunch firefox driver set runtime environment property
		 * 		
		 */
		
		System.setProperty("webdriver.gecko.driver", "browsers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		
		
		
		
		
		
		
		
		
		
		

	}

}
