package session18;

import java.util.Scanner;

public class FinallyBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("programme is started");
				
		String s = null;
		try {
			System.out.println(s.length());
		}catch(NullPointerException e) {
			System.out.println("Catch Block Handeled exeption.....");
			System.out.println(e.getMessage());
		}finally {
			System.out.println("You entered into finally block");
		}
		
		System.out.println("programme is completed");
		System.out.println("programme is exited");
	}

}
