package has_a_realtion_28_11_24;

public class Mainclass {

	public static void main(String[] args) {
		
		Address a=new Address("gwalior","chambal","mp");
		Employee e=new Employee(01,"suraj",a);
		System.out.println(e);

	}

}
