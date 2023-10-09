package day29;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HandleAlerts {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10)); // explicit wait
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		Thread.sleep(3000);
		
		//Approach 1
		//driver.switchTo().alert().accept();   // close alert window using OK button
		//driver.switchTo().alert().dismiss();  // close alert window using cancel button
		
		//Appraoch2
		//capture alert window in to a variable in Alert class
		//capture text value
		/*Alert alertwindow=driver.switchTo().alert();
		System.out.println("msg from alert:"+alertwindow.getText());
		alertwindow.accept();
		*/
		
		//Appraoch3 : without using switching command using explicit wait
		
		Alert alertwindow=mywait.until(ExpectedConditions.alertIsPresent());
		System.out.println("msg from alert:"+alertwindow.getText());
		alertwindow.accept();
	}

}
