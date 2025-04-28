package session9StringProblem;

import java.util.Scanner;

public class ReverseStringM2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		char []a = st.toCharArray();
		String rev="";
		for (int i = a.length-1; i >=0; i--) {
			rev+=a[i];
		}
		System.out.println(rev);
	}

}
