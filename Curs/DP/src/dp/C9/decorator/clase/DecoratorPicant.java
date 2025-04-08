package dp.C9.decorator.clase;

public class DecoratorPicant extends ADecoratorPizza{
	private int nivelIuteala;
	
	public DecoratorPicant(APizza pizza, int nivelIuteala) {
		super(pizza);
		this.nivelIuteala=nivelIuteala;
	}

	@Override
	public String getComponente() {
		return super.getComponente()+", iuteala " + this.nivelIuteala;
	}

	@Override
	public int getPret() {
		return super.getPret()+7;
	}

	
}
