package day39;
import org.testng.annotations.*;

/*1) Login - @BeforeClass
2) search - @Test
3) Advsearch - @Test
4) Logout - @AfterClass
*/


public class AnnotationsDemo2 {

	@BeforeClass
	void login()
	{
		System.out.println("Login...");
	}
	
	@Test(priority=1)
	void search()
	{
		System.out.println("search");
	}
	
	@Test(priority=2)
	void advancedSearch()
	{
		System.out.println("Advaced searfch");
	}
	
	@AfterClass
	void logout()
	{
		System.out.println("Logout");
	}
}
