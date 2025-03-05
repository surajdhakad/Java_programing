package inheritence;
//import java.util.*;



class Vehicle{
	String brand;
	int year;
	
	public void start() {
		
		System.out.println("The vehicle is starting.");
	}
}
	class car extends Vehicle {
		String model;
		
		

	
		
	
		public void Cardetail() {
			System.out.println(model);
		System.out.println("car brand is "+super.brand);
		
		System.out.println("car year is "+super.year);
			
		}
	}
	
	

public class test2 {

	public static void main(String[] args) {
		car c=new car();
		
		
		c.brand="verna";
		c.year=2024;
		c.model="34ds";
		c.Cardetail();
		c.start();
		
		
	

	}

}
