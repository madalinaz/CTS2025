package DP.Structurale.Decorator;

public abstract class ADecoratorPizza extends APizza{
	protected APizza pizza;

	public ADecoratorPizza(APizza pizza) {
		super();
		this.pizza = pizza;
	}

	@Override
	String getComponente() {
		return pizza.getComponente();
	}

	@Override
	int getPret() {
		return pizza.getPret();
	}
	
	
}
