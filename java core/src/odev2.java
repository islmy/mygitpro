import java.util.Scanner;

public class odev2 {

	public static void main(String[] args) {
		/* 
		Write the Switch Case java code, which says how many days the user has entered for the month he entered.		 
		*/


		String month; 
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the month");
		
		month = scan.next();
		
		switch(month) {
		case "january" : 
			System.out.println("31");
			break;
		case "february" : 
			System.out.println("28");
			break;
		case "march" : 
			System.out.println("31");
			break;
		case "april" : 
			System.out.println("30");
			break;
		case "may" : 
			System.out.println("31");
			break;
		case "june" : 
			System.out.println("30");
			break;
		case "july" : 
			System.out.println("31");
			break;
		case "august" : 
			System.out.println("31");
			break;
		case "september" : 
			System.out.println("30");
			break;
		case "october" : 
			System.out.println("31");
			break;
		case "november" : 
			System.out.println("30");
			break;
		case "december" : 
			System.out.println("31");
			break;
		default : 
			System.out.println("invalid month");
		}
		
		
		
	}

}
