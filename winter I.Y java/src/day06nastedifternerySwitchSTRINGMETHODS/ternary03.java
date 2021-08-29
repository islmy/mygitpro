package day06nastedifternerySwitchSTRINGMETHODS;

import java.util.Scanner;

public class ternary03 {

	public static void main(String[] args) {
		/*
		 * 
		 * Ask user to enter an integer. If the number has 3 digits, output will be
“This number has 3 digits.” Otherwise, output will be “This number has no 3 digits.”
How can you decide the number of digits of an integer?
		 * 
	
		 */
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter your number");
		int a = scan.nextInt();
		  
		String result = (a>99 && a<1000) || (a<-99 && a>-1000) ? "your number has 3 digits" : "your number does not have it";
		System.out.println(result);
		
		// Güzel oldu bu:D
		
		
		
			
			
			
	
		
		
		
		
	}

}
