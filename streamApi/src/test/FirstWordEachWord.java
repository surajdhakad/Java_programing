package test;

import java.util.Arrays;

public class FirstWordEachWord {

	public static void main(String[] args) {
	
		 String []names = {"James", "Aryan", "Vibha", "Aniket"};
		 
		 
		 Arrays.stream(names).map(n-> n.charAt(0)).forEach(System.out::println);
		
		
	}

}
