package day40;

import org.testng.annotations.Test;

public class PaymentTests {

	@Test(priority=1,groups= {"sanity","regression","functional"})
	void paymentindollar()
	{
		System.out.println("this is payement by dollar method");
	}
	
	@Test(priority=2,groups= {"sanity"})
	void paymentinrupees()
	{
		System.out.println("this is payement by rupees method");
	}
	
	@Test(priority=3,groups= {"regression"})
	void paymentReturnbyBank()
	{
		System.out.println("payment return by bank");
	}
}
