package day39;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionsDemo {

	@Test
	void test()
	{
		String s="welcome";
		
		/*if(s.equals("welcome123"))
		{
			System.out.println("test passed");
			Assert.assertTrue(true);
		}
		else
		{
			System.out.println("failed");
			Assert.assertTrue(false);
		}*/
		
		//Assert.assertEquals(s,"welcome123");
		//Assert.assertNotEquals(s,"welcome123");
		//Assert.assertTrue(true); // passed
		//Assert.assertTrue(false); // failed
		//Assert.assertFalse(false); // pass
		Assert.assertFalse(true); //fail
		
		Assert.fail(); // Assert.assertTrue(false)
				
		
	}
}
