package hamsterofdark.decorator;

import hamsterofdark.components.Pizza;

public class PizzaDecorator extends Pizza {
	

	private Pizza pizza;
	public PizzaDecorator(Pizza pizza) {
		super();
		this.pizza = pizza;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.pizza.getDescription();
	}

	@Override
	public int calculateCost() {
		// TODO Auto-generated method stub
		return this.pizza.calculateCost();
	}
	
	

}
