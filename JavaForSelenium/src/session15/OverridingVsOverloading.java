package session15;
class ABC{
	void m1(int a) {
		System.out.println(a);
	}
	void m2(int b) {
		System.out.println(b);
	}
}
class XYZ extends ABC{
	void m1(int a) {
		System.out.println(a*a);
	}
	void m2(int b, int c) {
		System.out.println(b+c);
	}
}

public class OverridingVsOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		XYZ xyzobj = new XYZ();
		xyzobj.m1(45);
		xyzobj.m2(45);
		xyzobj.m2(45+32);
		ABC abcobj = new ABC();
		abcobj.m1(78 );
	}

}
