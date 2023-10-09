package day39.pack;
import org.testng.annotations.*;

public class Class1 {

	@Test
	void abc()
	{
		System.out.println("this is abc from Class 1");
	}
	
	@BeforeTest
	void m()
	{
		System.out.println("this is before test annotation method");
	}
	
	@BeforeSuite
	void bs()
	{
		System.out.println("this is BeforeSuite annotation method");
	}
	
}
