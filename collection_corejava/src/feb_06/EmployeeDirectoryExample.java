package feb_06;

import java.util.ArrayList;
import java.util.Scanner;

class Employee{
	

    private String name;
    private int salary;
    private String position;

    public Employee(String name, int salary, String position) {
        this.name = name;
        this.salary = salary;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public String getPosition() {
        return position;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", salary=" + salary + ", position=" + position + "]";
    }
}



class Directory{
	
	
	 private ArrayList<Employee> employees = new ArrayList<>();

	    public void addEmployee(Employee e) {
	        employees.add(e);
	    }

	
	public void displayAllEmployees() {
		for(Employee employee : employees)
		System.out.println(employees);
	}
	
	 public void updateEmployee(String name, int newSalary, String newPosition) {
	        for (Employee employee : employees) {
	            if (employee.getName().equals(name)) {
	                employee.setSalary(newSalary);
	                employee.setPosition(newPosition);
	                break; 
	            }
	        }
	    }
	

	    public void deleteEmployee(String name) {
	    	
	    	
	    	for(Employee employee : employees) {
	    		  if (employee.getName().equals(name)) {
	    			  employees.remove(employee);
	    		  }
	    	}
	      //  employees.removeIf(employee -> employee.getName().equals(name));
	   // }
}


}




public class EmployeeDirectoryExample {
	public static void main(String[] args) {
        Directory directory = new Directory();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (true) {
            System.out.println("\nEmployee Directory Menu:");
            System.out.println("1. Add Employee");
            System.out.println("2. Update Employee");
            System.out.println("3. Delete Employee");
            System.out.println("4. Display All Employees");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            try {
                choice = scanner.nextInt();
                scanner.nextLine(); 

                switch (choice) {
                    case 1:
                        // Add Employee
                        System.out.print("Enter name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter salary: ");
                        int salary = scanner.nextInt();
                        scanner.nextLine(); 
                        System.out.print("Enter position: ");
                        String position = scanner.nextLine();
                        directory.addEmployee(new Employee(name, salary, position));
                        break;
                    case 2:
                        // Update Employee
                        System.out.print("Enter name of employee to update: ");
                        String updateName = scanner.nextLine();
                        System.out.print("Enter new salary: ");
                        int newSalary = scanner.nextInt();
                        scanner.nextLine(); 
                        System.out.print("Enter new position: ");
                        String newPosition = scanner.nextLine();
                        directory.updateEmployee(updateName, newSalary, newPosition);
                        break;
                    case 3:
                        // Delete Employee
                        System.out.print("Enter name of employee to delete: ");
                        String deleteName = scanner.nextLine();
                        directory.deleteEmployee(deleteName);
                        break;
                    case 4:
                        // Display All Employees
                        System.out.println("\nEmployee List:");
                        directory.displayAllEmployees();
                        break;
                    case 5:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 5.");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); 
              
            }
        }
    }
	
}
