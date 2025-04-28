package session14;

class A{
	int a = 10;
	void display() {
		System.out.println(a);
	}
}
class B extends A{
	int b = 111;
	void print() {
		System.out.println(b);
	}
}
class C extends B{
	int c = 11761;
	void give () {
		System.out.println(c);
	}
}

public class InheritenceType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//single
//		B bobj = new B ();
//		System.out.println(bobj.a);
//		System.out.println(bobj.b);
//		bobj.display();
//		bobj.print();
		
		
		//multi level
		C bobj = new C ();
		System.out.println(bobj.a);
		System.out.println(bobj.b);
		System.out.println(bobj.c);
		bobj.display();
		bobj.print();
		bobj.give();

	}

}
