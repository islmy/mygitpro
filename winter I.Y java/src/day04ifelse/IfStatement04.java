package day04ifelse;

import java.util.Scanner;

public class IfStatement04 {

	public static void main(String[] args) {
		// ask for width and length and checkh whether its a square or not 

		Scanner scan = new Scanner(System.in);
		System.out.println("rnter width and length");
		double width = scan.nextDouble();
		double length = scan.nextDouble();
		
		if(width == length) {
			System.out.println("square");
		}
		if(width != length) {
			System.out.println("not square, Rectangle");
		}
		
		// well done
		
	}

}
