package org.webdriver;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CaptureScreenShot {

	public static void main(String[] args)
	{
		//Launching webpage
		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		try {
			
			File fi=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(fi, new File("screens\\image.png"));
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		/*
		 * PNG:---> Portable network graphic image extension
		 * Fileutils :---> import org.apache.commons.io.FileUtils;
		 * Date      :---> 		java.util
		 * Surrond with Try catch block to handle exceptions
		 * use doble "\\" to avoid exceptions, Single slash is escape sequence in java
		 */
		
		
		//Create simple Date format
		DateFormat df=new SimpleDateFormat("yyyy/MMM/dd/ hh_mm_ss");
		Date d=new Date();
		String time=df.format(d);
		
		
		try {
			
			File fi=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(fi, new File("screens\\"+time+"img.png"));
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		

	}

}
