package test;
import java.util.Arrays;
import java.util.stream.*;

public class ContainAStringArray {

	public static void main(String[] args) {
		
		
		String [] names= {"Rahul", "Raj", "Arnav", "Scott", "Smith"};
		
		
		Arrays.stream(names).filter(n-> n.contains("A")||n.contains("a")).forEach(System.out::println);
	}

}
