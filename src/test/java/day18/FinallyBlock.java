package day18;

//case1: Exception occured, catch block handled ---> finally block will execute
//case2: Exception occured, catch block NOT handled --> finally block will execute
//case3: Exception does not occured, catch block ignored ----> finally block will execute

//final block is optional

public class FinallyBlock {

	public static void main(String[] args) {
		
		System.out.println("PROGRAM STARTED...");
		System.out.println("PROGRAM IN PROGRESS...");
		
		String s="hey";
		
		try
		{
			System.out.println(s.length());
			
		}
		catch(Exception e)
		{
			System.out.println("Exception occured... handled.");
		}
		finally
		{
			System.out.println("Entred into finally block....");
		}
		
		System.out.println("Program exit....");
	}

}
