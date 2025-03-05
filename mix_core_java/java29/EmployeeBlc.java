package java29;

public class EmployeeBlc {
	
	public int employeeNumber;
	public String employeeName;
	public  double	employeeSalary;
    
    
    
	public EmployeeBlc(int employeeNumber, String employeeName, double employeeSalary) {
		super();
		this.employeeNumber = employeeNumber;
		if(this.employeeNumber<0) {
			this.employeeNumber=0;
			System.out.println("employee number is always positive integer");
			System.exit(0);
		}
	
		
		this.employeeName = employeeName;
		if(this.employeeName==null) {
			this.employeeName="";
			System.out.println("employee name is not nulll");
			System.exit(0);
			
		}
		this.employeeSalary = employeeSalary;
		if(this.employeeSalary<0) {
			this.employeeSalary=0.0;
			System.out.println("employee sal  is always positive ");
			System.exit(0);
		}
	}
    
    
    

}
