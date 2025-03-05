package inheritence_14_11_24;

public class Student_test {

	public static void main(String[] args) {
		
		Student s=new Student(01,"smith",25000);
		System.out.println(s.toString());
		s.Payfee(25000);
		Daysholar d = new Daysholar(02,"suraj",5000,25000);
		System.out.println(d.toString());
		d.payfee(80000);
		hostelar h=new hostelar(03,"vivek",6000,30000);
		System.out.println(h.toString());
		h.payfee(300000);
		
		
		

	}

}
