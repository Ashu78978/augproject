package day39;
import org.testng.Assert;
import org.testng.annotations.*;

public class DependentMethods {

	@Test(priority=1)
	void openApp()
	{
		Assert.assertTrue(true);
	}
	
	@Test(priority=2, dependsOnMethods= {"openApp"})
	void login()
	{
		Assert.assertTrue(false);
	}
	
	@Test(priority=3, dependsOnMethods= {"login"})
	void search()
	{
		Assert.assertTrue(true);
	}
	
	@Test(priority=4,dependsOnMethods= {"login","search"})
	void advacedsearch()
	{
		Assert.assertTrue(true);
	}

	@Test(priority=5, dependsOnMethods= {"login"})
	void logout()
	{
		Assert.assertTrue(true);
	}
}
