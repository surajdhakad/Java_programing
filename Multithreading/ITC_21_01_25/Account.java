package ITC_21_01_25;

 class Account {
	
	private int balance=0;
	
	
	
	public  synchronized void withdraw(int amount){
		
		while(amount>balance){
			
			try {
				System.out.println("account is not sufficiant");
				System.out.println("waiting for deposite");
				wait();
			}
			catch(InterruptedException e){
                e.printStackTrace();				
			}
			
			
		}
		this.balance=this.balance-amount;
		
		System.out.println(" after withdraw your balance is :"+balance);
		notify();
		
		
	}
	
	public  synchronized void deposit(int amount) {
		
		
		this.balance=this.balance+amount;
		System.out.println("Amount after deposite :"+this.balance);
		notify();
	}

}
 class withdraw extends Thread{
	 
	 
	 private Account account;

	public withdraw(Account account) {
		super();
		this.account = account;
	}
	 
	 
	 
	@Override
	public void run() {
		
		int a[]= {1000,2000,3000};
		for(int i:a) {
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {
				System.out.println(e);
			}
		    account.withdraw(i);
		}
	}
	
	 
 }
 
 class depositer extends Thread{
	 
	 
	 private Account account;

	public depositer(Account account) {
		super();
		this.account = account;
	}
	 
	 
	 
	@Override
	public void run() {
		
		int a[]= {500,2000,3000};
		for(int i:a) {
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {
				System.out.println(e);
			}
		    account.deposit(i);
		}
	}
 }
	
