package test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Employee_Management {
	
	static List<Employee> employeeList = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
    	

    	 //Scanner sc=new Scanner(System.in);
    	        
    	        //int choice = 0;
    	        while (true) {
    	            System.out.println("Choose an operation:");
    	            System.out.println("1. Add Employee");
    	            System.out.println("2. Update Employee");
    	            System.out.println("3. Remove Employee");
    	            System.out.println("4. List All Employees");
    	            System.out.println("5. Sort Employees by Name");
    	            System.out.println("6. Find Highest Salary by Department");
    	            System.out.println("7. Categorize and Increase Salary");
    	            System.out.println("8. Exit");
    	            int choice = Integer.parseInt(sc.nextLine());
    	            

    	            switch (choice) {
    	                case 1:
    	                	
    	                    addEmployee();
    	                    break;
    	                case 2:
    	                    updateEmployee();
    	                    break;
    	                case 3:
    	                    removeEmployee();
    	                    break;
    	                case 4:
    	                    listAllEmployees();
    	                    break;
    	                case 5:
    	                    sortEmployeesByName();
    	                    break;
    	                    
    	                case 6:
    	                	findHighestSalaryByDepartment();
    	                	break;
    	                	
    	                case 7:
    	                	categorizeAndIncreaseSalary();
    	                	break;
    	                case 8:
    	                    System.out.println("Exiting...");
    	                    System.exit(0);
    	                    break;
    	                default:
    	                    System.out.println("Invalid choice. Please try again.");
    	                    break;
    	            }
    	        }
    	        
    	    
    	    }
    private static void addEmployee() {
        //Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Employee Name:");
        String name = sc.nextLine();
        System.out.println("Enter the Employee gender");
        String gender = sc.nextLine();
        System.out.println("Enter the Employee Department");
        String dept = sc.nextLine();

        try{
            System.out.println("Enter salary ");
            String salaryString = sc.nextLine(); 
            double salaryDouble = Double.parseDouble(salaryString); 
            String salary = String.valueOf(salaryDouble); 

            System.out.println("Enter years of experience");
            int years = Integer.parseInt(sc.nextLine());

            if (years >= 0)
            
            {
                employeeList.add(new Employee(name, gender, dept, salary, years));
            } 
            else 
            
            {
                System.out.println("years of experience cannot be negative.");
            }
        }
        
        catch (NumberFormatException e)
        
        {
            System.out.println("Invalid input.  years of experience must be numbers.");
        }
        
        
    }
    
    
    private static void updateEmployee() {
    	
        //Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter index of employee to update:");
        try {
            int index = Integer.parseInt(sc.nextLine());
            
            if (index >= 0 && index < employeeList.size())
            {
                Employee employee = employeeList.get(index);

                System.out.println("Enter new name:");
                employee.setName(sc.nextLine());

                System.out.println("Enter new gender:");
                employee.setGender(sc.nextLine());

                System.out.println("Enter new department:");
                employee.setDepartment(sc.nextLine());

                System.out.println("Enter new salary:");
                String salaryString = sc.nextLine(); // Read salary as String
                double salaryDouble = Double.parseDouble(salaryString); // Parse to double
                employee.setSalary(String.valueOf(salaryDouble)); 
                
                // Convert back to String and set
                
                System.out.println("Enter new years of experience:");
                String yearsString = sc.nextLine();
                int years = Integer.parseInt(yearsString);
                employee.setYear_of_exp(years);

            } 
            else 
            {
                System.out.println(" Employee not found.");
            }
        } 
        catch (NumberFormatException e) 
        {
            System.out.println("Invalid index input.");
        } 
        
        }
    
    
    private static void removeEmployee() {
    	
       // Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter index of employee to delete:");
        
        try{
            int index = Integer.parseInt(sc.nextLine());
            
            if (index >= 0 && index < employeeList.size())
            {
                Employee employee = employeeList.get(index);

                employeeList.remove(index);
                
                System.out.println("Employee remove successfully");
            }
            else
            {
            	System.out.println("this index is not found");
            }
            
        }
        catch(NumberFormatException e) {
        	System.out.println("Invalid index number ");
        }
    }
    
    
    private static void listAllEmployees() {
    	
    	
    	if(employeeList.isEmpty()) {
    		
    		System.out.println("List is empty:");
    		
    	}
    	else
    	{
    		
    		System.out.println("List of Employee");
    		
    		for(int i=0;i<employeeList.size();i++) {
    			
    			System.out.println("inndex"+ employeeList.get(i));
    		}
    	}
    	
    }
    
    private static void sortEmployeesByName()
    {
    	employeeList
    	.stream()
    	.sorted(Comparator
        .comparing(Employee::getName))
    	.collect(Collectors
    	.toList());
    }
    
    
    private static void findHighestSalaryByDepartment() {
    	 if (employeeList.isEmpty()) {
             System.out.println("Employee list is empty.");
             return;
         }
    	 Map<String, Optional<Employee>> highestSalaryByDept = employeeList
    			 .stream()
                 .collect(Collectors
                 .groupingBy(
                  Employee::getDepartment,
                 Collectors
                 .maxBy(Comparator.comparing(Employee::getSalary))
                 ));
    	 
    	 System.out.println("Highest Salary Employee by Department:");
         highestSalaryByDept.forEach((department, optionalEmployee) -> 
         {
             if (optionalEmployee.isPresent()) 
             {
                 System.out.println("Department: " + department + ", Employee: " + optionalEmployee.get());
             } 
             else
             {
                 System.out.println("Department: " + department + ", No employees in this department.");
             }
         });
     }

    	
    
    
    private static void categorizeAndIncreaseSalary() {
        if (employeeList.isEmpty()) {
            System.out.println("Employee list is empty.");
            return;
        }

        employeeList.stream()
                .collect(Collectors.groupingBy(e -> 
                e.getGender() + "-" + e.getDepartment()))
                .forEach((category, employees) -> {
                    Optional<Employee> highestSalaryEmployee = employees
                    		.stream()
                            .max(Comparator
                            .comparing(Employee::getSalary));

                    highestSalaryEmployee.ifPresent(employee -> {
                       double currentSalary = Double.parseDouble(employee.getSalary());
                        double increasedSalary = (currentSalary*1.10 );
                        employee.setSalary(String.valueOf(increasedSalary));

                        System.out.println("Category: " + category + ", Highest Salary Employee: " + employee);
                    });
                });
    }

    
    
    

   
    
}
