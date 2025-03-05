package Has_A_relation27_11;

public class CarMain {

	public static void main(String[] args) {
		
		Driver jone=new Driver("john",30);
		Car c=new Car("honda","creta",2020,jone);
		
		Driver logan=new Driver("logan",35);
		Car c1=new Car(c);
		c1.changeDriver(logan);
		System.out.println(c);
		System.out.println(c1);
		
		

	}

}
