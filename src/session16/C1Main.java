package session16;

public class C1Main extends C2 implements I1,I2 {
public void m1() {
	System.out.println(x);
}
public void m2() {
	System.out.println(y);
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C1Main C1obj = new C1Main();
		C1obj.m1();
		C1obj.m2();
		C1obj.m3();
		
	}

}
