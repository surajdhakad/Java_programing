package test;

import java.util.Arrays;

public class ConvertUpercase {

	public static void main(String[] args) {
		 String[] names = {"Virat", "Sanju", "Rohit", "Bumrah"};
		 
		 
		 Arrays.stream(names).map(n-> n.toUpperCase()).forEach(System.out::println);
	}

}
