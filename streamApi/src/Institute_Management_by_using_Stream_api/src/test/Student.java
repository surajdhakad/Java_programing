package test;

public class Student {
	
	
	private String name;
	private String gender;
	private String department;
	private double gpa;
	private int years_of_study;
	
	
	public Student(String name, String gender, String department, double gpa, int years_of_study) {
		super();
		this.name = name;
		this.gender = gender;
		this.department = department;
		this.gpa = gpa;
		this.years_of_study = years_of_study;
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


	public double getGpa() {
		return gpa;
	}


	public int getYears_of_study() {
		return years_of_study;
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


	public void setGpa(double gpa) {
		this.gpa = gpa;
	}


	public void setYears_of_study(int years_of_study) {
		this.years_of_study = years_of_study;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", gender=" + gender + ", department=" + department + ", gpa=" + gpa
				+ ", years_of_study=" + years_of_study + "]";
	}
	
	
	
	

}
