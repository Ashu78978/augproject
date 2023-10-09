package day41;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class OrangehrmTests {
	WebDriver driver;
	
	@BeforeClass
	void setup()
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}
	
	@Test(priority=1)
	void testLogo() throws InterruptedException
	{
		Thread.sleep(3000);
		try
		{
		boolean status=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		Assert.assertEquals(status,true);
		}
		catch(Exception e)
		{
			Assert.fail();
		}
	}
	

	@Test(priority=2)
	void testAppURL(String appurl)
	{
		Assert.assertEquals(driver.getCurrentUrl(),"https://opensource-demo.com");
		
	}
	
	
	@Test(priority=3,dependsOnMethods= {"testAppURL"})
	void testHomePageTitle()
	{
		Assert.assertEquals(driver.getTitle(),"OrangeHRM123");
		
	}
	
	
	
	@AfterClass
	void tearDown()
	{
		driver.quit();
	}
}

