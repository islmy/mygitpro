package day04ifelse;

import java.util.Scanner;

public class IfStatements03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		/*
	     Type java code by using if statement
	     When you enter the name of the day a week, 
	     output will be "Weekday" or "Weekend day" according to the name of the day
	     Get the name of the name from user
	     */

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the name of the day");
		String dayName = scan.next().toLowerCase();
		
		
		if (dayName.equals("monday") || dayName.equals("tuesday") || dayName.equals("wednesday") || dayName.equals("thursday") || dayName.equals("friday")) { //to compare string do not use == sign. its for primitives.					
			System.out.println("Weekdays"); 
			}
		
		if(dayName.equals("saturday") || dayName.equals("sunday")) { // to compare string do not use == instead use: equal() method
			System.out.println("Weekend");
		}
		
		scan.close(); // console chekh again
		
		
		
		
	}

}
