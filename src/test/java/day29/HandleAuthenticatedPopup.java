package day29;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleAuthenticatedPopup {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		//driver.get("http://the-internet.herokuapp.com/basic_auth");
		//http://username:password@url
		//http://admin:admin@the-internet.herokuapp.com/basic_auth
		
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		
	}

}
