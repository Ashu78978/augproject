package day27;
/*
 * The code you've posted is a Java program that demonstrates the use of explicit waits in Selenium WebDriver. It appears to be automating the login process on a web page using the Chrome WebDriver.

Here's an explanation of what the code does:

It imports the necessary Selenium WebDriver classes.

It creates a ChromeDriver instance, which is used to automate interactions with the Chrome browser.

It creates a WebDriverWait instance named mywait with a timeout of 10 seconds.
 This means that the WebDriver will wait for up to 10 seconds
  for certain conditions to be met before proceeding with the automation.

It navigates to the URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login" and maximizes the browser window.

Inside a try-catch block, it uses explicit waits to wait for specific conditions on the web page:

It waits for the visibility of the "Username" input field using the XPath locator and assigns it to the txtusername WebElement.
It waits for the visibility of the "Password" input field using the XPath locator and assigns it to the txtpassword WebElement.
It waits for the "Login" button to be clickable using the XPath locator and assigns it to the loginbtn WebElement.
It catches any exceptions that may occur during the wait conditions and does nothing with them (the catch block is empty in this case).

Finally, it attempts to interact with the web page by sending "Admin" to the username input field, "admin123" to the password input field, and clicking the "Login" button.

The use of explicit waits in this code ensures that the WebDriver waits for the specified conditions to be met before performing actions on the web page. This helps in handling synchronization issues and makes the automation more robust. If the specified conditions are not met within the specified timeout (10 seconds in this case), a timeout exception will be raised.
 */
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10)); // declaration
		
					
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
				
		try
		{
WebElement txtusername=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
txtusername.sendKeys("Admin");
		
		

		
		
//WebdriverWait mywait=new WebdriverWait(driver,Duration.ofSeconds());		
		
		
		
		
		WebElement txtpassword=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']")));
		txtpassword.sendKeys("admin123");
		
		WebElement loginbtn=mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Login']")));
		loginbtn.click();
		}
		catch(Exception e)
		{
			// empty
		}
	}

}
