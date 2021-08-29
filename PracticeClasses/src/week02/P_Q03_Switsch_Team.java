package week02;

import java.util.Scanner;

public class P_Q03_Switsch_Team {

	public static void main(String[] args) {
		// Question 1: Type the codes which asks the user to put the 
        //letters for the favorite football club in Turkey. It prints "Galatasaray" for gs, it prints "Trabzonspor" for ts, it prints "Besiktas" 
        //for bjk and it prints "Fenerbahce" for fb. Please use switch statement in your codes.
		
		
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter the Letters of Your favorite Futboll team ");
		String team = scan.next();
		
		switch(team) {
		case "bjk":
		System.out.println("tinerci");
		break;
		case "gs":
			System.out.println("gassaray");
			break;
		case "fb":
			System.out.println("Mal");
			break;
			default :
				System.out.println("defol");
				scan.close();
		}
  }
}