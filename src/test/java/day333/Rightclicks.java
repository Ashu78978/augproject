package day333;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
/*
 * It looks like you've provided a code snippet written in Java for automating a web browser using Selenium WebDriver.
 *  This code appears to be opening a webpage, finding an element by its XPath, 
 *  and then performing a right-click (context click) action on that element. Here's a breakdown of the code:

WebDriver driver = new ChromeDriver();: This line initializes a Chrome WebDriver instance,
 which allows you to interact with the Chrome web browser.

driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
: It navigates to the specified URL, which is "http://swisnl.github.io/jQuery-contextMenu/demo.html" in this case.

WebElement buttons = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
: This line finds a web element on the webpage using its XPath expression and stores it in the buttons variable.
 The XPath expression is used to locate the element with the specified class attributes.

Actions act = new Actions(driver);: Here, an instance of the Actions class is created,
 which is used for performing various user interactions, such as mouse actions.

act.contextClick(buttons).perform();: This line performs a right-click (context click) action on the buttons WebElement 
using the contextClick method of the Actions class. The perform method is used to execute the action.

This code essentially simulates a right-click action on the specified element on the webpage, which might trigger a context menu or other actions associated with right-clicking.
 */
public class Rightclicks {

	public static void main(String[] args) {

		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		
		WebElement buttons=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		
		
		Actions act=new Actions(driver);
		act.contextClick(buttons).perform();
		
		
		driver.findElement(By.xpath("//li[@class='context-menu-item context-menu-icon context-menu-icon-copy']")).click();
		
		
		driver.switchTo().alert().accept();
	}

}
