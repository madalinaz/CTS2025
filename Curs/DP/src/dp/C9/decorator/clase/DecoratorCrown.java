package dp.C9.decorator.clase;

public class DecoratorCrown extends ADecoratorPizza{

	public DecoratorCrown(APizza pizza) {
		super(pizza);
	}

	@Override
	public String getComponente() {
		return super.getComponente() + ", margine cu branza vegana";
	}

	@Override
	public int getPret() {
		// TODO Auto-generated method stub
		return super.getPret() + 10;
	}
	
	

}
