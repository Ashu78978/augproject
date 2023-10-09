package day33;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
/*
 * 
 * 
It appears that you've written a Java program using the Selenium WebDriver library to perform drag-and-drop actions on a web page. This code navigates to a page with draggable elements and moves them to their respective drop targets.

Here's a breakdown of what the code does:

Imports necessary Selenium WebDriver and Actions classes.
Initializes a ChromeDriver instance.
Navigates to the "http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html" website.
Maximizes the browser window.
Creates an Actions object named "act."
Locates the draggable element ("Rome") and its corresponding drop target ("Italy").
Performs a drag-and-drop action to move the "Rome" element to the "Italy" drop target.
Locates another draggable element ("Washington") and its corresponding drop target ("USA").
Performs a drag-and-drop action to move the "Washington" element to the "USA" drop target.
This code demonstrates how to use the Selenium WebDriver library along with the Actions class 
to perform drag-and-drop operations on a web page. The provided XPath locators
 should accurately identify the elements to be dragged and dropped.
 */


public class DragAndDropAction {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		
		// rome ---> Italy
		WebElement rome=driver.findElement(By.xpath("//div[@id='box6']"));
		WebElement italy=driver.findElement(By.xpath("//div[@id='box106']"));
		
		act.dragAndDrop(rome, italy).perform(); // drag and drop
		
		//washington-->USA
		WebElement washington=driver.findElement(By.xpath("//div[@id='box3']"));
		WebElement usa=driver.findElement(By.xpath("//div[@id='box103']"));
				
		act.dragAndDrop(washington, usa).perform(); 
		
	}

}
