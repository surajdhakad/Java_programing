package feb_20;
import java.time.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

class Student implements Serializable{
	
	private Integer studentId;
	private String studentName;
	private Double studentFee;
	private Date dateOfAdmission;
	
	
	public Student(Integer studentId, String studentName, Double studentFee, Date dateOfAdmission) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentFee = studentFee;
		this.dateOfAdmission = dateOfAdmission;
	}


	
	  public static Student getStudentObject(Scanner scanner) {
	        System.out.println("Enter student details:");
	        System.out.print("ID: ");
	        int id = scanner.nextInt();
	        scanner.nextLine(); 
	        System.out.print("Name: ");
	        String name = scanner.nextLine();
	        System.out.print("Fees: ");
	        double fees = scanner.nextDouble();
	        scanner.nextLine();
	        System.out.print("Date of Admission (YYYY-MM-DD): ");
	        String dateStr = scanner.nextLine();
	        Date admissionDate=java.sql.Date.valueOf(dateStr);

	        return new Student(id, name, fees, admissionDate);
	    }




	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentFee=" + studentFee
				+ ", dateOfAdmission=" + dateOfAdmission + "]";
	}
	
	
	
	
	
}


public class StoreObject {
public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  ArrayList<Student> studentList = new ArrayList<>();

  try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("D:\\i\\student.txt")))) {
      char choice = 'y';
      while (choice == 'y' || choice == 'Y') {
          Student student = Student.getStudentObject(scanner);
          studentList.add(student);
          System.out.print("Do you want to add another student (y/n)? ");
          choice = scanner.nextLine().charAt(0);
      }

      oos.writeObject(studentList);
      System.out.println("Student objects serialized and saved to Student.txt");

  } catch (IOException e) {
      e.printStackTrace();
  } finally {
      scanner.close(); 
  }
}
}












