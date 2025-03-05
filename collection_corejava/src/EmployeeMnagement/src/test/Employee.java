package test;

public class Employee {
	
	
	private String name;
     private String gender;
     private String department;
     private String salary;
     private int year_of_exp;
     
     
	public Employee(String name, String gender, String department, String salary, int year_of_exp) {
		super();
		this.name = name;
		this.gender = gender;
		this.department = department;
		this.salary = salary;
		this.year_of_exp = year_of_exp;
	}


	public String getName() {
		return name;
	}


	public String getGender() {
		return gender;
	}


	public String getDepartment() {
		return department;
	}


	public String getSalary() {
		return salary;
	}


	public int getYear_of_exp() {
		return year_of_exp;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	public void setSalary(String salary) {
		this.salary = salary;
	}


	public void setYear_of_exp(int year_of_exp) {
		this.year_of_exp = year_of_exp;
	}


	@Override
	public String toString() {
		return "Employee [name=" + name + ", gender=" + gender + ", department=" + department + ", salary=" + salary
				+ ", year_of_exp=" + year_of_exp + "]";
	}
	
	
	
     
     
     
     

}
