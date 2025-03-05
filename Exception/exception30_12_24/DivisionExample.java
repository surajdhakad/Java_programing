package exception30_12_24;

public class DivisionExample {

	
	public static int performDivision(int a ,int b) {
		
		
		if(b==0) {
			throw new ArithmeticException();
			
		}
		int c=a/b;
		return c;
	}
	
	
	public static void main(String[] args) {
		
		int a=10;
		int b=2;
		
		try {
			
			System.out.println("Result of division:"+performDivision(a,b));
		}
		catch(ArithmeticException e) {
			System.out.println("ArithmeticException caught "+"Division by zero: "+"dividend="+a+", divisor="+b);
		}
	}
}
