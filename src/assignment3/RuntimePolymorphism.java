package assignment3;

public class RuntimePolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal = new Animal();
		animal.makesSound();

		Lion lion = new Lion();
		lion.makesSound();

		Animal animalLion = new Lion();
		animalLion.makesSound();
	}

}
