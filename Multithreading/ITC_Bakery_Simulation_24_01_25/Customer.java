package ITC_Bakery_Simulation_24_01_25;

class Customer implements Runnable {
    private Bakery bakery;
    private String customerName;

    public Customer(Bakery bakery, String customerName) {
        this.bakery = bakery;
        this.customerName = customerName;
    }

    @Override
    public void run() {
        while (!bakery.isProductionFinished()) {
            try {
				bakery.buyGoods(customerName);
			} catch (Exception e) {
				
				e.printStackTrace();
			}
            try {
                Thread.sleep(100); // Simulate time between purchases
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println(customerName + " has finished buying goods.");
    }
}