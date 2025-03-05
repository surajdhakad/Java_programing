package java24;

import java.util.Scanner;

public class Bankdemo {

	public static void main(String[] args) {
		Bank_blc b=new Bank_blc();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your bank name");
	     String bankname=sc.nextLine();
	     System.out.println("enter custumer name");
	     String bankcustumer=sc.nextLine();
	     System.out.println("enter your addrs name");
	     String bankaddress=sc.nextLine();
	     System.out.println("enter your ifsc code name");
	     String bankIfsccode=sc.nextLine();
	     System.out.println("enter your account number  name");
	     int custumerAccountnumber=sc.nextInt();
	     System.out.println("enter your bank balance name");
	     int currentBalance=sc.nextInt();
	     
		b.setDeatils(bankname, bankcustumer, bankaddress, bankIfsccode, custumerAccountnumber, currentBalance);
		
	   System.out.println("how much amt do you want to wid");
	   double w=sc.nextDouble();
        b.withdraw(w);
        System.out.println("how much amt do you want ti dep");
 	   double de=sc.nextDouble();
        b.deposit(de);
        b.currentBalance();
        b.getDeatils();
	}
	

}
