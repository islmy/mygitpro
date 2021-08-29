package day24_Inheritence_Overriding;

public class Honda extends Car {

	
	public void factory() {
		System.out.println("factory is in Japan");
	}

	@Override //==> this is called annotation, you can remove it but its better to stay bcs java chechs the mistakes... 
	public void move() {
		System.out.println("Honda reachs 6 sc. to 100");
		super.move();
	}

	@Override
	public void engine() {
		System.out.println("Honda has an Echo engine in every model");
		super.engine();
	}

	@Override
	public String speak() {	
		return "Honda can speak japan";
	}
	
	
	// private methods cannot be overridden..bcs, cannot be seen in other classes
	
	// the creator of java, had swear on God, to use every single  word in English Language 
	
}
