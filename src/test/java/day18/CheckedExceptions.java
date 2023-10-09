package day18;

public class CheckedExceptions {

	public static void main(String[] args) throws InterruptedException  {
		
		
		System.out.println("program started...");
		System.out.println("program inprogress...");
		
		
		/*	try 
			{
				Thread.sleep(5000);
			} 
			catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		*/
		
		Thread.sleep(5000);
		
		
		System.out.println("program finished...");
		System.out.println("program exited...");

	}

}

