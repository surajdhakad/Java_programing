package ITC_Bakery_Simulation_24_01_25;

public class BakeryExample {
    public static void main(String[] args) {
        Bakery bakery = new Bakery();

        Baker b =new Baker(bakery);
        // Create and start the baker thread
        Thread bakerThread = new Thread(b);
        bakerThread.start();

        // Create and start multiple customer threads
        for (int i = 1; i <= 5; i++) {
            Thread customerThread = new Thread(new Customer(bakery, "Customer " + i));
            customerThread.start();
        }

        // Wait for the baker to finish
        try {
            bakerThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

       
        System.out.println("All customers have finished buying goods.");
    }
}
