package day02scanner;

import java.util.Scanner;

public class Scannerclass01 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);// new      means creating an object
											  // System   is a class either
											  // in       means getting data from outside
		
		
		System.out.println("enter an integer");
		int num1 = scan.nextInt();
		
		System.out.println("enter the second integer");
		int num2 = scan.nextInt();
		
		
		System.out.println(num1 + num2);
		System.out.println(num1 * num2);		// any math operations can be done easily
		System.out.println(num1 - num2);		
		System.out.println(num1 % num2);		
		
		
		
		
		
		

	}

}
