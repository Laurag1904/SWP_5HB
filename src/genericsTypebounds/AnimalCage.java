package genericsTypebounds;

public class AnimalCage <T extends Animal> {
	
	private final Animal animal;
	
	public void makeSound(Animal c) {
		c.makeSound();
	}

	public AnimalCage(Animal animal) {
		this.animal = animal;
	}

	public Animal getAnimal() {
		return animal;
	}
	
	
}
