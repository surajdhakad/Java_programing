package abstract_19_12_24;
import java.util.function.*;
import java.util.*;

public class RandomValuegernator {

  
    private static final RandomValuegernator Random = new RandomValuegernator();

    public static void main(String[] args) {
    
    	Supplier<String> str = ()->{
            Random randomint = new Random();
            int r = randomint.nextInt(10000);
            return "NIT"+r;
        };
        int min = 32;
        int max = 100;
        Supplier<Integer> in = ()->{
            Random randomint = new Random();
            Integer r= randomint.nextInt((max-min)+1);
            return r+min;

        };
        System.out.println(str.get());
        System.out.println(in.get());
    }
}