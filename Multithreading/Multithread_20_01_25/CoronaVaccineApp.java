package Multithread_20_01_25;

public class CoronaVaccineApp {
    public static void main(String[] args)  {
        User user1 = new User("Ramesh", 30, false);
        User user2 = new User("Suresh", 25, true);

        Thread thread1 = new Thread(() -> {
            try {
                user1.bookDose();
            } catch (RuntimeException e) {
                System.out.println(user1.getName() + " " + e.getMessage());
            }
        });

        Thread thread2 = new Thread(() -> {
            try {
                user2.bookDose();
            } catch (RuntimeException e) {
                System.out.println(user2.getName() + " " + e.getMessage());
            }
        });

        thread1.start();
       
      
        
        // Wait for threads to finish
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}