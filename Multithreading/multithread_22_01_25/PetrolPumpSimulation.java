package multithread_22_01_25;

public class PetrolPumpSimulation {

	public static void main(String[] args) throws InterruptedException {

		PetrolPump p = new PetrolPump();
		car cars[] = { new car("nexon", p), new car("neno", p),new car("verna",p) };

		Thread t[] = new Thread[cars.length];
		int i = 0;
		for (car c : cars) {
			t[i++] = new Thread(c);
		}

		for (Thread h : t) {
			h.start();
			h.join();
		}

	}

}
