package assignment4_12_24;

 class Payment {
    
    public void processPayment() {
        System.out.println("Processing payment");
    }
}
 
  class CreditCardPayment extends Payment {
	    
	    @Override
	    public void processPayment() {
	        System.out.println("Processing credit card payment");
	    }
	}
   class PayPalPayment extends Payment {
	   
	    @Override
	    public void processPayment() {
	        System.out.println("Processing PayPal payment");
	    }
	}

    class BankTransferPayment extends Payment {
	    
	    @Override
	    public void processPayment() {
	        System.out.println("Processing bank transfer payment");
	    }
	}



public class PaymentProcessor {

	public static void main(String[] args) {
		
		Payment genericPayment = new Payment();
        CreditCardPayment creditCardPayment = new CreditCardPayment();
        PayPalPayment payPalPayment = new PayPalPayment();
        BankTransferPayment bankTransferPayment = new BankTransferPayment();

      
        System.out.println("Test Case 1: Generic Payment");
        genericPayment.processPayment(); 

      
        System.out.println("\nTest Case 2: Credit Card Payment");
        creditCardPayment.processPayment(); 
        
        System.out.println("\nProcessing Multiple Payments:");
        processMultiplePayments(genericPayment, creditCardPayment, payPalPayment, bankTransferPayment);
    }

   
    public static void processMultiplePayments(Payment... payments) {
        for (Payment payment : payments) {
            payment.processPayment(); 
        }
    }
		

	}


