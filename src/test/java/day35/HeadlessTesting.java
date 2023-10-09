package day35;

/*we cannot see the functionality
 * backend execution
 * 
 * 
Your Java program demonstrates headless testing using Selenium WebDriver with ChromeOptions
 set to run the Chrome browser in headless mode. Headless testing
  allows you to perform automated browser testing without a visible 
  graphical user interface (GUI). Here's what the code does:

Imports necessary Selenium WebDriver classes and other utilities.

Creates a ChromeOptions object named options.

Sets the setHeadless(true) option in options, which configures Chrome to run in headless mode.

Initializes a ChromeDriver instance with the configured options.

Navigates to the "https://opensource-demo.orangehrmlive.com/" website.

Maximizes the browser window using driver.manage().window().maximize() (even though the browser is headless, you can still manipulate window settings).

Adds a delay using Thread.sleep(5000) to simulate waiting for the page to load.

Finds the username and password input fields by name and enters the credentials.

Locates and clicks the login button using an XPath expression.

Adds another delay to ensure that the login process completes.

Retrieves the actual title of the page using driver.getTitle().

Compares the actual title with the expected title ("OrangeHRM") and prints whether the test passed or failed.

Quits the WebDriver session using driver.quit().

This code is a basic example of performing headless testing with Selenium WebDriver and Chrome. Headless testing is particularly useful for running automated tests in a headless environment or as part of a continuous integration (CI) pipeline where a graphical user interface is not available.
 */
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class HeadlessTesting {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions options=new ChromeOptions();
		options.setHeadless(true);
		
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize(); // maximize the page
		Thread.sleep(5000);
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		Thread.sleep(3000);

		String act_title=driver.getTitle();
		String exp_title="OrangeHRM";
		
		if(act_title.equals(exp_title))
		{
			System.out.println("Test passed");
		}
		else
		{
			System.out.println("failed");
		}
		
		driver.quit();

	}

}
