package week02;

import java.util.Scanner;

public class P_Q04_Switch_Letters {

	public static void main(String[] args) {
		/*
        Ask user to enter a letter.
        If user enters a letter that in first four letters, 
        Your program will print "(This letter) is in the first four letters" 
        It will also print if this letter is vowel or consonant
        Use switch.
        
        Example :
        INPUT: A
        OUTPUT: "A is in first letters"
                "A is vowel"
         
        */



			Scanner scan = new Scanner(System.in);
			System.out.println("enter a letter");
			String str1 = scan.next();
			
			switch(str1) {
			case "a":
				System.out.println("this letter");
				break;
			case "b" :
				System.out.println("this letter");
				break;
			case "c" :
				System.out.println("this letter");
				break;
			case "d" :
				System.out.println("this letter");
				break;
				default :
					System.out.println("invalid letter");
					
	}





		
		
		
		
		
		
		

	}

}
