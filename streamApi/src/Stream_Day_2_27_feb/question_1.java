package Stream_Day_2_27_feb;

import java.util.ArrayList;
import java.util.List;

public class question_1 {

	public static void main(String[] args) {
		
		
		List<String> l=new ArrayList<String>();
		
		
		
		l.add("Suraj");
		l.add("uivek");
		l.add("abhishek");
		l.add("ani");
		
		l.stream().filter(s-> s.length()>5 && s. charAt(0)=='a'||s.charAt(0)=='e'||s.charAt(0)=='i'||s.charAt(0)=='o'||s.charAt(0)=='u').forEach(System.out::println);
		
		
		
		
	}

}
