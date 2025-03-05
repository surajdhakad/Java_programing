package assignment4_12_24;


class HospitalStaff{
	
	private String name;
	private int age;
	private String role;
	
	
	public HospitalStaff(String name, int age, String role) {
		super();
		this.name = name;
		this.age = age;
		this.role = role;
	}


	
	
	
	
	public void work() {
		
		System.out.println("name is :"+name);
		System.out.println("age is :"+age);
		System.out.println("working is:  "+role);
	}
	
	
	
	
	
}

class Doctor extends HospitalStaff{
	
	private  String specialization;

	public Doctor(String name, int age, String role, String specialization) {
		super(name, age, role);
		this.specialization = specialization;
	}
	
	
	@Override
	public void  work()
	{
		super.work();
		System.out.println("specialization in :"+specialization);
	}
	
	
	
	
	
	
	
}

class nurse extends HospitalStaff{
	private int yearsOfExperience;

	public nurse(String name, int age, String role, int yearsOfExperience) {
		super(name, age, role);
		this.yearsOfExperience = yearsOfExperience;
	}
	
	@Override
	public void work() {
		super.work();
		System.out.println("years of experience is taking care of patients.:"+yearsOfExperience);
		
	}
	
}








public class HospitalManagementSystem {

	public static void main(String[] args) {
		
		Doctor d=new Doctor("dr.vinod",32,"md","hert Spealization");
		d.work();
	nurse n=new nurse ("asha",21,"operation",5);
	n.work();

	}

}
