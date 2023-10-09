package day18;

import java.util.Scanner;

public class MultipleCatchBlocks {

	public static void main(String[] args) {
		
		System.out.println("Program started.....");
		
		String s=null;   //NullPointerException
			
		//multiple catch blocks
		/*try
		{
		System.out.println(s.length());
		}
		catch(ArithmeticException e)
		{
			System.out.println("Invalid data provided");
		}
		catch(NullPointerException e)
		{
			System.out.println("Invalid data provided");
		}
		catch(NumberFormatException e)
		{
			System.out.println("Invalid data provided");
		}*/
		
		//single catch block
		try
		{
		//System.out.println(s.length()); //NullPointerExcetion
		int x=100/0;
		}
		catch(Exception e)
		{
			//e.printStackTrace();
			System.out.println("Invalid data provided");
		}
		
			
		
		System.out.println("Program Finished.....");
		
	}

}

