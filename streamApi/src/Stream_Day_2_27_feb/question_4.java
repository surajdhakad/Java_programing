package Stream_Day_2_27_feb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class question_4 {

	public static void main(String[] args) {
     List<String> list=new ArrayList<String>();
		
		list.add("The quick brown fox jumps over the lazy dog.");
		list.add("Ramesh jhhg");
		list.add("Abc fggh");
		list.add("Aba hgffgh");
		list.add("maxbel hfgh");
		
		
		
		list.stream()
		.flatMap(s-> Arrays.stream(s.split("\\\s+")))
		.map(String::toLowerCase)
		.forEach(System.out::println);
		

	}

}
