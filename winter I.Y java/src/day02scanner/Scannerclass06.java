package day02scanner;

import java.util.Scanner;

public class Scannerclass06 {

	public static void main(String[] args) {
	
		/*
		 ask user to enter his or her full name and ask user to enter spouses first name 
		 ask user to enter his or her adress. 
		 */
	
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter your full name: ");
		String fullName = scan.nextLine();
		
		System.out.println("please enter your spouse full name");
		String spouse = scan.next();
		
		scan.nextLine();
		
		System.out.println("please type your adress: ");
		String adress = scan.nextLine();
		
		System.out.println("your name is : " + fullName);
		System.out.println("your spouses name is: " + spouse);
		System.out.println("your adress is: " + adress);
		
		// Well done
		

	}

}
