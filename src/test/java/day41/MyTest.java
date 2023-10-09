package day41;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(day41.MyListener.class)
public class MyTest {

	@Test(priority=1)
	void test1()
	{
		Assert.assertEquals(1, 1);
	}
	
	@Test(priority=2)
	void test2()
	{
		Assert.assertEquals(1, 2);
	}
	
	@Test(priority=3, dependsOnMethods= {"test2"})
	void test3()
	{
		Assert.assertEquals(1, 1);
	}
	
}
