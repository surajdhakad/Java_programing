package feb_19;

import java.util.WeakHashMap;

import java.util.HashMap;




record Student(int id,String name) {
	
}
public class WeekHashMAp {
	public static void main(String[] args) throws InterruptedException {
		
		
		
		
		WeakHashMap<Student,String> w=new WeakHashMap<>();
		Student s=new Student(111,"ads");
		w.put(s, "pass");
		System.out.println(w);
		s=null;
		System.gc();
		
		
		Thread.sleep(3000);
	
		
		
		System.out.println(w);

           System.out.println("====================================");
           
           
           
           
   		
   		HashMap<Student ,String>wa=new HashMap<Student,String>();
   		Student s1=new Student(222,"ssd");
   		wa.put(s1, "fail");
   		System.out.println(wa);
   		s1=null;
   		System.gc();
   		
   		
   		Thread.sleep(3000);
   	
   		
   		
   		System.out.println(wa);

	}
	

}
