package day1;

import java.util.Scanner;

public class ReverseANumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = reverseANumber(n);
		System.out.println(ans);
	}

	  static int reverseANumber(int n) {
		// TODO Auto-generated method stub
		  int result=0;
		while (n!=0) {
			int reminder = n%10;
			result = (result*10)+reminder;
			n=n/10;
			
		}
		
		return result;
	}
}
