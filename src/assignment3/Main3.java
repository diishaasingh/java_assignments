package assignment3;

abstract class House {
	protected String location;
	protected int numberOfRooms;

	public House(String location, int numberOfRooms) {
		this.location = location;
		this.numberOfRooms = numberOfRooms;
	}

	public void buildHouse() {
		layFoundation();
		constructWalls();
		installDoorsAndWindows();
		furnishHouse();
		completeHouse();
	}

	protected abstract void layFoundation();

	protected abstract void constructWalls();

	protected abstract void installDoorsAndWindows();

	protected abstract void furnishHouse();

	protected void completeHouse() {
		System.out.println("House in " + location + " with " + numberOfRooms + " rooms is completed.");
	}
}

class ConcreteHouse extends House {
	public ConcreteHouse(String location, int numberOfRooms) {
		super(location, numberOfRooms);
	}

	protected void layFoundation() {
		System.out.println("Laying foundation for a concrete house.");
	}

	protected void constructWalls() {
		System.out.println("Constructing walls for a concrete house.");
	}

	protected void installDoorsAndWindows() {
		System.out.println("Installing doors and windows for a concrete house.");
	}

	protected void furnishHouse() {
		System.out.println("Furnishing a concrete house.");
	}
}

class WoodenHouse extends House {
	public WoodenHouse(String location, int numberOfRooms) {
		super(location, numberOfRooms);
	}

	protected void layFoundation() {
		System.out.println("Laying foundation for a wooden house.");
	}

	protected void constructWalls() {
		System.out.println("Constructing walls for a wooden house.");
	}

	protected void installDoorsAndWindows() {
		System.out.println("Installing doors and windows for a wooden house.");
	}

	protected void furnishHouse() {
		System.out.println("Furnishing a wooden house.");
	}
}

public class Main3 {
	public static void main(String[] args) {
		House concreteHouse = new ConcreteHouse("Suburban", 3);
		concreteHouse.buildHouse();

		System.out.println();

		House woodenHouse = new WoodenHouse("Countryside", 4);
		woodenHouse.buildHouse();
	}
}
