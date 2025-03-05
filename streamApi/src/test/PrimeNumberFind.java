package test;

import java.util.Arrays;

public class PrimeNumberFind {

	public static void main(String[] args) {
		
		
		Integer[] numbers = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
		
		

	System.out.println(Arrays.toString(Arrays.stream(numbers).filter(n-> isPrime(n)).toArray()));
	}
	
	public static boolean isPrime(int n) {
		
		if(n<2) {
			return false;
		}
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				return false;
			}
			
		}
		return true;
		
		
	}

}
