package day04ifelse;

import java.util.Scanner;

public class IfelseStatement_01 {

	public static void main(String[] args) {
		// ask for width and length and checkh whether its a square or not 

				Scanner scan = new Scanner(System.in);
				System.out.println("enter width and length");
				double a = scan.nextDouble();
				double b = scan.nextDouble();
				
				if(a == b) {
					
					System.out.println("OK");
				
				}else{
				    	
					System.out.println("not Ok");
				}
				// well done
				
	}
				
				
}


