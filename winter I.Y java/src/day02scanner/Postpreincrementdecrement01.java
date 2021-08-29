package day02scanner;

public class Postpreincrementdecrement01 {

	public static void main(String[] args) {
		//  post increment means , increase at the end of the statement
		 
		int x = 12;
		System.out.println(x++);// 12
		System.out.println(x); // 13
		
		// pre increment: increases in advance...
		System.out.println(++x);// 14
		System.out.println(x);  // 14
		
		
		// post decrement : 
		System.out.println(x--); // 14
		System.out.println(x);   // 13
		
		// pre decrement : same logic
		System.out.println(--x); // 12
		
		// if there is an assignment operator java calculates the right part first 
		//ex: x = x + 1 =
		
		
		//well done

	}

}
