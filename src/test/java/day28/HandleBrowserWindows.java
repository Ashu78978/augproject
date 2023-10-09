  package day28;
  /*
   * 
It looks like you are working with multiple browser windows or tabs in Selenium WebDriver. 
In this code snippet, you are switching between the parent and child windows. Here's an explanation of the code:

You initialize a Chrome WebDriver and set an implicit wait of 10 seconds
 using driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));.

You navigate to the OrangeHRM login page and maximize the browser window.

You find an element with the text "OrangeHRM, Inc" and click on it. This action opens a new browser window or tab.

You retrieve all the window handles (IDs) using driver.getWindowHandles() 
and store them in a Set<String> called windowIDs.

You create a List<String> called windowslist and add the window IDs
 from the set to it. This is a way to convert the set to a list 
 so that you can easily access the individual window IDs.

You retrieve the parent and child window IDs from the list.
 windowslist.get(0) gives you the parent window ID, and windowslist.get(1) gives you the child window ID.

You use driver.switchTo().window(childWindowID) to switch the WebDriver's focus to the child window.

You print the title of the child window using driver.getTitle(), 
which will print the title of the newly opened page in the child window.

You then switch back to the parent window using driver.switchTo().window(parentWindowID)
 and print the title of the parent window.

This code demonstrates how to switch between different browser windows 
or tabs that are opened during your testing. It's a common scenario 
when working with web applications that open new windows for various purposes.
   */
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

import java.util.ArrayList;
import java.util.List;


public class HandleBrowserWindows {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		Set<String> windowIDs=driver.getWindowHandles();
		
		//Approach1 - using List collection
		List<String> windowslist=new ArrayList(windowIDs);
		
		String parentWindowID=windowslist.get(0);
		String childWindowID=windowslist.get(1);
		
		//Switch to child window
		driver.switchTo().window(childWindowID);
		System.out.println(driver.getTitle()); //OrangeHRM HR Software | Free & Open Source HR Software | HRMS | HRIS | OrangeHRM
		
		//Switch to parent window
	 	driver.switchTo().window(parentWindowID);
		System.out.println(driver.getTitle());//OrangeHRM
		
		
		
		//Approach 2 : using looping statement
		
		
		/*
		for(String winid:windowIDs)
		{
			String title=driver.switchTo().window(winid).getTitle();
			if(title.equals("xyz")|| title.equals("abc") || title.equals("123"))
			{
				//System.out.println(driver.getCurrentUrl());
				driver.close();
				
			}
		}
		
		*/
		
		
	}

}






