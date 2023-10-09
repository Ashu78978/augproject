package day24;


/*
 * 
 * 
Day-24
----------
XPath
----
Address of the element

DOM - Document Object Model

2 types of xpaths
---
1) Absolute xpath(Full xpath)
	Ex:   /html/body/header/div/div/div[2]/div/input
		 /html[1]/body[1]/header[1]/div[1]/div[1]/div[2]/div[1]/input[1]

2) Relative Xpath ( Partial xpath)
	//input[@name='search']
	//input[@placeholder='Search']


which one you will prefer?   Relative xpath

why?
	bcoz absolute xpath wont work if there are any changes in web page.


How to create our own relative xpath?
------------------------------------------------
//tagname[@attrubute-name='value']

or

//*[@attrubute-name='value']


//div[@class='description']/h4/a

//div[@id='content']//div[@class='description']//div[1]/h4/a

if we dont have attribute of a element navigate  to parent elment and find the element


<a href="https://demo.opencart.com/index.php?route=product/product&amp;language=en-gb&amp;product_id=43">MacBook</a>


//a[text()='MacBook']     /// static inner text   full text
 * 
 // we use this function when elements are dynamically changing
 
//a[contains(text(), 'Book')]     /// partial text
//a[starts-with(text(), 'MacB')]     // Prefix MacB


multiple attributes in xpath
--------

<input type="text" name="search" value="" placeholder="Search" class="form-control form-control-lg">
//input[@name='search'][@placeholder='Search']

 and   or   in xpath
-----------------------
//input[@name='search' and @placeholder='Search' ]
//input[@name='search' and @placeholder='xyz' ]    //false  // both attributes values should be true

//input[@name='search' or placeholder='xyz']       // atleast one attribute value should be true


xpath options
----------
single attribute
multiple attributes
and
or
text()     normalize-space()
contains()
start-with()


//input[text()='MacBook']
//input[normalize-space()='Mac Book']
























 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDemo {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		String prodname=driver.findElement(By.xpath("//a[text()='MacBook']")).getText();
		System.out.println(prodname);

	}

}
