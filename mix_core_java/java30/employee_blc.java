package java30;

public class employee_blc {
private String name;
private int age;
private String department;
private double salary;
private String performance;

public employee_blc(String name, int age, String department, double salary, String performance) {
	super();
	this.name = name;
	this.age = age;
	this.department = department;
	this.salary = salary;
	this.performance = performance;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public int getAge() {
	return age;
}


public void setAge(int age) {
	
	this.age = age;
	
}


public String getDepartment() {
	return department;
}


public void setDepartment(String department) {
	this.department = department;
}


public double getSalary() {
	return salary;
}

public void setSalary(double salary) {
	this.salary = salary;
	
}
public  double updateSalary()
{
	if(performance.equals("good")) {
	
	 setSalary(getSalary()+10000);
	}
	else if(performance.equals("average"))
	{
	setSalary(getSalary()+5000);
	}
	else if(performance.equals("")){
		setSalary(getSalary());
		System.out.println("not give any bonus");
	}
		
	
	return getSalary();
}

@Override
public String toString() {
	if(age>0)
	{
		return "employee_blc [name=" + name + ", age=" + age + ", department=" + department + ", salary=" + salary
			+ ", performance=" + performance + "]";
	}
	else
	{
		return "age must be positive integer";
	}
}



	
}




