package DP.Structurale.Decorator;

//clasa decorator concret din diagrama
public class DecoratorCrown extends ADecoratorPizza{

	public DecoratorCrown(APizza pizza) {
		super(pizza);
	}

	//se cere explicit override pe meth din clasa abstracta de baza pentru a le suplimenta in
	//functie de logica decoratorului concret
	@Override
	String getComponente() {
		return super.getComponente() + ", margine cu branza";
	}

	@Override
	int getPret() {
		// TODO Auto-generated method stub
		return super.getPret() + 10;
	}

}
