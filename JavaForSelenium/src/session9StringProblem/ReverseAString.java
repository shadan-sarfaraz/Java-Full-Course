package session9StringProblem;

import java.util.Scanner;

public class ReverseAString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st = sc.next();
		String reverse="";
		for (int i = st.length()-1; i >=0; i--) {
			reverse=reverse+st.charAt(i);
		}
		System.out.println(reverse);
	}
}
//"1234"
