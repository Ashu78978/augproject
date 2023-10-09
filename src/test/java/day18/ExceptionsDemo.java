package day18;
/*
 * 
 * 
 * 
 * 
It seems like you've provided part of a Java program that demonstrates handling exceptions. However, the code you've shared is commented out, and it appears to be part of a larger program.

The commented code you've included shows an example of how an ArithmeticException can occur when dividing by zero. Here's the code with comments removed:

java
Copy code
public class ExceptionsDemo {

    public static void main(String[] args) {
        
        System.out.println("Program started.....");
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        System.out.println(100 / num);
    }
}
This code prompts the user to enter a number and then attempts to divide 100 by that number. If the user enters 0, it will result in an ArithmeticException since dividing by zero is not allowed in Java.

If you'd like to handle this exception, you can use a try-catch block to catch the exception and provide appropriate error handling. For example:

java
Copy code
public class ExceptionsDemo {

    public static void main(String[] args) {
        
        System.out.println("Program started.....");
        
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.println("Enter a number:");
            int num = sc.nextInt();
            System.out.println(100 / num);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }
}
This modified code will catch the ArithmeticException and print an error message instead of crashing the program when dividing by zero.


================================


The code you've provided demonstrates how an ArrayIndexOutOfBoundsException can occur
 when trying to access an array element at an invalid index. Here's the code:

java
Copy code
// Example 2: ArrayIndexOutOfBoundsExceptions
// These exceptions occur when we provide an array limit of 7 but try to access an index beyond that limit.

int a[] = new int[7];
System.out.println("Enter a number:");
int num = sc.nextInt();

System.out.println("Enter position (0-6):");
int pos = sc.nextInt();

// Whichever number is provided will be added to the specified position in the array.
a[pos] = num;

System.out.println(a[pos]);
In this code, you're creating an array a with a size of 7 (indices 0-6), and
 then you're trying to set the value at a specific position (pos) based on user input.
  However, if the user enters a value for pos that is outside the valid range (0-6), 
  it will result in an ArrayIndexOutOfBoundsException.

To handle this exception, you can use a try-catch block similar to the previous example. Here's a modified version of the code with error handling:

java
Copy code
// Example 2: ArrayIndexOutOfBoundsExceptions
// Handling the exception when accessing an array element at an invalid index.

int a[] = new int[7];
System.out.println("Enter a number:");
int num = sc.nextInt();

System.out.println("Enter position (0-6):");
int pos = sc.nextInt();

try {
    // Check if the provided position is within the valid range before accessing the array.
    if (pos >= 0 && pos <= 6) {
        a[pos] = num;
        System.out.println(a[pos]);
    } else {
        System.out.println("Error: Invalid position. Please enter a position between 0 and 6.");
    }
} catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("Error: ArrayIndexOutOfBoundsException. Please enter a valid position.");
}
This code checks if the user-provided position is within the valid range before accessing the array, and it handles the ArrayIndexOutOfBoundsException by printing an error message if the position is invalid.





=============================================


 * Day-18
----------
Exception handling
--------
exception occurs when user provided invalid info to program and program gets terminated,to handle exception
and executing rest of the statements is called exception
Errors
-----
1) Syntax error
2) Logical error

1) Checked Exceptions
	The exceptions which are identified by java compiler.
	Ex: Interupted exception
     		FileNotFound
		IOException etc...
		=====
		
		FII
		=========


2) Un-checked exceptions // at runtime we are getting these exceptions
	The exceptions which are not identified by java compiler.
Ex:
		ArithmeticException
		NullPointerException
		ArrayIndexOutOfBoundsException etc...
			etc...
// number format exception

int num=1234;    //  number
String s="1234"  //String


String s="1234"; //convert string to number because in string contains numbers
int num=Integer.parseInt(s)   //valid

String s="welcome"; 
int num=Integer.parseInt(s)  // invalid

whatever statements throwing exceptions we kreep it in try catch block
try..catch 


Exception ----> all types of exceptions classes....

try
{
---
--
}
catch(Exception e)
{

}
catch(Exception e)
{

}
finally
{

}


case1: Exception occured, catch block handled ---> finally block will execute
case2: Exception occured, catch block NOT handled --> finally block will execute
case3: Exception does not occured, catch block ignored ----> finally block will execute


checked exceptions
---
1) Un-checked exceptions can handle using try..catch block
2) Checked exceptions can handle using try..cath & throws keyword

1) The exceptions which are not identified by java compiler.(Un-checked exceptions)
2) The exceptions which are identified by java compiler.( Checked exceptions)

1) try..catch block is statement level
2) throws keyword is for method level

Scanner sc=new Scanner(System.in)

sc.nextInt()
sc.nextDouble()
sc.next()
--
--
--
int num=sc.nextInt()






 */
import java.util.Scanner;

public class ExceptionsDemo {

	public static void main(String[] args) {
		
		System.out.println("Program started.....");
		
		Scanner sc=new Scanner(System.in);
		//we get arithmetic exceptions when we provide invalid input number
		//Example 1:  ArithmeticException
		/*System.out.println("Enter a number:");
		int num=sc.nextInt();
		System.out.println(100/num);
		//
		 /*
		======================================================
//		//Example2: ArrayIndexOutOfBoundsExceptions
//		//these exception occurs here we provided array limit to 5 but when we provide input 6 
//		//out of range then these exception occurs
//		int a[]=new int[7];
//		System.out.println("Enter a number:");
//		int num=sc.nextInt();
//		
//		System.out.println("Enter position(0-4):");
//		int pos=sc.nextInt();
//		//whichever number is provided i will add that number to position
//		a[pos]=num;
//		
//		System.out.println(a[pos]);
 
		
		=============================================================================
		//Example3  : NumberFormatException
		//here we are converting string to number 
		//but if we provide string which is invalid
		*/
		
//		System.out.println("Enter a string:");
//           String s=sc.next();
//		
//		int num=Integer.parseInt(s);
//		System.out.println(num);
//		
//				
//		System.out.println("Program Finished....");
//		
//		
//		
		
//		try {
//		System.out.println("enter any number:");
//		
//		int a[]=new int[8];
//		
//		int num=sc.nextInt();
//		
//		System.out.println("enter number from 0-7:");
//		
//		int pos =sc.nextInt();
//		
//		a[pos]=num;
//		System.out.println(a[pos]);
//		}
//		catch(Exception e)
//		{
//			
//			System.out.println("invalid details entered");
//		}
//		
		
		
//		
//System.out.println("enter a string");
//
//String s=sc.next();
//
//int num=Integer.parseInt(s);
//
//System.out.println("finished");
//		
		
//		
//		System.out.println("enter a number");
//		int num=sc.nextInt();
//		
//		System.out.println(100/num);
//		
//		
		
//		int b[]=new int[6];
//		
//		System.out.println("enter a number:");
//		int num=sc.nextInt();
//		
//		System.out.println("enter position  from (0-5):");
//		
//		int pos=sc.nextInt();
//		
//		b[pos]=num;
//		System.out.println(b[pos]);
//		
		
		
		
		System.out.println("enter a string");
		
		String s=sc.next();
		
		int num=Integer.parseInt(s);
		
		System.out.println("finished");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
	}

}
