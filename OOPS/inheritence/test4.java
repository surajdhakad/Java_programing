package inheritence;

class Student{
	int studentId;
	String name;
	long mobile;
	
	public Student(int studentId, String name, long mobile) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.mobile = mobile;
	}
	public void display() {
		System.out.println("student id ="+studentId);
		System.out.println("student  name="+name);
		System.out.println("student mobile ="+mobile);
	}
	
}
class JobGuaranteeStudent extends Student{
	boolean placementGuarantee;

	public JobGuaranteeStudent(int studentId, String name, long mobile, boolean placementGuarantee) {
		super(studentId, name, mobile);
		this.placementGuarantee = placementGuarantee;
	}
	
public void displayStudentInfo() {
	System.out.println(" placementGuarantee="+placementGuarantee);
	
}
	
	
}



public class test4 {

	public static void main(String[] args) {
		JobGuaranteeStudent t= new JobGuaranteeStudent(101, "suraj", 74403, false);
		t.display();
		t.displayStudentInfo();
		
		
		
	}

}
