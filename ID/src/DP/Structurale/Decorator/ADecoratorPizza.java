package DP.Structurale.Decorator;

//greseala de implementare daca NU aveti si clasa abstracta decorator
public abstract class ADecoratorPizza extends APizza{
	protected APizza pizza;//obj pe care il decoreaza

	public ADecoratorPizza(APizza pizza) {
		super();
		this.pizza = pizza;
	}

	//in decoratorul abstract, meth abstracte se comporta identic precum obj pe care il decoreaza
	@Override
	String getComponente() {
		return pizza.getComponente();
	}

	@Override
	int getPret() {
		return pizza.getPret();
	}
	
	
}
