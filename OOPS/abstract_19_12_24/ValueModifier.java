package abstract_19_12_24;
import java.util.function.*;
public class ValueModifier {

	public static void main(String[] args) {
		Consumer<String> stringConsumer= str-> System.out.println(str.toUpperCase());
        Consumer<Integer> integerConsumer= num-> System.out.println(num*num);
        stringConsumer.accept("aBbuU");
        integerConsumer.accept(7); 
	    }
	}