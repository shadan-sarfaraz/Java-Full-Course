package dsaProblem;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		String rev = "";
//		for (int i = st.length()-1; i>=0;i--) {
//			rev+=st.charAt(i);
//		}
//		System.out.println(rev);
		//using char array
		char []ch =  st.toCharArray();
		for (int i = ch.length-1; i>=0;i--) {
			rev+=ch[i];
		}
		System.out.println(rev);
		StringBuffer sb = new StringBuffer(st);
		System.out.println(sb.reverse());
	}
	
}
