package day22;

/*
 * 
1) Identifying elements - Locators
2) Perform actions - Methods

Locator - Locate the web elements

findElement(Loc)
findElements(Loc)

selectorsHub - plugin for browsers.


<a href="sdasdasda"> Click Me </a>


Click me
//Help me

driver.findElement(By.partialLinkText("me"));     // dont prefer this



 */
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocatorsDemo {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver(); // Launching browser
		 
		driver.get("https://demo.opencart.com/");  // openining URL on the browser
		driver.manage().window().maximize(); // maximize the browser window
	
		//name
		//driver.findElement(By.name("search")).sendKeys("Mac");
		
		//id
		//boolean logostatus=driver.findElement(By.id("logo")).isDisplayed();
		//System.out.println("Logo display status:"+ logostatus);
		
		//linkText & partialLinkText
		//driver.findElement(By.linkText("Tablets")).click();
		//driver.findElement(By.partialLinkText("Table")).click();
		
		//classname
		List<WebElement> headerlinks=driver.findElements(By.className("list-inline-item"));
		System.out.println("Number of header links:"+headerlinks.size());
		
		
	}

}

