package bankApplicationusingOOPsandException;





 @SuppressWarnings("serial")
class InsufficientFundsException extends Exception{

	public InsufficientFundsException(String message) {
		super(message);
		
	}
}
 
 @SuppressWarnings("serial")
class InvalidAmountException extends RuntimeException{

	public InvalidAmountException(String message) {
		super(message);
	}
	 
 }

@SuppressWarnings("serial")
class AccountNotFoundException extends Exception{

	public AccountNotFoundException(String meassge) {
		super(meassge);
	}
}

@SuppressWarnings("serial")
class LoanNotAllowedException extends RuntimeException{

	public LoanNotAllowedException(String message) {
		super(message);
	}
	
}








public interface Bank {
    void deposit(double amount) throws InvalidAmountException;
    void withdraw(double amount) throws InsufficientFundsException, InvalidAmountException;
    void transfer(Bank toAccount, double amount) throws InsufficientFundsException, AccountNotFoundException, InvalidAmountException;
    void applyForLoan(double amount) throws LoanNotAllowedException, InvalidAmountException;
    double getBalance();
}


class BankAccount implements Bank{
	
	private long accountNumber;
	private double balance;
	
	

	public BankAccount(long accountNumber, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}


	@Override
	    public void deposit(double amount) throws InvalidAmountException {
	        if (amount <= 0) {
	            throw new InvalidAmountException("Deposit amount must be greater than zero.");
	        }
	        balance += amount;
	    }
	
	@Override
	public void withdraw(double amount) throws InsufficientFundsException, InvalidAmountException {
		 if (amount <= 0) {
	            throw new InvalidAmountException("Amount must be greater than zero.");
	        }
	        if (amount >this.balance) {
	            throw new InsufficientFundsException("Insufficient funds for this withdrawal.");
	        }
	       this. balance =this.balance-amount;
	    }
		
		
	
	@Override
	public void transfer(Bank toAccount, double amount)
			throws InsufficientFundsException, AccountNotFoundException, InvalidAmountException {
		if (toAccount == null) {
            throw new AccountNotFoundException("Target account not found.");
        }
        if (amount <= 0) {
            throw new InvalidAmountException("Transfer amount must be greater than zero.");
        }
        if (amount > this.balance) {
            throw new InsufficientFundsException("Insufficient funds for this transfer.");
        }

     
        this.withdraw(amount);
        toAccount.deposit(amount);
    }
		
	
	@Override
	public void applyForLoan(double amount) throws LoanNotAllowedException, InvalidAmountException {
		if (amount <= 0) {
            throw new InvalidAmountException("Loan amount must be greater than zero.");
        }
        if (this.balance<amount ) {
            throw new LoanNotAllowedException("Loan amount exceeds the allowed limit of " + this.balance);
        }

       
        System.out.println("Loan application for amount " + amount + " has been submitted successfully.");
        System.out.println("your total amount is "+amount+" balace is: "+balance);
    }
		
	
	@Override
	public double getBalance() {
		return this.balance;
	}
	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", balance=" + balance + "]";
	}

}

 class Customer {
    private String name; 
    private BankAccount account; 
    
    public Customer(String name, BankAccount account) {
        this.name = name;
        this.account = account;
    }

   
    public BankAccount getAccount() {
        return this.account;
    }
 }

   
    


