package exception31_12_24;


public class Division {
 public static void main(String[] args) throws NumberFormatException {
     try {
        
         if (args.length != 2) {
             throw new IllegalArgumentException("Insufficient arguments. Please provide two integers.");
         }

        
         int a= Integer.parseInt(args[0]);
         int b = Integer.parseInt(args[1]);

         try {
           
             int  result =  a/ b;
             System.out.println("Division result: " + result);
         } catch (ArithmeticException e) {
             
             System.out.println("Arithmetic error: " + e.getMessage());
         }
     } catch (IllegalArgumentException e) {
        
         System.out.println(e.getMessage());
     } finally {

         System.out.println("Division operation completed.");
     }
 }
}
