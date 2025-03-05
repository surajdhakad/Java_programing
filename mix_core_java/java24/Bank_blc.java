package java24;

public class Bank_blc {
	private String bankname;
	private String bankcustumername;
	private String bankaddress;
	private String bankIfsccode;
	private int custumerAccountnumber;
	private int currentBalance;
	
	
	public void setDeatils(String bankname,String bankcustumername,
			String addrs,String ifsccode,int accountnumber,int balance) {
		
		this.bankname=bankname;
		this.bankcustumername=bankcustumername;
		this.bankaddress=addrs;
		this.bankIfsccode=ifsccode;
		this.custumerAccountnumber=accountnumber;
		this.currentBalance=balance;
		
		
	}
	public void withdraw(double ammount ) {
		
		
		
		if(currentBalance-ammount<1000)
		{
			
			System.out.println("maintain your balance ");
		}
		else if(currentBalance<=1000) {
			System.out.println("insufficiant balamnce ");
		}
		else if (currentBalance-ammount>1000) {
			currentBalance-=ammount;
			System.out.println("transaction complte");
			System.out.println("abailble balance "+currentBalance);
		}
		
		
		
	}
	public void deposit(double ammount ) {
		
		currentBalance+=ammount;
		System.out.println("deposite complete");
		currentBalance();
		
	}
	public void currentBalance() {
		System.out.println("current balance "+currentBalance);
	}
	

	public String getDeatils() {
	return toString();
	}
	@Override
	public String toString() {
		return "Bank_blc [bankname=" + bankname + ", bankcustumername=" + bankcustumername + ", bankaddress="
				+ bankaddress + ", bankIfsccode=" + bankIfsccode + ", custumerAccountnumber=" + custumerAccountnumber
				+ ", currentBalance=" + currentBalance + "]";
	}

}
