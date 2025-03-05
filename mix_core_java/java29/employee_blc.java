package java29;

public class employee_blc {
	 private String firstname;
	 private String lastname;
	 private int employeeid;
	 private double salary;
	 private int noOfproject;
	 
	 
	 
	public employee_blc(String firstname, String lastname, int employeeid, double salary, int noOfproject) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.employeeid = employeeid;
		this.salary = salary;
		this.noOfproject = noOfproject;
	}
	public void CalculateSalary() {
		
		if(this.noOfproject<0) {
			System.out.println("number of project cannot be nagative");
		}
	else if(this.noOfproject>5&&this.noOfproject<10) {
			this.salary+=5000;
		}
		else if (this.noOfproject>10&&this.noOfproject<20) {
			this.salary+=10000;
		}
		else if(this.noOfproject<20) {
			this.salary+=15000;
		}
	}
	@Override
	public String toString() {
		return "employee_blc [firstname=" + firstname + ", lastname=" + lastname + ", employeeid=" + employeeid
				+ ", salary=" + salary + ", noOfproject=" + noOfproject + "]";
	}
	 
	
	 
	 

}
