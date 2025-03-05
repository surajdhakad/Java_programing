package test;

class  Employee {
	   private String name;
	   private int id;
	   private double salary;
	public Employee(String name, int id, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	} 
	   
	public void  calculateSalary(){
        System.out.println(" calculateSalary"+ calculateSalary);
    }
	
	   
	}


class developer extends Employee{
   private double hra;

public developer(String name, int id, double salary, double hra) {
	super(name, id, salary);
	this.hra = hra;
}

public double getHra() {
	return hra;
}

public void setHra(double hra) {
	this.hra = hra;
}

public void  calculateSalary(){
    super.calculateSalary();
    System.out.println("hra"+hra);

    
}

} 


class manager extends Employee{
    private double ta;
    private double   foodAllowance ;
	public manager(String name, int id, double salary, double ta, double foodAllowance) {
		super(name, id, salary);
		this.ta = ta;
		this.foodAllowance = foodAllowance;
	}
	public double getTa() {
		return ta;
	}
	public void setTa(double ta) {
		this.ta = ta;
	}
	public double getFoodAllowance() {
		return foodAllowance;
	}
	public void setFoodAllowance(double foodAllowance) {
		this.foodAllowance = foodAllowance;
	}
    

    public void calculateSalary(){
        super.calculateSalary();
        System.out.println("ta"+ta);
         System.out.println("foodAllowance"+foodAllowance);

    }
	
    
}






public class EmployeeTester {

	public static void main(String[] args) {
		
		manager m=new manager("suraj",01,400,10.5,5.5);
		m.calculateSalary();
		
		developer d=new developer("vivek",02,500,5.5);
		d.calculateSalary();
		
		
		
     
	}

}
