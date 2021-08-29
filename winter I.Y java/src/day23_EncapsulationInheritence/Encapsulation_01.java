package day23_EncapsulationInheritence;

public class Encapsulation_01 {

	// to hide data
	// we make accessmodifier invisible
	
	private String name = "Ali Can";
	
	private int age = 21;
	
	private boolean retired = false;
	
	private char initial = 'A'; // in order to just to make it readibe, do dot create setter, create getter... see line 48
	
	private String adress = "XStrase"; // to make it updateable we  need setter  line 23
	
	
	
	
	
	
	public void setAdress(String adress) {
		this.adress = adress;
	}



	public int getAge() {	// bu methodla "getter" enkapsulate ettigimiz bir degeri okunur hae getiriyoruz
		
		return age;
	}
	
	
	
	public void setAge(int age){		// "setter" method void olmali, setter is to updtade, getter is to make it readible
		this.age = age;					// this. means the value in that class..									
	}			
	
	
	public boolean isRetired() {	// source- generate.... eclipse crated and instead of get, its is
									// its called naming convention...
		return retired;
	}



	public void setRetired(boolean retired) {
		this.retired = retired;
	}



	public char getInitial() {
		return initial;
	}     



	
	
	
	/*
	 1- If you want "not to update" any value, DO NOT create any 'setter' method
	    If you dont create any setter method it means no value is open to update and the class is "immutable"
	  == SO; IMMUTABLE class means: all variables are private and no setter method is used...==   
	 */
	



	//public void setRetired() ==>> bunu biz yaptik "get" ile, hos olmaz... "is" gerekir. source... 
	//public getRetired 
	
	
	
	
	
}
