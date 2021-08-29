package Week03dt;

public class P_Q05_loops_Perfect_numbers {

	public static void main(String[] args) {
		/*
		 Ask user to enter a number and check if this number perfect or not 
		 hint : perfect numbers are if you add the factors except itself, you get the number
		 ex: 6, 27...
		 */
	}

	
	
	    public static String perfect(int a) {
	        int sum = 0;
	        for(int i=1; i<a; i++) {
	            if(a%i==0) {
	                sum=sum+i;
	            }   
	        }
	        if(sum==a) {
	            return "perfect number";
	        }else {
	            return "not perfect";
	        }
	    }

	
	
}
