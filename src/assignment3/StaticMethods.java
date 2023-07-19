package assignment3;

class Parent1 {
	public static void staticMethod() {
		System.out.println("static method of parent class.");
	}

	public void nonStaticMethod() {
		System.out.println("non-static method of Parent class.");
	}
}

class Child1 extends Parent1 {
	public static void staticMethod() {
		System.out.println("static method of Child class.");
	}

	public void nonStaticMethod() {
		System.out.println("non-static method of Child class.");
	}
}

public class StaticMethods {
	public static void main(String[] args) {
		Parent1.staticMethod();

		Child1.staticMethod();

		Parent1 parent = new Parent1();
		parent.nonStaticMethod();

		Child1 child = new Child1();
		child.nonStaticMethod();

		Parent1 childVariable = new Child1();
		childVariable.nonStaticMethod();
		childVariable.staticMethod();

		// static method should be called using className
	}
}
