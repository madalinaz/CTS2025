package dp.C12.command.clase;

public class ComandaPizza implements IComanda {
	private String tipPizza;
	private String tipBlat;
	private Bucatar bucatar;

	public ComandaPizza(String tipPizza, String tipBlat, Bucatar bucatar) {
		super();
		this.tipPizza = tipPizza;
		this.tipBlat = tipBlat;
		this.bucatar = bucatar;
	}

	@Override
	public void prelucreaza() {
		this.bucatar.preparaPizza(tipPizza, tipBlat);
	}

}
