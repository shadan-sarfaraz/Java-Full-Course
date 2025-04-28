package session12polymorphism_overloading_encapsulation;

public class BoxMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box voluem1 = new Box();
		Box voluem2 = new Box(11,12,13);
		Box voluem3 = new Box(15);
		System.out.println(voluem1.volume());
		System.out.println(voluem2.volume());
		System.out.println(voluem3.volume());
	}

}
