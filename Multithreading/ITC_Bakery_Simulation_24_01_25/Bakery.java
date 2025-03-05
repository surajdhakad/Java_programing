package ITC_Bakery_Simulation_24_01_25;

class Bakery {
    private int goodsAvailable = 0;
    private final int MAX_GOODS_PER_DAY = 100;
    private int goodsProducedToday = 0;

    public synchronized void bakeGoods() {
        while (goodsAvailable > 0 || goodsProducedToday >= MAX_GOODS_PER_DAY) {
            try {
                wait(); // Wait if goods are available or production limit is reached
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        // Bake 10 goods
        if (goodsProducedToday < MAX_GOODS_PER_DAY) {
            goodsAvailable += 10;
            goodsProducedToday += 10;
            System.out.println("Baker baked 10 goods. Total goods available: " + goodsAvailable);
            notifyAll(); // Notify customers that goods are available
        }
    }

    public synchronized void buyGoods(String customerName) {
        while (goodsAvailable <= 0) {
            try {
                System.out.println(customerName + " is waiting for goods.");
                wait(); // Wait if no goods are available
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        // Buy a good
        goodsAvailable--;
        System.out.println(customerName + " bought a good. Goods left: " + goodsAvailable);

        if (goodsAvailable == 0) {
            notify(); // Notify baker to bake more goods if bakery is empty
        }
    }

    public synchronized boolean isProductionFinished() {
        return goodsProducedToday >= MAX_GOODS_PER_DAY && goodsAvailable == 0;
    }
}
 
 
