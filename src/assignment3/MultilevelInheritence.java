package assignment3;

class Shape1 {
	public void display() {
		System.out.println("This is a shape.");
	}
}

class Quadrilateral extends Shape1 {
	public void display() {
		System.out.println("This is a quadrilateral.");
	}
}

class Parallelogram extends Quadrilateral {
	public void display() {
		System.out.println("This is a parallelogram.");
	}
}

class Rectangle2 extends Parallelogram {
	public void display() {
		System.out.println("This is a rectangle.");
	}
}

class Rhombus extends Parallelogram {
	public void display() {
		System.out.println("This is a rhombus.");
	}
}

class Square extends Rectangle2 {
	public void display() {
		System.out.println("This is a square.");
	}
}

class Kite extends Quadrilateral {
	public void display() {
		System.out.println("This is a kite.");
	}
}

class Circle2 extends Shape1 {
	public void display() {
		System.out.println("This is a circle.");
	}
}

public class MultilevelInheritence {
	public static void main(String[] args) {
		Shape1 shape = new Shape1();
		shape.display(); 

		Quadrilateral quadrilateral = new Quadrilateral();
		quadrilateral.display(); 

		Parallelogram parallelogram = new Parallelogram();
		parallelogram.display(); 

		Rectangle2 rectangle = new Rectangle2();
		rectangle.display();

		Rhombus rhombus = new Rhombus();
		rhombus.display();

		Square square = new Square();
		square.display();

		Kite kite = new Kite();
		kite.display();

		Circle2 circle = new Circle2();
		circle.display();
	}
}
