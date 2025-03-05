package assignment_5_12_24;



class Account{
	private String accountNumber;
	private double balance;
	public Account(String accountNumber, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public double getBalance() {
		return balance;
	}
	
	
	
	  public Account generateStatement() {
	        System.out.println("Account Number: " + accountNumber);
	        System.out.println("Current Balance: " + balance);
	        return this; 
	    }
	
	
}


 class SavingsAccount extends Account {
    private double interestRate;

  
    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance); 
        this.interestRate = interestRate;
    }

    
    @Override
    public SavingsAccount generateStatement() {
        super.generateStatement(); 
        System.out.println("Interest Rate: " + interestRate);
        return this; 
    }
}

 class CheckingAccount extends Account {
	    private double overdraftLimit;

	  
	    public CheckingAccount(String accountNumber, double balance, double overdraftLimit) {
	        super(accountNumber, balance); 
	        this.overdraftLimit = overdraftLimit;
	    }

	   
	    @Override
	    public CheckingAccount generateStatement() {
	        super.generateStatement(); 
	        System.out.println("Overdraft Limit: " + overdraftLimit);
	        return this; 
	    }
	}
















public class BankManagementSystem {

	public static void main(String[] args) {
		
		SavingsAccount s=new SavingsAccount("102532",2500.00,2.5);
		System.out.println("saving account ");
		s.generateStatement();
		System.out.println("CheckAccount  ");
		CheckingAccount c= new CheckingAccount("1201312",342.3,2000.00);
		c.generateStatement();
		

	}

}
