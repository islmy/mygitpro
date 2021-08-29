package day02scanner;

import java.util.Scanner;

public class Scannerclass07 {

	public static void main(String[] args) {
		
		/*
		 take the first characters
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter your first name");
		//now we need just the first character of the given name
		char firstNameInitial = scan.next().charAt(0); // this 0 is the index of the first character
	
		
		System.out.println("enter your last name : ");
		char soyAdi = scan.next().charAt(0);
		
		System.out.println("" + firstNameInitial + soyAdi);// will display ascii values, unless we dont use emty string of ""
		
		// well done
		
		
	}

}
