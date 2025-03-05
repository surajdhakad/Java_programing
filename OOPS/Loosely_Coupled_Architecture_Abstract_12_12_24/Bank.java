package Loosely_Coupled_Architecture_Abstract_12_12_24;

public interface Bank {
	
	void deposit(double amount);
    void withdraw(double amount);
    double checkBalance();
    

}
class SBI implements Bank{
	
	private  double AccountBalance;
	
	
	
	
	
	public SBI(double accountBalance) {
		
		this.AccountBalance = accountBalance;
	}

	@Override
	public void deposit(double amount) {
		
		AccountBalance =AccountBalance+amount;
		System.out.println("Deposited " + amount + " to SBI.and  New balance: " + AccountBalance);
		
	}

	@Override
	public void withdraw(double amount) {
		
		if(amount<=AccountBalance) {
			
			AccountBalance=AccountBalance-amount;
			System.out.println("withdraw"+amount + "to SBI .New balance :"+AccountBalance);
		}
		else
		{
			System.out.println("insuficiant balance "+AccountBalance);
		}
		
	}

	@Override
	public double checkBalance() {
		
		return AccountBalance;
		
	}
	
}


class HDFC implements Bank{
	
	private  double AccountBalance;
	
	
	

	public HDFC(double accountBalance) {
	
		this.AccountBalance = accountBalance;
		
		
	

	
	}
	@Override
	public void deposit(double amount) {
		AccountBalance =AccountBalance+amount;
		System.out.println("Deposited " + amount + " to HDFC. New balance: " + AccountBalance);
		
		
	}

	@Override
	public void withdraw(double amount) {
     if(amount<=AccountBalance) {
			
			AccountBalance=AccountBalance-amount;
			System.out.println("withdraw"+amount + "to HDFC .New balance :"+AccountBalance);
		}
		else
		{
			System.out.println("insuficiant balance "+AccountBalance);
		}
		
	}

	@Override
	public double checkBalance() {
		
		return AccountBalance;
	}
	

}


class ICICI implements Bank{
	
	private  double AccountBalance;
	
	
	
	


	public ICICI(double accountBalance) {
		
		this.AccountBalance = accountBalance;
	}

	@Override
	public void deposit(double amount) {
		AccountBalance =AccountBalance+amount;
		System.out.println("Deposited " + amount + " to ICICI. New balance: " + AccountBalance);
		
		
	}

	@Override
	public void withdraw(double amount) {
	
		 if(amount<=AccountBalance) {
				
				AccountBalance=AccountBalance-amount;
				System.out.println("withdraw"+amount + "to ICICI .New balance :"+AccountBalance);
			}
			else
			{
				System.out.println("insuficiant balance "+AccountBalance);
			}
	}

	@Override
	public double checkBalance() {
	
		return  AccountBalance;
	}
	
	
	
}





 class Customer {
    private String name;
    private double accountBalance;

    
   

	public Customer(String name, double accountBalance) {
		
		this.name = name;
		this.accountBalance = accountBalance;
	}

	public void deposit(Bank bank, double amount) {
        bank.deposit(amount);
    }

    public void withdraw(Bank bank, double amount) {
        bank.withdraw(amount);
    }

    public void checkBalance(Bank bank) {
        double balance = bank.checkBalance();
        System.out.println(name + " balance in the bank is: " + balance);
    }
}
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 