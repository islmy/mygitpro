package week01dt;

import java.util.Scanner;

public class Q08_Bonus {

	public static void main(String[] args) {
		/*
        A company decided to give bonus of 5% to employee if his/her year of 
        service is more than 5 years.
        Ask user for their salary and year of service and print the net bonus amount.
   EXAMPLE:
    INPUT      :  4 year service
                Salary :  4000 
    OUTPUT :  0
        */
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter your salary");
		int salary = scan.nextInt();
		System.out.println("How long have been working");
		int year = scan.nextInt();
		
		if(year>5) {
			System.out.println("your bonus is "+ salary*5/100 + "$");
		}else {
			System.out.println("you got nothing sucker");
		}
		scan.close();
		
		
		
		
		

	}

}
