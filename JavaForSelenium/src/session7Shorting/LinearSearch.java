package session7Shorting;

import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int found = s.nextInt();
		int []arr = new int [n];
		Boolean status  = false;
		/*for (int i = 0; i < n; i++) {
			arr[i]= s.nextInt();
			if (arr[i]==found) {
				
				System.out.println(found+"Is available in array");
				status = true;
				break;
				
			}
		}
			if (status = false) {
				System.out.println("Search not found.");
			}
		*/
		
		for(int x:arr) {
			arr[x]=s.nextInt();
			if(x==found) {
				System.out.println(found+"Is available in array");
				status = true;
			}
			if (status = false) {
				System.out.println("Search not found.");
			}
		}
	}
}
