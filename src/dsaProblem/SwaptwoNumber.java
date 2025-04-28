package dsaProblem;

public class SwaptwoNumber {
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		
//		int temp = x;
//		x = y;
//		y = temp;
		
		x = x+y;
		y = x-y;
		x = x-y;
//		
//		x = x*y;
//		y = x/y;
//		x = x/y;
		
//		y = x+y- (x=y);
		System.out.println(x+ " " +y);
	}
}
