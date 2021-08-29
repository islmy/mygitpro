package day04ifelse;

import java.util.Scanner;

public class Ifelse02 {

	public static void main(String[] args) {
		// ask user to enter a character then whether the character is alphabet or  not
		

		Scanner scan = new Scanner(System.in);
		System.out.println("enter a Charater");
		char ch = scan.next().toLowerCase().charAt(0);
		
		if(ch>='a' && ch<='z') {
			System.out.println("its in alphabet");
		}else {
			System.out.println("its something else sorry...");
		}
			
	}

}				// well done
//