package week01dt;

import java.util.Scanner;

public class Q09_Gender {

	public static void main(String[] args) {
		
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter your age");
		int age = scan.nextInt();
		
		
		System.out.println("now enter your gender");
		char gender = scan.next().charAt(0);
		
		
		
        if(age>=18) {
        	if(gender == 'M') {
        		System.out.println("Man");
        
        	
        	}else {
        		System.out.println("Woman");
        		
        		
        	}
        }
        
        
			
			
			
			
			
		
		
		
		
		
		
		
		

	}

}
