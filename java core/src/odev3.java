import java.util.Scanner;

public class odev3 {

	public static void main(String[] args) {
		/*Write a code using ternary:
		Create int variable : price
		Create string variable : decision
		If the price = $10 Print “cheap”
		If price is 10-$20 print “ok”
		Otherwise “expensive”.
		*/


		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a price");
		int price = scan.nextInt();

		if(price < 10) {
			System.out.println("cheap");
		}
		
		if(price >= 10 && price < 20) {
			System.out.println("Ok");
	    }
		
		if(price > 20) {
			System.out.println("expensive");
		}
			
		
	}
}


		
		
	


