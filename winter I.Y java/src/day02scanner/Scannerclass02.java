package day02scanner;

import java.util.Scanner;

public class Scannerclass02 {
	
	public static void main(String[] args) {

		
		/*
		 type a prog. which calculates the area and the perimeter of a square
		 whose side length is entered by user
		 hint1 : area        length *length
		 hint2 : perimeter   4 x ength
		 */
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the length of the side of the square please");
		
		double length = scan.nextDouble();
		System.out.println(length * length); // area
		
		
		System.out.println(4 * length);  // Perimeter
		
		
		
		
		
		
		
		
		
		
		
		
 }
}