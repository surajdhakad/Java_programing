package exception31_12_24;




class FinancialTransaction {
    
    public void processTransaction(String amount, String account) {
    	
    	
        try {
        	double a=Double.parseDouble(amount);
        	long l=Long.parseLong(account);
           
            if (a <= 0) {
                throw new IllegalArgumentException("Transaction amount must be positive.");
            }
            
           
            if (account.length()!=10) {
                throw new IllegalArgumentException("Invalid account number. It must be 10 digits.");
            }
            
          
            System.out.println("Processing transaction");
            System.out.println("Transaction successful: Amount Rs." + amount + " account " + account);
            
        } catch (NumberFormatException e) {
            System.out.println("Invalid input: Please enter a valid number for transaction amount.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error processing transaction: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Unexpected error during processing: " + e.getMessage());
        }
    }
}











public class tester4 {
    public static void main(String[] args) {
      
        FinancialTransaction t = new FinancialTransaction();
        
       
      t.processTransaction("abc", "1234567890");
      
       
           
       
        
       
        
    }
}