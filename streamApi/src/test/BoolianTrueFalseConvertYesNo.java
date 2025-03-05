package test;

import java.util.Arrays;
import java.util.List;

public class BoolianTrueFalseConvertYesNo {

	public static void main(String[] args) {
		
		
		 Boolean[] flags = {true, false, true, false, true};
		 
		 
		 
		List <String> s= Arrays.stream(flags).map(n->{
			 
			 if(n==true) {
				return "yes";
			 }
			 else {
				 return "no";
			 }
			 
		 }).toList();
		
		System.out.println(s);
		 
		 
		 

	}

}
