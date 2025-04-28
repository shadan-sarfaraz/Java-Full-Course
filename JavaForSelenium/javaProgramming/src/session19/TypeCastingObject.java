package session19;

public class TypeCastingObject {
	
	class Parent {
		String name = "Shadan";
		void m1() {
			System.out.println("this is from parent class");
		}
	}
	
	class Child extends Parent {
		int id = 100;
		void m2() {
			System.out.println("this is from child class");
		}
	}

	public static void main(String[] args) {
		
		/*Child c = new Child();
		System.out.println(c.name);//parent
		c.m1();
		System.out.println(c.id);
		c.m2();*/
		
		/*Parent p = new Child();//Upcasting
		System.out.println(p.name);//parent
		p.m1();//parent
		p.m1();//parent
		System.out.println(p.id);//we cannot access
		p.m2();//we cannot access.
		*/
		
		//downcasting
		Parent p = new Parent();
		Child c = (Child) p;
		System.out.println(c.name);
		System.out.println(c.id);
		c.m1();
		
	}

}
