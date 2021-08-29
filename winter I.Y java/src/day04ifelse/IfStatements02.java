package day04ifelse;

import java.util.Scanner;

public class IfStatements02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
        Type java code by using if statement
        When you enter the initial of the day of a week, output should be all possible names of  the days
        For example; if the initial is 'S' output shoulld be "Saturday and Sunday"
        Get the initial from user
        M,T,W,T,F,S,S
       */
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Day of the Week");
		char init = scan.next().toUpperCase().charAt(0);
		
		if(init=='M') {
			System.out.println("Monday");
		}
		if(init=='T') {
			System.out.println("Tuesday or Thursday");
		}
		if(init!= 'M' && init!= 'T' && init!= 'W') {
			System.out.println("please enter a valid initial");
		}
	}

}
