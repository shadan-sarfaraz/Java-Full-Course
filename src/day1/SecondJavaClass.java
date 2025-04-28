package day1;

import java.util.Iterator;
import java.util.Scanner;

public class SecondJavaClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int[] arr = new int[n];
//		for(int i = 0; i<n;i++) {
//			arr[i] = sc.nextInt();
//		}
		//find pair sum in a array.
//		int a = sc.nextInt();
		
//		System.out.println(pairSum(arr, n, a));
//		FInd even and odd numbers in a array.
//		evenodd(arr, n);
//		System.out.println(avarageInArray(arr, n));
//		checkDivisibilityBy6(n);
//		palindrome(n);
//		int a = 5;
//		int res = a++;
//		System.out.println(res);
//		System.out.println(res);
//		System.out.println(a);
		
		
		int age = 30;
		String result = (age>=18)?"eligible" :"not eligible";
		System.out.println(result);
	}

		static void palindrome(int n) {
		// TODO Auto-generated method stub
		
	}

		static void checkDivisibilityBy6(int n) {
		// TODO Auto-generated method stub
			if(n%6==0) {
				System.out.println("Yes");
			}else {
				System.out.println("no");
			}
	}

		static int avarageInArray(int[] arr, int n) {
			int avg=0;
			int sum = 0;
			for (int i = 0; i < n; i++) {
				sum+=arr[i];
			}
			return avg=sum/n;
	}

	static void evenodd(int[] arr, int n) {
		  
		  int countEven =0;
		  int countOdd=0;
		  for (int i = 0; i < n; i++) {
			if(arr[i]%2==0) {
				countEven++;
			}else {
				countOdd++;
			}
		}
		  
		  System.out.println(countEven+" "+countOdd);
	}

	static Boolean pairSum(int[] arr, int n, int a) {
		   for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(arr[i]+arr[j] == a) {
					return true;
				}
			}
		}
		return false;
		// TODO Auto-generated method stub
		
	   }
	   
}
	  

