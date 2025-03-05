package ITC_21_01_25;

public class ATMMachine {

	public static void main(String[] args) {
		
		
		Account s=new  Account();
		
		withdraw d1=new withdraw(s);
		depositer d=new depositer(s);
		d1.start();
		d.start();
		
	}

}
