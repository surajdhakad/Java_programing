package Java23;

public class EmployeeDemo {
	public static void main(String[] args) {
		Employee_blc e=new Employee_blc();
		e.setEmployeeData("ram","kumar",101,50000.0,15);
		e.calculatesalary() ;
		e.displaydetails();
	}

}
