package session18;

import java.util.Scanner;

public class HandleExeption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("programme is started");
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number");
		
		
		int num = sc.nextInt();
		 //ArthemeticExeption
		try
		{
			System.out.println(100/num);
		}catch(ArithmeticException e){
			System.out.println("Invalid data");
		}
		
		System.out.println("programme is completed");
		System.out.println("programme is exited");
	}

}
