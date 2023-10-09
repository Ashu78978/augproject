package day35;
/*
 * 
 * 
The code you provided captures a full-page screenshot using Selenium WebDriver in Java.
 Here's a breakdown of what it does:

Imports necessary Selenium WebDriver, Java IO, and Apache Commons IO classes.

Initializes a ChromeDriver instance with a 10-second implicit wait.

Navigates to the "https://demo.nopcommerce.com/" website and maximizes the browser window.

Uses the TakesScreenshot interface to capture a screenshot of the entire web page.

Saves the captured screenshot to a File object named source.

Specifies the target location and file name where you want 
to save the screenshot. In this case, it saves it to a "fullpage.png" 
file in a "screenshots" directory located in the project directory.

Uses the FileUtils.copyFile method from Apache Commons IO to copy the source file (screenshot) to the target file.

With this code, a full-page screenshot of the web page
 at "https://demo.nopcommerce.com/" will be captured and saved as
  "fullpage.png" in the "screenshots" directory within your project directory.
 */
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenshots {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//Capture full page
		/*TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File target=new File(System.getProperty("user.dir")+"\\screenshots\\fullpage.png");
		FileUtils.copyFile(source, target);
		*/
		
		// Capture screenshot of specific section
		
		/*WebElement featuredProducts=driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
		File sourcefile=featuredProducts.getScreenshotAs(OutputType.FILE);
		File targefile=new File(System.getProperty("user.dir")+"\\screenshots\\featuredprods.png");
		FileUtils.copyFile(sourcefile, targefile);
			*/
		// Capture screenshot of webelement
		
		WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		File sourcefile=logo.getScreenshotAs(OutputType.FILE);
		File targefile=new File(System.getProperty("user.dir")+"\\screenshots\\logo.png");
		FileUtils.copyFile(sourcefile, targefile);
					
				
	}

}
