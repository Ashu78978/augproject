package day42;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestHomePageLinks {

	WebDriver driver;
	
	@BeforeClass
	void setup()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test
	void testLinks()
	{
		LoginPage2 lp=new LoginPage2(driver);
		Assert.assertEquals(lp.getNumberLinks(),5);
		
	
	}
	
	
	@AfterClass
	void tearDown()
	{
		driver.quit();
	}
}
