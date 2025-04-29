package dp.C9.decorator.clase;

public abstract class ADecoratorPizza extends APizza{
	protected APizza pizza;

	public ADecoratorPizza(APizza pizza) {
		super();
		this.pizza = pizza;
	}


	@Override
	public String getComponente() {
		return pizza.getComponente();
	}

	@Override
	public int getPret() {
		return pizza.getPret();
	}
	
	
}
