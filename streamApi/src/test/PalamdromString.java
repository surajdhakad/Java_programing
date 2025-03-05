package test;

import java.util.Arrays;

public class PalamdromString {

	public static void main(String[] args) {
		
		
		String[] words = {"madam", "hello", "racecar", "java", "level", "world"};

		Arrays.stream(words).filter(n->{
			boolean f=false;
			StringBuilder str= new StringBuilder(n);
			//System.out.println(str);
			StringBuilder st=str.reverse();
			
			//System.out.println(st);
			if(n.equals(st.toString())) {
				
				f=true;
			}
			
			return f;
			
		}).forEach(System.out::println);
		
	}

}
