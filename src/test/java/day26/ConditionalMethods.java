package day26;
/*
 * 
The Java code you've provided demonstrates the use of three different methods in Selenium WebDriver to interact with web elements and check their properties: isDisplayed(), isEnabled(), and isSelected(). Here's a brief explanation of each part of your code:

isDisplayed() method:

This method is used to check if a web element is visible or displayed on the web page.
In your code, you find the logo image element and use isDisplayed() to check if it is visible on the page.
The result (true or false) is printed to the console.

isEnabled() method:

This method is used to check if a web element is enabled or interactive (e.g., input fields, buttons).
In your code, you find the search box input element and use isEnabled() to check if it is enabled.
The result (true or false) is printed to the console.


isSelected() method:

This method is typically used with radio buttons and checkboxes to check if they are selected (checked) or not.
In your code, you find two radio buttons, one for male and one for female.
Initially, you print the selected status of both radio buttons (both should be false).
Then, you select the male radio button and print the selected status again (male_radio.isSelected() should be true and female_radio.isSelected() should be false).
Finally, you select the female radio button and print the selected status again (male_radio.isSelected() should be false and female_radio.isSelected() should be true).
This code is useful for verifying the state of web elements and can be used as part of your test automation scripts to ensure that elements are correctly displayed, enabled, or selected as expected during various user interactions.
 */
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConditionalMethods {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
//		driver.get("https://demo.nopcommerce.com/register");
//		driver.manage().window().maximize();
//		
		//isDisplayed()
//		WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
//		System.out.println("Display status of logo:"+logo.isDisplayed());
//		
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		boolean logos=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		System.out.println("Display status of logo:"+logos);
		
		
//		
//		//isEnabled()
//		boolean enablestatus=driver.findElement(By.xpath("//input[@id='small-searchterms']")).isEnabled();
//		System.out.println("Enable status of search box:"+enablestatus);
//		
//		//isSelected()
//		
//		
//		WebElement male_radio=driver.findElement(By.xpath("//input[@id='gender-male']"));
//		WebElement female_radio=driver.findElement(By.xpath("//input[@id='gender-female']"));
//		
//		System.out.println("Before selection.........");
//		System.out.println(male_radio.isSelected());  //false
//		System.out.println(female_radio.isSelected());  //false
//		
//		male_radio.click();
//		System.out.println("After selecting male readio button.........");
//		System.out.println(male_radio.isSelected());   //true
//		System.out.println(female_radio.isSelected());  //false
//		
//		female_radio.click();
//		System.out.println("After selecting female readio button.........");
//		System.out.println(male_radio.isSelected());   //false
//		System.out.println(female_radio.isSelected());  //true
//		
//		
//		
		
		
		

	}

	

}


////img[@alt='company-branding']
