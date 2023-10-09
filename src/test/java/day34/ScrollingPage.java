package day34;
/*
 * 
It seems like you're using JavaScriptExecutor to scroll a web page by 3000 pixels vertically and then printing the page's vertical scroll position.

Here's what the code does:

js.executeScript("window.scrollBy(0,3000)","");: This line of code uses JavaScript to scroll the web page vertically by 3000 pixels. It effectively scrolls the page downward by
 3000 pixels from its current position. 
 The window.scrollBy method takes two arguments:
  horizontal and vertical scroll amounts. In this case,
   you're scrolling vertically by 3000 pixels (0 for horizontal, 3000 for vertical).

System.out.println(js.executeScript("return window.pageYOffset;")); 
//300: After scrolling the page, this line of code uses JavaScript
 *  to retrieve the current vertical scroll position (in pixels) using
 *   the window.pageYOffset property. It then prints the scroll position to the console.

The comment indicates that the output of this code is "300," 
which suggests that after scrolling, the page's vertical scroll position is 300 pixels from the top.
 This means that the page has been scrolled downward by 300 pixels.

This kind of scroll operation can be useful for navigating 
through a long web page or bringing specific elements into view. Just keep in mind that 
the actual scroll amount may vary depending on the page's content and structure.












The code you provided demonstrates scrolling down to the end of a web page using JavaScriptExecutor and then scrolling back to the initial point. Here's what each part of the code does:

js.executeScript("window.scrollBy(0,document.body.scrollHeight)");: This line of code uses JavaScript to scroll the web page down to the end of the document. document.body.scrollHeight represents the height of the entire document. By scrolling vertically by this height, you effectively scroll to the end of the page.

System.out.println(js.executeScript("return window.pageYOffset;"));: After scrolling, this line of code prints the current vertical scroll position (in pixels) using window.pageYOffset. It should show the maximum scroll position, indicating that you've scrolled to the end of the page.

Thread.sleep(5000);: This line introduces a 5-second delay (5000 milliseconds) using Thread.sleep(). It pauses the script to allow you to observe the page scroll to the end.

js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");: This line uses JavaScript to scroll the page back to the initial point. It scrolls up by the negative value of the document's height, effectively returning the page to the top.

Overall, this code demonstrates how to scroll a web page using JavaScriptExecutor to both the end of the document and back to the top. It can be useful when you need to navigate through long web pages or when performing actions that require elements to be in view.
 */

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ScrollingPage {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//1) scroll down page by pixel number
		//js.executeScript("window.scrollBy(0,3000)","");
		//System.out.println(js.executeScript("return window.pageYOffset;")); //300
		
		//2) scroll down the page till the element is visible
		
		/*WebElement flag=driver.findElement(By.xpath("//img[@alt='Flag of India']"));
		
		js.executeScript("arguments[0].scrollIntoView();",flag);
		System.out.println(js.executeScript("return window.pageYOffset;")); //7567.7919921875
		*/
		
		//3) scroll down the page till end of the document
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		Thread.sleep(5000);
		
		//go back to initial point
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
	}

}
