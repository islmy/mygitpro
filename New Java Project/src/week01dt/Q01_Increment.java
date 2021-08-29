package week01dt;

public class Q01_Increment {

	public static void main(String[] args) {
	
		
		
		
		int a= 3; 
		double d = 4.5;
		
		d +=a ; // d= d+a = 7.5
		
		a += d; // a= a+d = 10.5
		
		d -= a; // d= d-a = 7.5 -10 = -2.5
		
		a -= d; // a= a-d = 10-2.5 = 12.5
		
		// now a= 12  b = 2.5   bcs int does not have kesirli sayi
		
		System.out.println("d = " + ++d);
		System.out.println("a = " + a--);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
