package Stream_Day_2_27_feb;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class question_5 {
	
	public static void main(String[] args) {
		
		List <Employee> list=new ArrayList<Employee>();
		
		list.add(new Employee("suraj",12));
		list.add(new Employee("vivek",32));
		list.add(new Employee("alex",42));
		list.add(new Employee("john",62));
		
		
		List<String> s=
		list.stream()
	                .map(Employee::getName).collect(Collectors.toList());
	                
	        System.out.println(s);
}
}
