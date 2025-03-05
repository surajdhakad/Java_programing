package exception30_12_24;

import java.util.Scanner;

public class AreaCalculator {
	
	public static double calculateArea(double a,double b) {
		if(a<0||b<0) {
			throw new IllegalArgumentException();
		}
		double c;
		c=a*b;
		return c;
	}
	
	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			try {
				
				System.out.println("Enter length of rectangle:"+a);
				System.out.println("Enter width of rectangle:"+b);
				System.out.println(calculateArea(a,b));
				
				
				
			}
			catch(IllegalArgumentException e) {
				
				System.out.println("Dimensions must be positive:"+"length="+a+",width="+b);
				
			}
		}
		
		
	}
	

}
