package day1;

import java.util.Scanner;

public class LargestofTwoNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int result = (a>b)?a:b;
		System.out.println(result);
		
	}
}
