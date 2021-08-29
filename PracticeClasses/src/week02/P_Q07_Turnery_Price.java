package week02;

import java.util.Scanner;

import jdk.internal.misc.FileSystemOption;

public class P_Q07_Turnery_Price {

	public static void main(String[] args) {
		/*
        Write a code using ternary:
Create int variable : price
Create string variable : decision
If the price = $10 or less Print “it's cheap”
If price is 10-$20 print “it's ok” 
Otherwise “it's expensive”.
ORNEK:
   INPUT      : price= 12                
   OUTPUT  : it's ok
   INPUT      : price= 10                
   OUTPUT  : it's cheap
   INPUT      : price= 23                
   OUTPUT  : it's expensive
        */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Price : ");
		int Price = scan.nextInt();
		
		Price = 10 ? "its cheap" : Price < 20 ? "its ok" : "expensive";
		
		// do it later

	}

}
