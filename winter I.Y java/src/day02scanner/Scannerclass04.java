package day02scanner;

import java.util.Scanner;

public class Scannerclass04 {

	public static void main(String[] args) {
		
		/*
		 calculate the volume of a rectengular prism 
		 length width and heigh entered by user
		 hint: width*length*high
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter the legth of the prism");
		double length = scan.nextDouble();
		
		System.out.println("please enter the width");
		double width = scan.nextDouble();
		
		System.out.println("please enter the heigh");
		double heigh = scan.nextDouble();
		
		System.out.println(width * heigh * length);
		
		
		
		// Good Job 
		

	}

}
