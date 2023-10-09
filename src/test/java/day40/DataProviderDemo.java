package day40;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	WebDriver driver;
	
	@BeforeClass
	void setup()
	{
		driver=new ChromeDriver();
	}
	
	@Test(dataProvider="dp1")
	void testLogin(String email, String pwd)
	{
		driver.get("https://demo.nopcommerce.com/login");
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
		
		String exp_title = "nopCommerce demo store";
		String act_title = driver.getTitle();

		Assert.assertEquals(exp_title, act_title);
	}
	
	@AfterClass
	void tearDown()
	{
		driver.quit();
	}
	
	@DataProvider(name="dp1",indices= {0,4})     // 0, 4 are row numbers in array
	Object [][] loginData()
	{
		Object data[][]= { 
				{ "abc@gmail.com", "test123" }, 
				{ "pavanol@gmail.com", "test@123" },
				{ "pavanoltraining@gmail.com", "test3" },
				{ "pavanoltraining@gmail.com", "test@123" },
				{ "pavanoltraining@gmail.com", "test@123" } 
			 };
		return data;
	}
	
	
}







