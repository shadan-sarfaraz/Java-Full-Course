package day1;

import java.util.Scanner;

public class CountNumberOfDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		System.out.println(Count(n));
//		evenOdd(n);
		sumOfNum(n);
		
	}

	  static void sumOfNum(int n) {
		// TODO Auto-generated method stub
		  int sum = 0;
		while(n!=0) {
			sum = sum+n%10;
			n/=10;
		}
		System.out.println(sum);
	}

	static void evenOdd(int n) {
		// TODO Auto-generated method stub
		int countEven = 0;
		int countOdd = 0;
		
		while(n!=0) {
			if(n%2==0) {
				countEven++;
			}else {
				countOdd++;
			}
			n= n/10;
			
		}
		System.out.println(countEven);
		System.out.println(countOdd);
		
//		
//		while(n!=0) {
//			if(n%2==0) {
//				System.out.print(n%10 + " is even|| ");
//			}else {
//				System.out.print(n%10+ " is odd|| ");
//			}
//			n= n/10;
//		}
	}

	static int Count(int n) {
		// TODO Auto-generated method stub
		 int count = 0;
		 while(n!=0) {
			 
			 n = n/10;
			 ++count;
		 }
		return count;
	}
}
