package Stream_Day_2_27_feb;

import java.util.stream.Stream;

public class question_2_genrate_infinite_Stream {

	public static void main(String[] args) {
//		
//		Stream.iterate(1, n -> n + 1)
//        .filter(n -> n % 2 != 0) 
//        .map(n -> n * n) 
//        .limit(10) 
//        .forEach(System.out::println);
		
		int s[]= {1};
		Stream.generate(()->s[0]++)
		.map(n->n*n)
		.filter(n-> n%2!=0)
		.limit(20)
		.forEach(System.out::println);
		
		
		

	}

}
