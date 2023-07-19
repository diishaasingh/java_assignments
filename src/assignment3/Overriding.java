package assignment3;

class Parent {
	public void display() {
		System.out.println("display method of Parent class.");
	}
}

class Child extends Parent {
	public void display() {
		System.out.println("display method of Child class.");
	}
}

public class Overriding {
	public static void main(String[] args) {
		Parent parent = new Parent();
		parent.display();

		Child child = new Child();
		child.display();

		Parent polymorphicParent = new Child();
		polymorphicParent.display();
	}
}
