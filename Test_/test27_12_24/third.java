package test27_12_24;




@FunctionalInterface
interface BooleanOperation {
 boolean evaluate(int a, int b);
}


@FunctionalInterface
interface DoubleFunction 
{
 double calculate(double x, double y);
}
public class third {
	
	public static void main(String[] args) {
	    
	     BooleanOperation booleanOperation = new BooleanOperation()
	     {
	         @Override
	         public boolean evaluate(int a, int b) {
	             return (a % 3 == 0) && (b % 5 == 0) && ((a + b) % 2 == 0);
	         }
	     };

	   
	     int a = 9;
	     int b = 15;
	     boolean result = booleanOperation.evaluate(a, b);
	     System.out.println("Boolean operation result for a = " + a + " and b = " + b + ": " + result);

	   
	     DoubleFunction doubleFunction = new DoubleFunction() {
	         @Override
	         public double calculate(double x, double y) {
	             if (x > 0 && y < 0 && x % 2 == 0) {
	                 return (y != 0) ? (Math.pow(x, 3) / y) : 1;
	             } else if (x < 0 && y > 0 && y % 2 != 0) {
	                 return x * y * x * y;
	             } else {
	                 return x + y;
	             }
	         }
	     };

	   
	     double x = -6.0;
	     double y = 3.0;
	     double calculatedResult = doubleFunction.calculate(x, y);
	     System.out.println("Double function result for x = " + x + " and y = " + y + ": " + calculatedResult);
	 }
	}


