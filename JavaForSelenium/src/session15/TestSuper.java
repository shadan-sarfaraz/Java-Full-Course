
package session15;


class Animal{
	 String color = "white";
}

class Dog extends Animal{
	String color = "black";
	void display() {
		System.out.println(super.color);
	}
}

public class TestSuper {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.display();
	}
}
