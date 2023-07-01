package assignment3;

class Rectangle3 {
	private int length;
	private int width;

	public Rectangle3() {
		this.length = 0;
		this.width = 0;
	}

	public Rectangle3(int length) {
		this.length = length;
		this.width = length;
	}

	public Rectangle3(int length, int width) {
		this.length = length;
		this.width = width;
	}

	public void display() {
		System.out.println(length + "," + width);
	}
}

public class ConstructorOverloading {
	public static void main(String[] args) {
		Rectangle3 rectangle1 = new Rectangle3();
		rectangle1.display();

		Rectangle3 rectangle2 = new Rectangle3(5);
		rectangle2.display();

		Rectangle3 rectangle3 = new Rectangle3(10, 15);
		rectangle3.display();
	}
}
