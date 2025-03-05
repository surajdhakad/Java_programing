package feb_18;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

class StudentGrade {
    HashMap<String, String> students;
    Scanner s = new Scanner(System.in);

    StudentGrade() {
        this.students = new HashMap<>();
    }

    public void addStdGrade() {
        System.out.print("Enter Student name: ");
        String name = s.nextLine();
        System.out.print("Enter Student Grade: ");
        String grade = s.nextLine(); // Accept grade as a string for now
        students.put(name, grade);
        System.out.println("Student Grade Added Successfully...");
    }

    public void removeStdGrd() {
        if (students.isEmpty()) {
            System.out.println("GradeBook is empty...");
            return;
        }
        System.out.print("Enter Student name to remove: ");
        String name = s.nextLine();
        if (students.containsKey(name)) {
            students.remove(name);
            System.out.println("Student Grade Removed Successfully...");
        } else {
            System.out.println("Student is not Found...");
        }
    }

    public void displayGrades() {
        if (students.isEmpty()) {
            System.out.println("No students and grades to display.");
        } else {
            System.out.println("Student Grade Book:");
            for (String name : students.keySet()) {
                System.out.println(name + ": " + students.get(name));
            }
        }
    }
}

public class students_grade {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        StudentGrade s1 = new StudentGrade();
        boolean f = true;

        while (f) {
            s1.displayGrades(); 
            System.out.println("\nOptions:");
            System.out.println("1. Add Student Grade");
            System.out.println("2. Remove Student Grade");
            System.out.println("3. Exit");

            try {
                int choice = s.nextInt();
                s.nextLine(); 

                switch (choice) {
                    case 1:
                        s1.addStdGrade();
                        break;
                    case 2:
                        s1.removeStdGrd();
                        break;
                    case 3:
                        f = false;
                        break;
                    default:
                        System.out.println("Invalid Option!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                s.nextLine(); 
            }
        }
    }
}