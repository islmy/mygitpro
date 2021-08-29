package day14constructorsstatickeywordarrays;
public class Animal {
	
	public String name = "Joe";
	public int weight = 78;
	public static boolean isHerbivorous = false;
	public Animal() {
		super();
	}

	public Animal(String name) {

		this.name = name;
	}

	public Animal(String name, int weight) {
		super();
		this.name = name;
		this.weight = weight;
	}

	public static void main(String[] args) {
		
	}
	
	public static void eat() {
		if(isHerbivorous) {
			System.out.println("Eats plants");
		}else {
			System.out.println("Eats both plants and meat");
		}
	}

	}













