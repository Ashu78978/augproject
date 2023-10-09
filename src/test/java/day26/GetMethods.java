package day26;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class GetMethods {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();  // maximize browser window
		
		Thread.sleep(3000);
		
		//getTitle()
		
		System.out.println("Title:"+driver.getTitle());
		
		//getCurrentURL()
	//	System.out.println("Current page url:"+driver.getCurrentUrl());
		
		//getPageSource()
		//System.out.println("Page source......................."+driver.getPageSource());
		
		//getWindowHandle()
	//	System.out.println("Browser Window ID:"+driver.getWindowHandle()); 
		//583BD231CA500D5BA9F3D67F73663F61
		//AF49E60F15B65B88817D42B4B5CE017B
		
		//getWindowHandles()
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		Thread.sleep(3000);
		
		Set<String> windowIDs=driver.getWindowHandles();
		
		for(String winid:windowIDs)
		{
			System.out.println(winid);   //9680D6EB4611A8876656CA0ECBDC8C15
			//5CE676E3E47689ED6076E8B6B140FA33
			
			//System.out.println(driver.switchTo().window(winid).getTitle());
			
			
		}
		
	}

}
