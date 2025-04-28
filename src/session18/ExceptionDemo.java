package session18;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("programme is started");
		
		Scanner sc = new Scanner (System.in);
		
		//Example1
		/*System.out.println("Enter a number");
		int num = sc.nextInt();
		System.out.println(100/num);*/ //ArthemeticExeption
		
		//Example2
		
		/*int a[] = new int [5];
		System.out.println("Enter a position (0 - 4)");
		int pos = sc.nextInt();
		
		
		System.out.println("Enter a value");
		int value = sc.nextInt();
		
		a[pos]=value;
		
		System.out.println(a[pos]);*/ //ArrayIndexOutOfBoundsException
		
		//Example 3
		/*String s = "Welcome"; // write input "123456"
		int n = Integer.parseInt(s);
		System.out.println(n);*/ //NumberFormatException
		
		//Example 4
		String s = null;
		System.out.println(s.length()); //NullPointerException
		
		System.out.println("programme is completed");
		System.out.println("programme is exited");
	}

}
