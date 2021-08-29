package day03wrapperclassconcatenatelogicaloperators;

public class Concatenation01 {
	
	/* 
	 concatenation : it joins to 2 or more Strings 
	 * */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s = "java ";
		String t = "is easy";
		System.out.println(s +" " + t);
		
		int a = 3; 
		int b = 4;
		String s1 = "java";
		System.out.println(a+ s1 ); // 3 Java
		System.out.println(s1 + a + b );
		System.out.println(s1 + (a+b));
		
		int d = 2;
		int e = 3;
		String f = "java";
		System.out.println((d*e)+((e-d)+ f) + (d-e));
		
	}

}
