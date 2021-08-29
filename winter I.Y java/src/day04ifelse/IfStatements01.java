package day04ifelse;

import java.util.Scanner;

public class IfStatements01 {

	public static void main(String[] args) {
		// 

		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter an integer to check if its even or odd");
		int a = scan.nextInt();
		if(a%2 == 0)	{
			System.out.println("its even");
		}
		
		if(a%2 !=0) {
			System.out.println("its odd");
		}
		
		
		
		
		}

}  //well done
