package DP.Structurale.Decorator;

public class DecoratorCrown extends ADecoratorPizza{

	public DecoratorCrown(APizza pizza) {
		super(pizza);
	}

	@Override
	String getComponente() {
		return super.getComponente() + ", margine cu branza vegana";
	}

	@Override
	int getPret() {
		// TODO Auto-generated method stub
		return super.getPret() + 10;
	}
	
	

}
