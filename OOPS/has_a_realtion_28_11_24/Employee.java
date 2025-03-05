package has_a_realtion_28_11_24;

public class Employee {
	
	private int empId;
	private String empName;
	private Address address;
	
	public Employee(int empId, String empName, Address address) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", address=" + address + "]";
	}
	
	
	

}
