package day34;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;


public class TabsAndWindowsDemo {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.opencart.com/");
		
		//driver.switchTo().newWindow(WindowType.TAB); // Opens new tab
		driver.switchTo().newWindow(WindowType.WINDOW); // Opens new window
		
		
		driver.get("https://www.orangehrm.com/");
		
		

	}

}
