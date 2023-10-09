package day21;
/*
 * 
It appears that you have provided a snippet of Java code for automating a web login using Selenium WebDriver. This code navigates to the OrangeHRM website, enters a username and password, clicks the login button, verifies the dashboard page's title, and then closes the browser. Here's a breakdown of what this code does:

It initializes a new Chrome WebDriver.
It navigates to the OrangeHRM login page (https://opensource-demo.orangehrmlive.com/).
It uses Thread.sleep(3000) to introduce a 3-second pause (not recommended in practice but used here for demonstration purposes).
It finds the username input element by its name attribute and enters "Admin" into it.
It finds the password input element by its name attribute and enters "admin123" into it.
It clicks the login button using an XPath expression that matches the button text "Login."
Another 3-second pause is introduced.
It verifies if the text of a specific element on the dashboard page matches the expected value "Dashboard." If it matches, it prints "Login test passed"; otherwise, it prints "Login Test failed."
Finally, it quits the WebDriver, closing the browser.
A few suggestions:

Instead of using Thread.sleep(), consider using explicit or implicit waits to improve test stability and efficiency.
You can use try-catch blocks for exception handling, especially when working with WebDriver operations.
Ensure that you have the Chrome WebDriver installed and configured correctly for your system.
Overall, this code is a basic example of web automation using Selenium WebDriver for a login scenario. Depending on your testing requirements, you may want to extend it to cover additional test cases and scenarios.
 * Day-21
------------

Test case
----------
1) Launch browser( chrome)
2) open URL
	https://opensource-demo.orangehrmlive.com/
3) Provide username - Admin
4) Provide password - admin123
5) Click on login button
6) Verify dashboard page display
7) close browser

SearchContext (I) -->WebDriver(I) 
	ChromeDriver,  EdgeDriver, FirefoxDriver etc.......


<input class="oxd-input oxd-input--active" name="username" placeholder="Username" autofocus="" data-v-844e87dc="">

tagname
attributes/properties
value


//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button

//*[@id='app']/div[1]/div[1]/header/div[1]/div[1]/span/h6


Assignement
----------------
1) Launch browser
2) open url
	URL: https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F
3) Provide username  - admin@yourstore.com
4) Provide password  - admin
5) Click on Login button 
6) Verify the title of dashboard page   
	Exp title : Dashboard / nopCommerce administration
7) Verify Dasboad


driver.getTitle();     --> returns the title of the webpage
		




 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Orangetest {

	public static void main(String[] args) throws InterruptedException {

//ChromeDriver driver=new ChromeDriver();

//EdgeDriver driver=new EdgeDriver();

//FirefoxDriver driver=new FirefoxDriver();
		
	WebDriver driver=new ChromeDriver();
	
	
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
	driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

	
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
