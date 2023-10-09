package day333;
/*
 * 
 * 
It looks like you've written a Java program using the Selenium WebDriver library 
to perform a mouse hover action on a website. 
This code appears to navigate to the OpenCart demo website
 and perform a series of mouse hover actions on the navigation menu.

Here's a breakdown of what the code does:

Imports necessary Selenium WebDriver and Actions classes.
Initializes a ChromeDriver instance.
Navigates to the "https://demo.opencart.com/" website.
Locates the "Desktops," "Mac (1)," and "Components" elements using XPath.
Locates the "Monitors (2)" element.
Creates an Actions object named "act."
Adds a brief pause (3 seconds) to allow the page to load (handled with Thread.sleep(3000)).
Performs a series of mouse hover actions in sequence:
Hover over the "Desktops" menu item.
Hover over the "Mac (1)" sub-menu item.
Hover over the "Components" sub-menu item.
Hover over the "Monitors (2)" sub-menu item.
Prints "action performed successfully" to the console.
This code demonstrates how to use the Selenium WebDriver library
 to interact with web elements and perform mouse hover actions.
  It's important to note that web elements' XPath locators should be accurate 
  and stable for this code to work reliably, and it also uses a sleep statement for simplicity.
   In a real automation scenario, you might want to use explicit waits for better synchronization
    instead of hard-coded sleep statements.
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MOUSEhover {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		WebElement players= driver.findElement(By.xpath("//a[normalize-space()='MP3 Players']"));
		
		WebElement playerstest= driver.findElement(By.xpath("//a[normalize-space()='test 12 (0)']"));
		
		Actions act=new Actions(driver);
		Thread.sleep(5000);
		
		act.moveToElement(players).moveToElement(playerstest).perform();

		
		
		
	}

}
