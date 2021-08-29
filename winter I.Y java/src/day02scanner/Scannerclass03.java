package day02scanner;

import java.util.Scanner;

public class Scannerclass03 {

	public static void main(String[] args) {
		
		
		/*
		 
		 type a program which calculates the area and perimeter of a rectangle 
		 whose length and width are entered by user
		 area width x legth
		 perimeter  2x (width * legth)
		 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("please enter the length");
		int length = scan.nextInt();
		

		System.out.println("now enter the width");
		int width = scan.nextInt();
		
	
		System.out.println(length * width);
		System.out.println(2 * width * length);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
