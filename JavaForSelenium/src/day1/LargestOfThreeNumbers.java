package day1;

import java.util.Scanner;

public class LargestOfThreeNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
//		if(a>b&&a>c) {
//			System.out.println("a is largest number");
//		}
//		else if(b>a&&b>c) {
//			System.out.println("b is largest number");
//		}else {
//				System.out.println("c is largest number");
//			
//		}
		SmalletOfThree(a,b,c);
	}
	static void SmalletOfThree(int a, int b, int c) {
		if(a<b && a<c) {
			System.out.println(a);
		}else if(b<c && b<a) {
			System.out.println(b);
		}else {
			System.out.println(c);
		}
	}
}
