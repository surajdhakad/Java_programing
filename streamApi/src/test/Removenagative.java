package test;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.*;
public class Removenagative {

	public static void main(String[] args) {
		
		Integer [] number= {-10,-5,0,5,10,15,-20};
		
		
		List<Integer> l=Arrays.stream(number).filter(n-> n>=0).toList();
		System.out.println(l);
		
	}

}
