import java.util.Scanner;

public class odev {

	public static void main(String[] args) {


/* 
Write the Switch Case java code that prints the A, B, C, D, F notes that the user has entered.            
           A Excellent				
           B	Good				
           C	Average				
           D	Deficient				
           F	Failing				
*/
		
		
		Scanner scan = new Scanner(System.in);
		String notes;
		System.out.println("Enter notes letter:");
		notes = scan.nextLine();
		
		switch(notes) {
		case "a" :
			System.out.println( "Excellent" );
			break;
		case "b" :
			System.out.println("Good" );
			break;
		case "c" :
			System.out.println( "Average");
			break;
		case "d" :
			System.out.println( "Deficient" );
			break;
		case "f" :
			System.out.println( "Failing" );
			break;
			
		default:
			System.out.println("Invalid Value");
			break;
		}
		
		
		
		
		
	}

}
