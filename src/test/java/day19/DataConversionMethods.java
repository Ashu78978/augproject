package day19;

public class DataConversionMethods {

	public static void main(String[] args) {
		
		//int a=100;
		//Integer b=100;
		
		//1) String --->int
		
		//String  ---> int, double, boolean
		//String s="welcome"; // not possible
		
		String s1="10";
		String s2="20";
		
		int total=Integer.parseInt(s1)+Integer.parseInt(s2);
		System.out.println(total);
		
		
		//String ---> double
		String s11="10.50";
		String s22="20.15";
		 
		double totald=Double.parseDouble(s1)+ Double.parseDouble(s2);
		System.out.println(totald);
		
		
		//String --> boolean
		//String s="xyz"; // not possible to convert
		/*String s="true";
		boolean b=Boolean.parseBoolean(s);
		System.out.println(b);
		*/
		
		
		//String --> char
		//String s="welcome"; // not possible
		//String s="A";  // not possible
		
		
		//int, double, char, boolean -----> String
//		int a=10;
//		double d=10.15;
//		char c='A';
//		boolean bool=true;
//		
//		
//		String var=String.valueOf(a);
//		System.out.println(var);
//		
//		System.out.println(String.valueOf(d));
//		System.out.println(String.valueOf(c));
//		System.out.println(String.valueOf(bool));
		
		

	}

}
