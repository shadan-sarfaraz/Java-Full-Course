package session8and9String;

public class StringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Shadan";
		//another way of defining string
//		s = new String("Shadsn");
		String rev = "";
		for (int i = s.length()-1; i >=0; i--) {
			rev+=s.charAt(i);
		}
		System.out.println(rev);
	}
	

}
