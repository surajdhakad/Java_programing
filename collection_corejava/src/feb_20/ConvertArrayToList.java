package feb_20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ArrayToList {

    public static List<String> convertToList(String[] inputArray) {
        if (inputArray == null) {
            return null; 
        }

        if (inputArray.length == 0) {
            return new ArrayList<>(); // Return an empty list for an empty array
        }

       
        return new ArrayList<>(Arrays.asList(inputArray));


       
    }
}

public class ConvertArrayToList {
    public static void main(String[] args) {
        String[] array1 = {"apple", "banana", "cherry"};
        List<String> list1 = ArrayToList.convertToList(array1);
        System.out.println("List 1: " + list1); 

        String[] array2 = null;
        List<String> list2 = ArrayToList.convertToList(array2);
        System.out.println("List 2 (null array): " + list2); 
        String[] array3 = {}; 
        List<String> list3 = ArrayToList.convertToList(array3);
        System.out.println("List 3 (empty array): " + list3); 

        String[] array4 = {"one"};
        List<String> list4 = ArrayToList.convertToList(array4);
        System.out.println("List 4: " + list4);  

        String[] array5 = {"a", "b", "c", "d", "e"};
        List<String> list5 = ArrayToList.convertToList(array5);
        System.out.println("List 5: " + list5); 
    }
}
