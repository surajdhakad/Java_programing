package bankApplicationusingOOPsandException;


import java.util.Scanner;

public class Atm {
    

    public static void main(String[] args) {
    
        System.out.println("select an option :");
        System.out.println("1.deposit  \n2.withdraw \n3.transfer \n4.loan Applocation \n5.check balance \n6.exit");
        Scanner sc=new Scanner(System.in);
        
        
        BankAccount b1=new BankAccount(123456,1000);
        BankAccount b2 =new BankAccount(000001,2000);
        
        Customer c1=new Customer("suraj",b1);
        Customer c2=new Customer("saumy",b2);
        
        
        try(sc){
        	
        System.out.println("enter the option");
        int o=sc.nextInt();
        switch(o) {
        case 1:System.out.println("enter the amount to deposit");
        int am=sc.nextInt();
        c1.getAccount().deposit(am);
        System.out.println("balance is increased by "+am+" balance is :"+c1.getAccount().getBalance());
        break;
        
        case 2:System.out.println("enter amount to withdraw :");
        am=sc.nextInt();
        c1.getAccount().withdraw(am);
        System.out.println("withdraw complete");
        System.out.println("your  reamining balance is :"+c1.getAccount().getBalance());
        break;
        
        
        case 3:System.out.println("enter transfer");
        am=sc.nextInt();
        c1.getAccount().transfer(c2.getAccount(), am);
        System.out.println("transfer succefull");
        System.out.println("your current balance :"+c1.getAccount().getBalance());
        break;
        
        case 4:System.out.println("enter the loan ammount");
        am=sc.nextInt();
        c1.getAccount().applyForLoan(am);
        System.out.println("allowed for loan now your balance :"+c1.getAccount().getBalance());
        break;
        case 5:System.out.println("your balance is :"+c1.getAccount().getBalance());
        break;
        }
        }
        catch(InvalidAmountException e) {
        	System.out.println(e);
        }
        catch(InsufficientFundsException e)
        {
        	System.out.println(e);
        }
        catch(LoanNotAllowedException e) {
        	System.out.println(e);
        }
        catch(AccountNotFoundException e) {
        	System.out.println(e);
        }
        catch(Exception e) {
        	System.out.println(e);
        }
        System.out.println("thank you have a nice day");
        
    }
}

    