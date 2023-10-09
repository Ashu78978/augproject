package day18;

import java.util.Scanner;
public class Pexceptionsdemo{

public static void main(String[]args){


System.out.println("program started");


Scanner sc =new Scanner(System.in);


try {
System.out.println("enter a number:");

int num=sc.nextInt();

System.out.println("Answer is:"+100/num);
}

catch(Exception e)
{
	
System.out.println("entered invalid number");
}
}








}