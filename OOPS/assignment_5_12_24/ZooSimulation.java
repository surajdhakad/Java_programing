package assignment_5_12_24;



class Animal{
	
	 private String species;

	public Animal(String species) {
		super();
		this.species = species;
	}

	public String getSpecies() {
		return species;
	}


	public void makeSound() {
		
		System.out.println("generic animal sound ");
		
	}

	
	
	

	@Override
	public String toString() {
		return "Animal [species=" + species + "]";
	}

	public Animal reproduce () {
		
		System.out.println("Generic reproduction method for all animals");
		return new  Animal("Unknown");
	}
	
	
	
	
}


class Mammal extends Animal{
	
	 private boolean hasFur;

	public Mammal(String species, boolean hasFur) {
		super(species);
		this.hasFur = hasFur;
	}

	@Override
	public void makeSound() {
		
		
		System.out.println("roar ");
	}

	

	
	

	


	@Override
	public String toString() {
		return "Mammal: "+getSpecies() + ",hasFur :" + hasFur ;
	}

	@Override
	public Mammal reproduce() {
		
System.out.println("Mammals give birth to live young");
	   return new Mammal(getSpecies(),hasFur);	
	}
	
	
	public void nurseYoung() {
        System.out.println(getSpecies() + " is nursing its young.");
    }
	
	
}

class Bird extends Animal {
    private boolean canFly;

   
    public Bird(String species, boolean canFly) {
        super(species); 
        this.canFly = canFly;
    }

    
    @Override
    public void makeSound() {
        System.out.println("Chirp!"); 
    }


    @Override
    public String toString() {
        return "Bird species: " + getSpecies() + ", Can fly: " + canFly;
    }

  
    @Override
    public Bird reproduce() {
        System.out.println("Birds lay eggs as a means of reproduction.");
        return new Bird(getSpecies(), canFly);
    }

    
    public void buildNest() {
        System.out.println(getSpecies() + " is building a nest for its eggs.");
    }
}














public class ZooSimulation {

	public static void main(String[] args) {
		
		Mammal lion = new Mammal("Lion", true);
        System.out.println(lion);
        lion.makeSound(); 
        lion.nurseYoung(); 
        Mammal lionCub = lion.reproduce(); 
        System.out.println(lionCub);
       
       
       System.out.println(".........................");
       
       Bird eagle =new Bird("Eagle",true);
       System.out.println(eagle);
       eagle.makeSound();
       eagle.buildNest();
       
       
       Bird b =eagle.reproduce();
       System.out.println(b);
       
       
       
	}

}
