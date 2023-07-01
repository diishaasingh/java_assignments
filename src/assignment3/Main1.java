package assignment3;

public class Main1 {
    public static void main(String[] args) {
        Class1 Class1 = new Class1();
        Class2 Class2 = new Class2();

        // Accessing variables of MyClass1 from Main class
        System.out.println("Public variable: " + Class1.a);
        System.out.println("Protected variable: " + Class1.b);
        System.out.println("Default variable: " + Class1.c);
        // System.out.println("Private variable: " + Class1.d); // Cannot access private variable from another class

        System.out.println();

        // Accessing variables of MyClass1 from MyClass2
        Class2.accessVariables(Class1);
    }
}
