package day1;

import java.util.Scanner;

public class SomeBasicProgramme {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		/*
		int person_age = sc.nextInt() ;
		if(person_age >= 18) {
			System.out.println("eligible for vote");
		}else {
			System.out.println("Not eligible for vote");
		}
		*/
		
		/*
		int week = sc.nextInt();
		switch(week) {
		case 1: System.out.println("sunday");break;
		case 2: System.out.println("monday");break;
		case 3: System.out.println("Tuesday");break;
		case 4: System.out.println("Wednesday");break;
		case 5: System.out.println("Thursday");break;
		case 6: System.out.println("Friday");break;
		case 7: System.out.println("Saturday");break;
		default:System.out.println("No a valid input");
		}
		*/
		
//		int n = sc.nextInt();
//		evenOdd(n);
		
		// Check Positive negetive and zero
		/*
		if(n<0) {
			System.out.println("Negetive");
		}
		else if(n>0) {
			System.out.println("Positive");
		}else {
			System.out.println("zero");
		}*/
		
		checkEven(n);
	}
	

	 static void evenOdd(int n) {
		// TODO Auto-generated method stub
		if(n%2==0) {
			System.out.println("Even Number");
		}else {
			System.out.println("Odd Number");
		}
	}
	 static void checkEven(int n) {
			// TODO Auto-generated method stub
				while(n<=10) {
					if(n%2==0) {
						System.out.println(n + " is Even");
					}else {
						System.out.println(n + " is odd");
					}
					n++;
					}
				}	
		}
	 
	



