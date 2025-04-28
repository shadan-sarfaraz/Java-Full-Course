package dsaProblem;

import java.util.Scanner;

public class ReverseNumber {
 
 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 int n = sc.nextInt();
	 int rev=0;
	 while(n!=0) {
		 int rem = n%10;
		 rev=rev*10+rem;
		 n = n/10;
	 }
	 System.out.println(rev);
	 
//	 StringBuffer sb = new StringBuffer(String.valueOf(n));
//	 StringBuffer rev2 = sb.reverse();
//	 System.out.println(rev2);
	 
	 StringBuffer sb = new StringBuffer();
	 sb.append(n);
	 System.out.println(sb.reverse());
}

}

