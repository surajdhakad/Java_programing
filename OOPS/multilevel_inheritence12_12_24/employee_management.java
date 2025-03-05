package multilevel_inheritence12_12_24;

class person{
	String name;
	int age;
	public person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public void displayInfo() {
		System.out.println("name :"+name);
		System.out.println("age :"+age);
	}
	
	
}


class employee extends person{
	String employeeId;

	public employee(String name, int age, String employeeId) {
		super(name, age);
		this.employeeId = employeeId;
	}

	public void DisplayemployeeInfo() {
		displayInfo();
		System.out.println("empyeeId :"+employeeId);
		
	}
	
	
}
class manager extends employee{
	String department;

	public manager(String name, int age, String employeeId, String department) {
		super(name, age, employeeId);
		this.department = department;
	}

	public void displayInfomanager() {
		DisplayemployeeInfo();
		System.out.println("department :"+department);
		
	}

	
	

	
}




public class employee_management {

	public static void main(String[] args) {
		manager m= new manager("Alice",34,"E123","IT");
		m.displayInfomanager();

	

}
}
