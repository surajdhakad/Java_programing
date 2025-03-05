package multithread_22_01_25;

class PetrolPump {

	public synchronized void refillCar(String name) {

		System.out.println(name + " started refilling...");
		try {
			
			Thread.sleep(3000);
			
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		System.out.println(name + " completed refilling!.");
	}

}

class car implements Runnable {

	String name;
	PetrolPump petrolpump;

	public car(String name, PetrolPump petrolpump) {
		super();
		this.name = name;
		this.petrolpump = petrolpump;
	}

	@Override
	public void run() {
		petrolpump.refillCar(name);

	}

}
