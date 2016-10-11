package hamsterofdark;

import hamsterofdark.concreteComponents.LargePizza;

public class Main {

	public static void main(String[] args) {
		LargePizza lP = new LargePizza();
		System.out.println(lP.getDescription());
		System.out.println(lP.calculateCost());
		

	}

}
