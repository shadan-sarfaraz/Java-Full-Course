package session18;

public class MultipleCatchBlocks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("programme is started...");
		String s = null;
		try {
			System.out.println(s.length());
		}/*catch(ArithmeticException e) {
			System.out.println("Handeled exeption.....");
			System.out.println(e.getMessage());
		}catch(NullPointerException e) {
			System.out.println("Handeled exeption.....");
			System.out.println(e.getMessage());
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Handeled exeption.....");
			System.out.println(e.getMessage());
		}catch(NumberFormatException e) {
			System.out.println("Handeled exeption.....");
			System.out.println(e.getMessage());
		}*/
		
		catch(Exception e) {
			System.out.println("Handeled exeption.....");
			System.out.println(e.getMessage());
		}
		System.out.println("programme finished..");
	}

}
