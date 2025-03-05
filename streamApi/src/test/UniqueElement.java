package test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class UniqueElement {

	public static void main(String[] args) {
		
		
		
		 Integer[] numbers = {1, 2, 3, 4, 5, 2, 3, 6, 7, 8, 4};
		 
		 
//		 Arrays.stream(numbers).filter(n->
//		 {
//			 boolean f=true;
//			 for(int i=0;i<=n;i++) 
//			 {
//				 for(int j=i+1;j<n;j++) 
//				 {
//					 if(i==j) 
//					 {
//						 return false;
//					 }
//				 }
//				 
//			 }
//			return f;
//			
//		 }).forEach(System.out::println);
//
//	
		 
//		 Set<Integer> seen = new HashSet<>();
//		 
//		 Arrays.stream(numbers).filter(n-> seen.add(n)).forEach(System.out::println);
		 
		 Arrays.stream(numbers).collect(Collectors.toSet()).forEach(System.out::println);

}
}
