package ITC_Bakery_Simulation_24_01_25;


class Baker implements Runnable {
    private Bakery bakery;

    public Baker(Bakery bakery) {
        this.bakery = bakery;
    }

    @Override
    public void run() {
        while (!bakery.isProductionFinished()) {
            try {
				bakery.bakeGoods();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
        System.out.println("Baker has finished production for the day.");
    }
}