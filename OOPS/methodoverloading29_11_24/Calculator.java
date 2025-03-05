package methodoverloading29_11_24;

public class Calculator {
	
public int add(int num1,int num2) {
	 int sum =(num1+num2);
	 return sum;
	
}
public double add(double num1,double num2)
{
	
	double sum=(num1+num2);
	return sum;
}
public int multiply(int num1,int num2) {
	int mul=(num1*num2);
	return mul;
	
}
public double multiply(double num1,double num2) {
	double mul=(num1*num2);
	return mul;
	
}

}
