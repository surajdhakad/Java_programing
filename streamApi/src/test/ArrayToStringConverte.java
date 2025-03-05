package test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayToStringConverte {

	public static void main(String[] args) {
		Integer[] numbers = {10, 20, 30, 40, 50};
		
		
	List<String> s=	Arrays.stream(numbers).map(n->"number:"+n).toList();
		
		System.out.println(s);

	}

}
