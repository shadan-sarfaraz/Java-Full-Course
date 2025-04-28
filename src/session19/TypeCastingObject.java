package session19;

public class TypeCastingObject {

	class Parent {
		String name = "Shadan";

		void m1() {
			System.out.println("This is from parent class");
		}
	}

	class Child extends Parent {
		int id = 100;

		void m2() {
			System.out.println("This is from child class");
		}
	}

	public static void main(String[] args) {

		// Create an object of the outer class to access inner classes
		TypeCastingObject obj = new TypeCastingObject();

		// Upcasting: Child object assigned to Parent reference
		Parent p = obj.new Child(); // Correct: new Child() created

		// Downcasting: Now safe to cast Parent reference back to Child
		Child c = (Child) p; // No ClassCastException here

		System.out.println(c.name); // Access Parent class property
		System.out.println(c.id); // Access Child class property
		c.m1(); // Call Parent class method
		c.m2(); // Call Child class method
	}
}
