package session13;

public class StaticDemo {
	static int a = 10;
	int b = 20;
	static String st = "shadan";
	static void m1() {
		System.out.println("this is m1 static method");
	}
	void m2() {
		System.out.println("this is m2 non-static method");
	}
	void m3() {
		int f=7;
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
	}
//	public static void main(String[] args) {
//		m1();
//		System.out.println(a);
//		StaticDemo s = new StaticDemo();
//		s.m2();
//		System.out.println(s.b);
//		s.m3();
//	}
	
	
}
