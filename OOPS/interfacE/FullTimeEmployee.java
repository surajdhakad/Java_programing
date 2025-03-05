package interfacE;

public class FullTimeEmployee implements Employee  {
	
	
	private int employeeId;
	private String employeeName ;
	private double monthlySalary;
	private double benefits ;
	
	
	
	

	public FullTimeEmployee(int employeeId, String employeeName, double monthlySalary, double benefits) {
		super();
		
		if(monthlySalary<=0) {
			System.err.println("Monthly salary cannot be negative");
			System.exit(0);
		}
		else if (employeeName==null) {
			System.out.println("Employee name cannot be empty");
			System.exit(0);
		}
		
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.monthlySalary = monthlySalary;
		this.benefits = benefits;
	}

	@Override
	public double calculateSalary() {
		
		
		double d=monthlySalary+benefits;
		
		
		
		return d;
	}

	@Override
	public void generatePayroll() {
		System.out.println("employeeId is : "+ employeeId);
		System.out.println("employeeName is : " +employeeName);
		System.out.println("benefits is :"+ benefits);
		System.out.println("salary is :"+calculateSalary());
		
	}
	

}
