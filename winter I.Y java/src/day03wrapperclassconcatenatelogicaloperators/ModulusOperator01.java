package day03wrapperclassconcatenatelogicaloperators;

import java.util.Scanner;

public class ModulusOperator01 {

	public static void main(String[] args) {
		/*
		  Ask user to enter 3 digit integer.
	 	Type a program to find the sum of the digits
	 	For example; 438 ==> 4+3+8 = 15
		  */

		Scanner scan = new Scanner(System.in);
		System.out.println("please enter a 3 digit integer ");
		int a = scan.nextInt();
				
				int lastdigit = a%10;
				
				int num = a/10;
				int seconddigit = num%10;// be carefull here
				
				int firstdigit = a/100;
				
		System.out.println(lastdigit + seconddigit + firstdigit);
		
	}

}	// Well Done
