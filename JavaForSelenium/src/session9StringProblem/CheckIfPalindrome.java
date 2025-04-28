package session9StringProblem;

import java.util.Scanner;

public class CheckIfPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		if(isPalindrom(s)) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
		
		
	}
	static boolean isPalindrom(String s) {
		String rev = "";
		boolean ans = false;
		for (int i = s.length()-1; i >=0; i--) {
			rev+=s.charAt(i);
		}
		if(s.equals(rev)) {
			ans = true;
		}
		return ans;
	}

}
