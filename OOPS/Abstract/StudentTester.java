package Abstract;

import inheritence_14_11_24.Student_test;

abstract class Student{
	
	
	protected String studentName ;
	protected String studentClass;
	protected static int totalNoOfStudents;
	

	public Student(String studentName, String studentClass) {
		super();
		this.studentName = studentName;
		this.studentClass = studentClass;
		totalNoOfStudents++;
	}


	abstract public int getPercentage();
	
	public static int getTotalNoStudents() {
		return totalNoOfStudents;
	}
	

	

}

 class ScienceStudent extends Student{
	
	
	private int physicsMarks;
	private int chemistryMarks;
	private int mathsMarks;
	
	public ScienceStudent(String studentName, String studentClass, int physicsMarks, int chemistryMarks,
			int mathsMarks) {
		super(studentName, studentClass);
		this.physicsMarks = physicsMarks;
		this.chemistryMarks = chemistryMarks;
		this.mathsMarks = mathsMarks;
	}

	@Override
	public int getPercentage() {
		
		return (physicsMarks+chemistryMarks+mathsMarks)/3;
		
	}

	@Override
	public String toString() {
		return "ScienceStudent [studentName=" + studentName + ", studentClass=" + studentClass + ", physicsMarks="
				+ physicsMarks + ", chemistryMarks=" + chemistryMarks + ", mathsMarks=" + mathsMarks
				+ ", getPercentage()=" + getPercentage() + "]";
	}

	
	
	
	
	
	
}

 
 class HistoryStudent extends  Student{
	 private int historyMarks;
	 private int civicsMarks;
	 
	

	



	public HistoryStudent(String studentName,String studentClass,int historyMarks, int civicsMarks) {
		super(studentName,studentClass);
		this.historyMarks = historyMarks;
		this.civicsMarks = civicsMarks;
	}



	@Override
	public int getPercentage() {
	
		return (historyMarks+civicsMarks)/3;
	}



	@Override
	public String toString() {
		return "HistoryStudent [studentName=" + studentName + ", studentClass=" + studentClass + ", historyMarks="
				+ historyMarks + ", civicsMarks=" + civicsMarks + ", getPercentage()=" + getPercentage() + "]";
	}
	 
	 
	 
	 
	 
	 
 }

public class StudentTester {

	public static void main(String[] args) {
	System.out.println("history st:");
		HistoryStudent	s2 =new HistoryStudent("sudeep","11",70,50);
		System.out.println(s2);
		System.out.println("===============================");
		
		
		System.out.println("Science st:");
		ScienceStudent s3=new ScienceStudent("soumy","12",70,50,40);
		System.out.println(s3);
		System.out.println("===============================");
		
		
		System.out.println("to = "+Student.getTotalNoStudents());
	
		
		
		
		

	}

}
