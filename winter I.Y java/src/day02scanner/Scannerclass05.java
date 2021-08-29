package day02scanner;

import java.util.Scanner;

public class Scannerclass05 {

	/*
	 type a prog. which asks user 1 and last name and print it on the console
	 */
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); 
		
		System.out.println("enter your first and last name");
	
		String fullName = scan.nextLine(); // nextLine yerine next kullanmis olsaydik, sadece ilk kismi almis olacakti.
		
		System.out.println("Your full name is: " + fullName);

		// Good Job
		
	}
	
	

}
