package day35;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/*
 * 
 * Your Java program is designed to find and check the status of links on a web page to identify broken links. Here's a breakdown of what the code does:

1. Imports necessary Selenium WebDriver and Java IO classes.
2. Initializes a ChromeDriver instance with a 10-second implicit wait.
3. Navigates to the "http://www.deadlinkcity.com/" website and maximizes the browser window.
4. Locates all the anchor elements (`<a>`) on the web page using
 `driver.findElements(By.tagName("a"))` and stores them in a list named `links`.
5. Prints the total number of links found on the page.
6. Initializes a counter variable `brokenlinks` to keep track of the number of broken links.

The code then iterates through each link in the `links` list and performs the following checks:

- Checks if the `href` attribute value is null or empty. If so, it skips that link since it cannot be checked.
- Tries to create a URL object from the `href` attribute value.
- Opens a connection to the URL and checks the HTTP response code.
 If the response code is greater than or equal to 400, 
 it considers the link as broken and increments the `brokenlinks` counter.
- If the response code is not greater than or equal to 400, it considers the link as not broken.

Finally, the code prints the total number of broken links found on the web page.

This program can be useful for checking the health of links 
on a website and identifying any broken ones. However,
 please note that it's a basic example, and in a real-world scenario,
  you might want to handle exceptions more robustly and potentially log the results for further analysis.
 * 1) link   href="xyz.com"
2) status code >=400
 */

public class BrokenLinks {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());//48
		
		int brokenlinks=0;
		
		for(WebElement linkElement:links)
		{
			String hrefAttValue=linkElement.getAttribute("href");
			
			if(hrefAttValue==null || hrefAttValue.isEmpty())
			{
				System.out.println("Href attribute is null or empty.Not possible to check link");
				continue;
			}
			
			try
			{
				URL linkurl=new URL(hrefAttValue);
				HttpURLConnection conn=(HttpURLConnection)linkurl.openConnection();
				conn.connect();
				if(conn.getResponseCode()>=400)
				{
					System.out.println(hrefAttValue+"======>Broken link");
					brokenlinks++;
				}
				else 
				{
					System.out.println(hrefAttValue+"======>NOT Broken link");
				}
			}
			catch(Exception e){}
		}
		
		System.out.println("Total number of broken links:"+brokenlinks);
		
	}

}
