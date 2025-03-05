package Exception26_12_24;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Simpleexceptiondemo1 {

	public static void main(String[] args) {
		
	try
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number");
		int  a =sc.nextInt();
		 System.out.println("enter the second number");
		int  b=sc.nextInt();
		 
		 System.out.println("a="+a+"b="+b);
	}
	catch(InputMismatchException e)
	{
		System.out.println("An InputMismatchException occurred");
		System.out.println(e.getMessage());
		System.out.println("String representation");
		System.out.println(e.toString());
		System.out.println("Stack trace:");
		e.printStackTrace();
		
		
		
		
	}
	System.out.println("main method end");
	

	}

}
