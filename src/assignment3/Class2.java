package assignment3;

public class Class2 {
	public void accessVariables(Class1 Class1) {
		System.out.println("Public variable: " + Class1.a);
		System.out.println("Protected variable: " + Class1.b);
		System.out.println("Default variable: " + Class1.c);
		// System.out.println("Private variable: " + Class1.d); // Cannot access private
		// variable from another class
	}
}
