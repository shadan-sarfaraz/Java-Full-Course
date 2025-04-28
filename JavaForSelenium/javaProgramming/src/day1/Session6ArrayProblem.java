package day1;

import java.util.Scanner;

public class Session6ArrayProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
//		int sum = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
//		 sum +=arr[i]; 
		}
//		System.out.println(sum);
		oddEven(arr,n);
	}
	static void oddEven(int[] arr, int n) {
		
		for (int i = 0; i < n; i++) {
			if(arr[i]%2==0) {
				System.out.println(arr[i]+" Is Even Number");
			}else {
				System.out.println(arr[i]+" Is Odd Number");
			}
		}
	}
}
