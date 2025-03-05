package inheritence_has_A_relation;

public class shoping {

	public static void main(String[] args) {
		order o=new order("001","laptop");
		Custumer c1=new Custumer("james","jmeas@example.com",o);
        System.out.println(c1);
	}

}
