package day23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocatorsDemo {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver(); // Launching browser
		 
		driver.get("https://demo.nopcommerce.com/");  // openining URL on the browser
		driver.manage().window().maximize(); // maximize the browser window
		

		//css selectors
		
		// tag id   #
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-shirts");
		//driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("T-shirts");
		
		// tag class   .
		//driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("T-shirts");
		//driver.findElement(By.cssSelector(".search-box-text")).sendKeys("T-shirts");
		
		//tag  attribute   []
		//driver.findElement(By.cssSelector("input[placeholder='Search store]")).sendKeys("T-shirts");
		//driver.findElement(By.cssSelector("[placeholder='Search store']")).sendKeys("T-shirts");
		
		
		// tag class attribute
		//driver.findElement(By.cssSelector("input.search-box-text[placeholder='Search store']")).sendKeys("T-shirts");
		driver.findElement(By.cssSelector("input.search-box-text[placeholder=\"Search store\"]")).sendKeys("T-shirts");
		driver.findElement(By.xpath("//*[@id=\"small-search-box-form\"]/button")).click();
		// slash double qotation inside double quotation is allowed if we keep slash symbol
	//	String data="T-shirts";
		//driver.findElement(By.cssSelector(".search-box-text[placeholder='Search store']")).sendKeys(data);
		
		
	}

}
