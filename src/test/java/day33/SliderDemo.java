package day33;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/*
 * 
 * 
 * 
 * It seems like you've written a Java program using the Selenium WebDriver library to interact with a price range slider on a web page. This code opens a web page with a price range slider and demonstrates how to manipulate the sliders by dragging and dropping them.

Here's a breakdown of what the code does:

Imports necessary Selenium WebDriver and Actions classes.
Initializes a ChromeDriver instance.
Navigates to the "https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/" website.
Maximizes the browser window.
Creates an Actions object named "act."
Locates the minimum slider element and prints its initial location.
Drags the minimum slider to the right by 100 pixels and prints its new location.
Locates the maximum slider element and prints its initial location.
Drags the maximum slider to the left by 95 pixels and prints its new location.
This code demonstrates how to use the Selenium WebDriver library 
along with the Actions class to interact with sliders on a web page.
 It effectively changes the position of the sliders by specifying the number of pixels to drag them horizontally.
 */
public class SliderDemo {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		
		
		Actions act=new Actions(driver);
		
		//Min slider
		WebElement min_slider=driver.findElement(By.xpath("//body//div//span[1]"));
		System.out.println("current location of min slider:"+min_slider.getLocation());// (58, 249)
		
		act.dragAndDropBy(min_slider, 100, 249).perform();

		System.out.println("After moving location of min slider:"+min_slider.getLocation()); //(162,249)
		
		//Max slider
		WebElement max_slider=driver.findElement(By.xpath("//body//div//span[2]"));
		System.out.println("current location of max slider:"+max_slider.getLocation()); //(795, 249)
		act.dragAndDropBy(max_slider, -95, 249).perform();
		System.out.println("After moving location of max slider:"+max_slider.getLocation()); 
		
		
	}

}
