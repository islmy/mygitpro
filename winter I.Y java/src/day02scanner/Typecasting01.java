package day02scanner;

public class Typecasting01 {

	public static void main(String[] args) {
		
		/*
		 byte<short<int<long<float<double 
		 */
		
		//Auto Widening : small data type is converted to large auto by java
		//ex:
				byte b1 = 112;
				int i1 = b1;		
		System.out.println(b1);
		System.out.println(i1);
		
		
		//Explicit Narrowing : From large to small data type, java does not convert autom. You should tye explicitly
		//ex:
				int i2 = 120;
				short s1 = (short)i2; // error but we can took the risk by adding (short)
		System.out.println(i2);
		System.out.println(s1);
		 
		
		int i3 = 5;
		int i4 = 2; 
		System.out.println(i3 / i4); // result is 2 bcs: data type is integer so java ignores decimal part
		//but 
		int i5 = 5;
		double d1 = 2;
		System.out.println(i5 / d1);// result will be 2,5 bcs; java takes the larger data type
		
		//well done
		
		
		
	}
	

}
