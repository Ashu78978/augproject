package day39;
import org.testng.annotations.*;

/*1) Login - @BeforeMethod
2) search - @Test
3) Logout - @AfterMethod
4) Login
5) Advsearch - @Test
6) Logout 
*/


public class AnnotationsDemo1 {

	@BeforeMethod
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
	
	@AfterMethod
	void logout()
	{
		System.out.println("Logout");
	}
}
