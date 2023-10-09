package day27;
/*
 * 
The code you provided is a Java program that uses Selenium WebDriver to automate a web browser (Chrome in this case) to perform actions on a web page. It includes the use of an implicit wait to instruct the WebDriver to wait for a specified amount of time for elements to become available before throwing an exception if they are not found.

Here's a breakdown of the code:

Import necessary packages:

java
Copy code
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
Create a WebDriver instance for Chrome:

java
Copy code
WebDriver driver = new ChromeDriver();
Set an implicit wait using implicitlyWait():

java
Copy code
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
This line tells the WebDriver to wait for a maximum of 10 seconds when trying to find elements. 
If an element is not found within this time frame, it will throw an exception.

Open a web page and maximize the window:

java
Copy code
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
driver.manage().window().maximize();
Find an input field by XPath and send "Admin" as text:

java
Copy code
driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
This code locates an input field on the web page using its XPath and sends the "Admin" text to it.

Note that the implicit wait you've set will apply to all subsequent findElement() calls. 
If an element is not found within the specified 10-second timeout, 
WebDriver will wait for up to 10 seconds for it to become available before throwing an exception.
 */
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitDemo {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // IMPLICIT WAIT
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
				
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		
	

	}

}
