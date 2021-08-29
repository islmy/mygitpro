import java.util.Scanner;

public class odev5 {

	public static void main(String[] args) {
		/*
		Ask user to enter a word. If the word has odd number of characters lenth() of characters and has 3 or more characters, print the character in the middle of the word.
		*/

		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a word"); 
		String word = scan.next();
		int mid = word.length()/2;
		
		
		if(word.length()%2 != 0  && word.length()>3) {
			System.out.println(word.charAt(mid));
		}
		

		
	}

}
