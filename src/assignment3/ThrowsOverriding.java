package assignment3;

class Parent3 {
	public void method() throws Exception {
		System.out.println("Parent's method");
	}
}

class Child3 extends Parent3 {
	public void method() throws Exception {
		System.out.println("Child's method");
		int result = 10 / 0;
	}
}

public class ThrowsOverriding {
	public static void main(String[] args) {
		Parent3 parent = new Child3();
		try {
			parent.method();
		} catch (Exception e) {
			System.out.println("Exception caught: " + e);
		}
	}
}
