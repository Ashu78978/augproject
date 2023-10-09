package day40;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests {

	@Test(priority=1, groups= {"sanity","regression","functional"})
	void loginByEmail()
	{
		System.out.println(" this is login by email");
	}
	
	@Test(priority=2,groups= {"sanity"})
	void loginByfacebook()
	{
		System.out.println(" this is login by facebook");
		Assert.fail();
			
	}
	
	@Test(priority=3,groups= {"sanity"})
	void loginBytwitter()
	{
		System.out.println(" this is login by twitter");
	}
	
}
