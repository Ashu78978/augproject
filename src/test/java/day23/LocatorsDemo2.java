package day23;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
/*
 * 
<a href="xyz..html>Text </a>

<a href="sas.html>    </a>

findElement(loc)
findElements(loc)

Scenario1:  Locator is matching with single web element.
-----                                          //return type
findElement(loc) ---> single web element     WebElement
findElements(loc) ---> single web element     List<WebElement> // 1 or many 

Scenario2: Locator matching with multiple web elements.
------                                                   //return type
findElement(loc) ---->  single webelement    			WebElement    //1st element will be returned
findElements(loc) -----> multiple web elements		List<WebElement>	

Scenario3:  Locator is not matching with any of the elements.
-----
findElement(loc)  ---> NoSuchElement Exception
findElements(loc) -- returns zero


HTML    JavaScript    CSS

CSS - Cascading Style Sheets
different combinations to write css,sometimes id,name may not be available then we choose css selector

tag  ID     #
tag   class    .
tag  attribute     []
tag class attribute   .   []


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.*;

abc.txt
xyz.txt
pqr.png

*.txt
regular expression
*
/
^
$
%

<img placeholder="xyz />
<input placeholder="xyz"/>

img[placeholder="xyz"]
 */
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo2 {

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
		//List<WebElement> headerlinks=driver.findElements(By.className("list-inline-item"));
		//System.out.println("Number of header links:"+headerlinks.size());
		
		//tagname  - number of images
		List<WebElement> images=driver.findElements(By.tagName("img"));
		System.out.println("total number of images:"+images.size());
		
		//tagname - number of links
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Total number of links:"+ links.size());
		
		for(WebElement link:links)
		{
			System.out.println(link.getText());
		}
		
		driver.quit();
		
	}

}





