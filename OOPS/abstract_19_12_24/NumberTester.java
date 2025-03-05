package abstract_19_12_24;

import java.util.function.Predicate;

public class NumberTester {

    public static void main(String[] args) {
      
    	 Predicate<Integer> isEven =  num-> num%2==0;  
         Predicate<Integer> isPrime =  num->
         {
             int c=1;
             for(int i=2;i<=num/2;i++){
                 c++;
             }
             return (c==1);
         }  ;
         System.out.println("Number is even :"+isEven.test(3));
         System.out.println("Number is prime :"+isPrime.test(12)); 
    }
}