package day07Stringmanupulations;

import java.util.Scanner;

public class SubString01 {

	public static void main(String[] args) {
		
		
		/*/
		 * a part of a string is called substring
		 * we use it to get a part f a string by using indexes
		 */
		
		String s1 = "java is java";
		
		System.out.println(s1.substring(2));// va is java
		
		/*
        Ask user to enter a String 
        If the first and the last character of the String are same
        print "Wooow!" otherwise, print "Hmmmm!" on the console
    */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a string svp");
		String  str5 = scan.nextLine();
		
		
		
		

	}

}
