package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student_Management {

	
	private static List<Student> st=new ArrayList<Student>();
	
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
		 while (true) {
	        System.out.println("Choose an operation:");
            System.out.println("1. Add Student");
            System.out.println("2. List Students");
            System.out.println("3. Exit");

            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    addStudents();
                    break;
                case 2:
                	listAllStudents();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

	}
	
	
	private static void addStudents()
	 {
		
		System.out.println("Enter the Students Name:");
		String name=sc.nextLine();
		System.out.println("Enter the Students gender:");
		String gender=sc.nextLine();
		System.out.println("Enter the Students Deparment:");
		String department=sc.nextLine();
		System.out.println("Enter the Students gpa");
	    double gpa=Double.parseDouble(sc.nextLine());
	    System.out.println("Enter the Students years_of_study");
	    int years_of_study=Integer.parseInt(sc.nextLine());
	    
	    try {
	    if(gpa<=0||gpa >=4.0 && years_of_study<0) {
	    	
	    	System.out.println("students gpa is 0 to 4.0 and students years_of_study not must be nagative");
	    	
	    }
	    else
	    {
	    	st.add(new Student(name,gender,department,gpa,years_of_study));
	    }
	    }
	    catch(IllegalArgumentException e) {
	    	System.out.println("number can not be nagtive and String can't accept number");
	    }
	    
		
	}
	
	private static void listAllStudents() {
		if(st.isEmpty()) {
			
			System.out.println("Students list is empty");
		}
		else
		{
			System.out.println("Stundets list");
			
			for(Student s:st) {
				
				System.out.println(s);
				
			}
		}
	}
	
	
	private static void sortStudentsByGpa() {
		
	}
	
	

}
