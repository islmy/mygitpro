package week01dt;

import java.util.Scanner;

public class Q07_Password {

	public static void main(String[] args) {
		/*
        Type java code by using if-else statement,
if the password is “JavaLearner”, output will be “The password is true”.
Otherwise, output will be “The password is false”.
        */
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the passport");
		String password = scan.nextLine();
				if (password.equals("java Learner")) {;
		System.out.println("The password is True"); 
				}
				
		else {	
			System.out.println("The password is False");
			}
		
		
		
		
		
		
		
		

	}

}
