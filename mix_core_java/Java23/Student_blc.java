package Java23;

public class Student_blc {
	int studentid;
	String studentname;
	double mark;
	 char grade;
	 
	 
	 public void calculateGrade() 
	 {
		 if(mark>=90) 
		 {
			 grade='A';
		 }
		 else if (mark>=81&&mark<90) 
		 {
			 grade='B';
		 }
		 else if (mark>=71 && mark<=80)
		 {
			 grade='c';
		 }
		 else if (mark>=61&&mark<=70) 
		 {
			 grade='D';
		 }
		 else
		 {
			 grade='E';
		 }
		 
		 
		 
	 }
	 public void setStudentdata(int studentid,String studentname,double mark) {
     this.studentid=studentid;
	 this.studentname=studentname;
	 this.mark=mark;
	 }
	 
	 public void displaydetail() {
		 System.out.println("student id is ="+ studentid);
		 System.out.println("student name  is ="+ studentname);
		 System.out.println("student mark  is ="+ mark);
		 System.out.println("student grade is ="+ grade);
	 }
}
