package day28;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalMethods {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		//driver.get("https://demo.opencart.com/");
		driver.navigate().to("https://demo.opencart.com/"); // opens URL on the browser
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().to("https://www.orangehrm.com/");
		System.out.println(driver.getCurrentUrl());

		driver.navigate().back();
		System.out.println(driver.getCurrentUrl()); // opencart
		
		
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl()); // orangehrm
		
		
		driver.navigate().refresh();
		
		

	}

}
