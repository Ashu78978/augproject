package day34;
/*
 * 
 * 
Your Java program is using Selenium WebDriver and JavaScriptExecutor to interact with a web page. Specifically, it's working with an input field on a webpage inside an iframe.

Here's a breakdown of what the code does:

Imports necessary Selenium WebDriver and JavaScriptExecutor classes.
Initializes a ChromeDriver instance.
Navigates to the "https://testautomationpractice.blogspot.com/" website.
Maximizes the browser window.
Switches to the first iframe on the page using driver.switchTo().frame(0). This is done to interact with elements inside the iframe.
Creates a JavascriptExecutor object named js by casting the driver object.
Next, it interacts with an input field using JavaScript:

It locates the input field with the id "RESULT_TextField-1" and stores it in the WebElement variable firstname.
It uses the js.executeScript method to execute a JavaScript code snippet. The JavaScript code sets the "value" attribute of the input field to "john", effectively changing the input field's value to "john".
This approach can be useful when you need to manipulate web elements using 
JavaScript for various reasons, such as when Selenium's built-in methods are insufficient.





It locates the radio button element with the id "RESULT_RadioButton-7_0" 
using driver.findElement(By.id("RESULT_RadioButton-7_0")) and stores it in the radiobutton WebElement.

It uses JavaScriptExecutor (js.executeScript) to execute JavaScript code 
to perform a click action on the radio button element.

java
Copy code
js.executeScript("arguments[0].click();", radiobutton);
This line of code executes JavaScript to simulate a click on the radio button element
 specified by arguments[0], which corresponds to the radiobutton WebElement.

This approach can be useful when standard WebDriver click actions encounter
 exceptions due to element visibility, overlapping elements, or other issues.

Just make sure to handle potential exceptions and verify that the radio button 
click action works as expected in your specific scenario.







It appears that you are using JavaScriptExecutor to click on a checkbox element with the id "RESULT_CheckBox-8_0." 
This approach can be useful when you encounter exceptions like 
"ElementClickInterceptedException" when trying to click elements using standard WebDriver methods.

Here's a breakdown of what this code does:

It locates the checkbox element with the id "RESULT_CheckBox-8_0" using driver.findElement(By.id("RESULT_CheckBox-8_0")) and stores it in the checkbox WebElement.

It uses JavaScriptExecutor (js.executeScript) to execute JavaScript code 
to perform a click action on the checkbox element.

java
Copy code
js.executeScript("arguments[0].click();", checkbox);
This line of code executes JavaScript to simulate a click on the checkbox 
element specified by arguments[0], which corresponds to the checkbox WebElement.

This approach can help overcome issues where standard WebDriver
 click actions encounter exceptions due to element visibility, overlapping elements, or other factors.

Remember to handle potential exceptions and verify that the checkbox
 click action works as expected in your specific use case

 */
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorDemo {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		//JavascriptExecutor js=driver;    // ChromeDriver class
		JavascriptExecutor js=(JavascriptExecutor)driver;  // WebDriver
		
		
		//Inputbox
		//driver.findElement(By.id("RESULT_TextField-1")).sendKeys("welcome");
		WebElement firstname=driver.findElement(By.id("RESULT_TextField-1"));
		js.executeScript("arguments[0].setAttribute('value','john')",firstname );
		
		
		/*
		//radio button
		//driver.findElement(By.id("RESULT_RadioButton-7_0")).click();//ElementClickInterceptedException:
		WebElement radiobutton=driver.findElement(By.id("RESULT_RadioButton-7_0"));
		js.executeScript("arguments[0].click();",radiobutton );
		
		//checkbox
		//driver.findElement(By.id("RESULT_CheckBox-8_0")).click(); //ElementClickInterceptedException
		WebElement checkbox=driver.findElement(By.id("RESULT_CheckBox-8_0"));
		js.executeScript("arguments[0].click();",checkbox);
		
		//button
		//driver.findElement(By.id("FSsubmit")).click();
		WebElement button=driver.findElement(By.id("FSsubmit"));
		js.executeScript("arguments[0].click();",button);
		
		*/
		
	}

}
