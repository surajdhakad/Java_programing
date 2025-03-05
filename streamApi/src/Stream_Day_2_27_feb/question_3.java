package Stream_Day_2_27_feb;

import java.util.HashMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class question_3 {

	public static void main(String[] args) {
		
//
//ArrayList<String> l1= new ArrayList<String>();
//		
//		
//l1.add("mango");
//l1.add("banana");
//l1.add("apple");
//
//
//Map<Integer, List<String>> lengthMap = l1.stream()
//.collect(Collectors.groupingBy(String::length));
//
//System.out.println(lengthMap);
//
//Map<Integer, Long> countMap = l1.stream()
//.collect(Collectors.groupingBy(String::length, Collectors.counting()));
//System.out.println(countMap);
//
//	
//		
//		
		  
		 
//		Map<Integer, Long> counts = l.stream()
//                .collect(Collectors.groupingBy(
//                        n -> n, 
//                        Collectors.counting() 
//                ));
//		    
//		
//		System.out.println(counts);
//		
//		
		
//		
//HashMap<Integer,String > m1=new HashMap<Integer,String>();	
//
//m1.put(1, "apple");
//m1.put(2, "mango");
//m1.put(3, "orange");
//m1.put(4, "pinaaaple");
//m1.put(5, "kivi");
//m1.put(5, "kivi");
//m1.put(null, "kivi");




TreeMap<Integer,String> m1=new TreeMap<Integer,String>((s,d)->d.compareTo(s));
m1.put(1, "apple");
m1.put(2, "mango");
m1.put(3, "orange");
m1.put(4, "pinaaaple");
m1.put(5, "kivi");
m1.put(5, "kivi");


SortedMap<Integer, String> k=m1.tailMap(3);
System.out.println(k);

//m1.forEach((k,v)-> System.out.println(k+"="+v));


//
//HashMap<Integer,String > m2=new HashMap<Integer,String>();	
//
//m2.put(11, "a");
//m2.put(22, "m");
//m2.put(33, "o");
//m2.put(44, "p");
//
//
//m1.putAll(m2);
//
//
//
//
////m1.forEach((k,v)-> System.out.println(k+"="+v));
//
//
//HashMap<Integer,String> m4=new HashMap<Integer,String>();
//
////boolean s=m1.containsKey(4);
////boolean m=m1.containsValue("orange");
////System.out.println(s);
////System.out.println(m);
//
//
////m1.forEach((k,v)-> System.out.println(k+"="+v));
//
//
//
////System.out.println("Iterating through HashMap:");
////for (HashMap.Entry<Integer, String> entry : m1.entrySet()) 
////{
////    System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
////}	
//	
//
////
////System.out.println("Itrating values by etrator");
////Iterator<Entry<Integer, String>> itr = m1.entrySet().iterator();
////itr.forEachRemaining(System.out::println);
////		
////
////int size=m1.size();
////
////System.out.println(size);
////
////
////
////
////m1.putIfAbsent(8, "s");
////boolean l=m1.isEmpty();
////
////System.out.println(l);
////
////m1.remove(4);
////System.out.println();
////System.out.println("Itrating values by etrator");
////Iterator<Entry<Integer, String>> itr1 = m1.entrySet().iterator();
////itr1.forEachRemaining(System.out::println);
////		
////		
//
//
//
	}

}
