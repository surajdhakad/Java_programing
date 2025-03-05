package assignment_2_12_24;




class employee{
	int id;
	String name;
	double basicSalary;
	double HRAPer;
	double DAPer;
	
	
	
	public employee(int id, String name, double basicSalary, double hRAPer, double dAPer) {
		super();
		
		if(basicSalary<=0) {
			System.out.println("salary can not be nagative");
			System.exit(0);
		}
		this.id = id;
		this.name = name;
		this.basicSalary = basicSalary;
		HRAPer = hRAPer;
		DAPer = dAPer;
	}



	public double calculateGrossSalary() {
        return basicSalary + HRAPer + DAPer;
    }
	
	
}

class Manager extends employee{
	
	double projectAllowance;
	
	
	




	public Manager(int id, String name, double basicSalary, double hRAPer, double dAPer, double projectAllowance) {
		super(id, name, basicSalary, hRAPer, dAPer);
		this.projectAllowance = projectAllowance;
	}






	 @Override
	 public double calculateGrossSalary() {
	        return super.calculateGrossSalary() + projectAllowance;
	    }
	
	
}


 class Trainer extends employee {
    int batchCount;
    double perkPerBatch;

   
    public Trainer(int id, String name, double basicSalary, double HRAPer, double DAPer, int batchCount, double perkPerBatch) {
        super(id, name, basicSalary, HRAPer, DAPer);
        this.batchCount = batchCount;
        this.perkPerBatch = perkPerBatch;
    }

  
    @Override
    public double calculateGrossSalary() {
        return super.calculateGrossSalary() + (batchCount * perkPerBatch);
    }
}

class Sourcing extends employee {
	    int enrollmentTarget;
	    int enrollmentReached;
	    double perkPerEnrollment;

	   
	    public Sourcing(int id, String name, double basicSalary, double HRAPer, double DAPer, int enrollmentTarget, int enrollmentReached, double perkPerEnrollment) {
	        super(id, name, basicSalary, HRAPer, DAPer);
	        this.enrollmentTarget = enrollmentTarget;
	        this.enrollmentReached = enrollmentReached;
	        this.perkPerEnrollment = perkPerEnrollment;
	    }

	   
	    @Override
	    public double calculateGrossSalary() {
	        double percentageReached = (double) enrollmentReached / enrollmentTarget * 100;
	        return super.calculateGrossSalary() + (percentageReached * perkPerEnrollment);
	    }
	}



 class TaxUtil {
    
    public double calculateTax(employee employee) {
        double grossSalary = employee.calculateGrossSalary();
        if (grossSalary > 30000) {
            return grossSalary * 0.20; 
        } else {
            return grossSalary * 0.05; 
        }
    }
}





















public class Payroll_System {

	public static void main(String[] args) {
		
		employee employee = new employee(1, "John Doe", -23000, 5000, 3000);
        double employeeGrossSalary = employee.calculateGrossSalary();
        double employeeTax = new TaxUtil().calculateTax(employee);
        System.out.println("employee Gross Salary: " + employeeGrossSalary);
        System.out.println("Employee Tax: " + employeeTax);
        
        
        
        
	}

}
