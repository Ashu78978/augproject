package day39.pack;
import org.testng.annotations.*;

public class Class2 {

	@Test
	void xyz()
	{
		System.out.println("this is xyz from Class 2");
	}
	
	@AfterTest
	void n()
	{
		System.out.println("this is after test annotation method");
	}
	

	@AfterSuite
	void as()
	{
		System.out.println("this is Aftersuite annotation method");
	}
}
