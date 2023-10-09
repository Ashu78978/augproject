package day18;
/*
 * exception is handled and rest of the statements are executed
 */
import java.util.Scanner;

public class HandleExceptions {

	public static void main(String[] args) {
		
		System.out.println("Program started.....");
		
		Scanner sc=new Scanner(System.in);
		 
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		
		try
		{		
		System.out.println(100/num);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Invalid data provided");
			System.out.println(e.getMessage());
		}
				
		
		System.out.println("Program Finished.....");
		

	}

}

