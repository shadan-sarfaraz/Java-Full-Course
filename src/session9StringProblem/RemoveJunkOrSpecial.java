package session9StringProblem;

import java.util.Scanner;

public class RemoveJunkOrSpecial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
//		System.out.println(st.replaceAll("[^a-zA-Z]", ""));
		System.out.println(st.replaceAll(" ", ""));//will remove all spaces
		
	}

}
//if want to keep number then use "[^a-zA-Z0-9]", ""