package day12doWhileVarialesConstructors;

import java.util.Scanner;

public class dowhile01 {

	public static void main(String[] args) {
		/*
		 Ask user to enter an integer
//  If the integer is even print on the console “You won!”
//	 Otherwise ask user to enter another integer
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter a number");
		int num = scan.nextInt();
		if(num %2==0 ) {
			System.out.println("you won you lucky bastard");
			
		}else {
			System.out.println("enter another integer");
		}
		
		// while ile yap hatta yeni method olustur. 
		
	}

}
