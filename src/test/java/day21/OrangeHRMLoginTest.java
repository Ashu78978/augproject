package day21;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

/*
1) Launch browser( chrome)
2) open URL
	https://opensource-demo.orangehrmlive.com/
3) Provide username - Admin
4) Provide password - admin123
5) Click on login button
6) Verify dashboard page display
7) close browser
 */

public class OrangeHRMLoginTest {

	public static void main(String[] args) throws InterruptedException 
	{
		//1) Launch browser( chrome)
		//System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe"); //old method
		
		System.out.println("Provide browser name:");
		
		Scanner sc=new Scanner(System.in);
		String browserName=sc.next();
		
		WebDriver driver=null;
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver(); // chrome browser
		}
		else if(browserName.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver(); 
		}
		else
		{
			System.out.print("Provide proper browser name");
		}	
		
		//driver.quit();
			
		driver.manage().window().maximize();
		
		//2) open URL
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(3000);
		
		//3) Provide username - Admin
		//name="username" 
		
		//WebElement txtuserName=driver.findElement(By.name("username"));
		//txtuserName.sendKeys("Admin");
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		//4) Provide password - admin123
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		//5) Click on login button
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		Thread.sleep(3000);
		
		
		//6) Verify dashboard page display
					
		String act_value=driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[1]/div[1]/span/h6")).getText();
		String exp_value="Dashboard";
		
		if(act_value.equals(exp_value))
		{
			System.out.println("Login test pased");
		}
		else
		{
			System.out.println("Login Test failed");
		}
		
		//7) close browser
		//driver.close();
		driver.quit();
	}

}


