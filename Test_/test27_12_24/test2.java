package test27_12_24;
@FunctionalInterface
interface Operation {
 int perform(int a, int b);
}


@FunctionalInterface
interface Greeting {
 void greet(String name, int age);
}


public class test2 {
	
	public static void main(String[] args) {
	    
	     Operation operation = new Operation() {
	         @Override
	         public int perform(int a, int b) {
	             if (a > 0 && b > 0) {
	                 return (a * a) + (b * b); 
	             } else {
	                 return a + b; 
	             }
	         }
	     };

	  
	     int a = 4;
	     int b = 3;
	     int result = operation.perform(a, b);
	     System.out.println("Result of the operation: " + result);

	   
	     Greeting greeting = new Greeting() {
	         @Override
	         public void greet(String name, int age) {
	             if (age >= 18) {
	                 System.out.println("Hello " + name + ", you are an adult.");
	             } else if (name.length() > 5) {
	                 System.out.println("Hello " + name + ", you have .");
	             } else {
	                 System.out.println("Hello " + name + ", nice to meet you!");
	             }
	         }
	     };


	     String name = "Virat";
	     int age = 38;
	     greeting.greet(name, age);
	 }
	}
	
	


