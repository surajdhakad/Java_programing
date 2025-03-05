package javanewa;



public class employee_blc {
	private String firstname;
	private String lastname;
	 private int id;
	 private double salary;
	 private int noofproject;
	 
	 
	 
	 public void setEmployeeData(String fistname,String lastname,int id,double sal,int noofproject) {
		 this.firstname=fistname;
		 this.lastname=lastname;
		 this.id=id;
		 this.salary=sal;
		 this.noofproject=noofproject;
		 
		 
	 }
	 public void calculatesalary() {
		 if(noofproject>=5&&noofproject<=10) {
			 salary+=5000;
			 
		 }
		 else if (noofproject>10&&noofproject<=20) {
			 salary+=10000;
		 }
		 else if (noofproject>20) {
			 salary+=15000;
		 }
	 }
	 public void displaydetails() {
		 System.out.println("employee first name is ="+firstname);
		 System.out.println(" employee last name  is ="+lastname);
		 System.out.println("employee id  is ="+id);
		 System.out.println("employee no of project is  ="+noofproject);
		 System.out.println("employee salary is  ="+salary);
	
		
	 }
	
	

}
