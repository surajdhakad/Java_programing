package java29;

public class Emp2demo {
	public static void main(String[] args) {
		EmployeeBlc e=new EmployeeBlc(101,null,43000);
		
			if (e.employeeSalary>=60000) {
			System.out.println("employee is developer");
		}
		else if(e.employeeSalary>=40000&&e.employeeSalary<60000) {
			System.out.println("employee is desiner");
		}
		else if(e.employeeSalary<40000) {
			System.out.println("employee is tester");
		}
		
	}

}
