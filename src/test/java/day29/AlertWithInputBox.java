package day29;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertWithInputBox {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
			
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		Thread.sleep(5000);
		
		Alert alertwindow=driver.switchTo().alert();
		
		alertwindow.sendKeys("Welcome");
		alertwindow.accept();
		
		String act_msg=driver.findElement(By.xpath("//p[@id='result']")).getText();
		
		if(act_msg.contains("Welcome"))
		{
			System.out.println("Test passed");
		}
		else
		{
			System.out.println("Test failed");
		}
		
		
	}

}
