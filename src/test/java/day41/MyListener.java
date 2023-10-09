package day41;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class MyListener implements ITestListener
{
	public void onTestStart(ITestResult result)
	{
		System.out.println("Test started....");
	}
	
	 public void onTestSuccess(ITestResult result) 
	  {
		  System.out.println(" test passed....");
	  }
	  
	  public void onTestFailure(ITestResult result) 
	  {
		  System.out.println(" test failed....");
	  }

	  public void onTestSkipped(ITestResult result) 
	  {
		  System.out.println(" test skipped....");
	  }
}
