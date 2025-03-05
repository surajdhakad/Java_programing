package feb_20;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class RetrieveObject {
  public static void main(String[] args) {
      try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\i\\student.txt"))) {
          ArrayList<Student> studentList = (ArrayList<Student>) ois.readObject();

          System.out.println("Retrieved Student Objects:");
          for (Student student : studentList) {
              System.out.println(student); 
          }

      } catch (IOException | ClassNotFoundException e) {
          e.printStackTrace();
      }
  }
}
