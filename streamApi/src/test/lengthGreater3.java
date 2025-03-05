package test;

import java.util.Arrays;

public class lengthGreater3 {

	public static void main(String[] args) {
		
		 String[] words = {"Raj", "Rohit", "Smirti", "Richa", "Sky"};
		 
		 
		 Arrays.stream(words).filter(n-> n.length()>3).forEach(System.out::println);
		
	}

}
