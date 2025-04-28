package session13;
public class StaticMain {
	public static void main(String[] args) {
		StaticDemo.m1();
		System.out.println(StaticDemo.a);
		StaticDemo s = new StaticDemo();
		s.m2();
		System.out.println(s.b);
		s.m3();
		System.out.println(StaticDemo.st.length()) ;		
	}
}
