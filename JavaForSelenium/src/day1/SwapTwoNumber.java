package day1;

import java.util.Scanner;

public class SwapTwoNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		n = m+n;
		m = n-m;
		n = n-m;
		System.out.println(n+" "+m);
//		Swap(n,m);
		
	}

	 static void Swap(int n, int m) {
		// TODO Auto-generated method stub
		int temp = n;
		n = m;
		m=temp;
		System.out.println(n+" "+m);
	}

}
