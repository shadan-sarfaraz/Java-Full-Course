package day1;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(isPalindrome(n)==n) {
			System.out.println("Number is palindrome");
		}else {
			System.out.println("Number is not palindrome");
		}
		
	}

	 static int isPalindrome(int n) {
		// TODO Auto-generated method stub
		 int reverse = 0;
		while(n!=0) {
			
				reverse = (reverse*10)+n%10;
				n=n/10;
			}
			return reverse;
	}
}
