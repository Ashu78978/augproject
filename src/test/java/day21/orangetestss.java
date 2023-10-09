package day21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class orangetestss {

	public static void main(String[] args) throws InterruptedException {


		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		
		
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		Thread.sleep(4000);

		////h6[normalize-space()='Dashboard']
		
		String act_value=driver.findElement(By.xpath("//h6[normalize-space()='Dashboard']")).getText();
		String exp_value="Dashboard";
		
		if(exp_value.equals(act_value))
			
		{
			
			System.out.println("test passed");
		}
		else 
		{
			System.out.println("test failed");

			
		}

		
		
		
		
		
		

		
		
		
	}

}
