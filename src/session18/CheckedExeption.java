package session18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExeption {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.out.println("programme is started");
		System.out.println("programme in progress");
		FileInputStream files = new FileInputStream("c:\\TEXT.text");
		
		try {
			FileInputStream file = new FileInputStream("c:\\TEXT.text");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
		Thread.sleep(5000);
		}catch(InterruptedException e) {
			
		}
		System.out.println("programme is completed");
		System.out.println("programme is exited");
	}

}
