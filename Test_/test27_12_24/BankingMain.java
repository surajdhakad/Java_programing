package test27_12_24;

abstract class BankAccount {
    protected String accountHolder;
    protected double balance;

    public BankAccount(String accountHolder) {
        this.accountHolder = accountHolder;
        this.balance = 0.0; 
    }
    public abstract  void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract String displayAccountInfo();

    public String displayBalance() {
        return "Current balance: " + balance;
    }
}




class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountHolder, double interestRate) {
        super(accountHolder);
        this.interestRate = interestRate;
    }

  
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

  
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance=balance- amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }


    public String displayAccountInfo() {
        return "Account Holder: " + accountHolder + ", Interest Rate: " + interestRate + "%, " + displayBalance();
    }
}

	
	
	

	public class BankingMain {
	    public static void main(String[] args) {
	      
	        SavingsAccount savingsAccount = new SavingsAccount("suraj", 2.5);

	       
	        savingsAccount.deposit(1000);
	        System.out.println(savingsAccount.displayBalance());

	      
	        savingsAccount.withdraw(200);
	        System.out.println(savingsAccount.displayBalance());

	        
	        System.out.println(savingsAccount.displayAccountInfo());

	       
	        savingsAccount.withdraw(1000);
	        System.out.println(savingsAccount.displayBalance());
	    }
	}
