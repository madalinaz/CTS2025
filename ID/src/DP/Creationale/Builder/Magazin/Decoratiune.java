package DP.Creationale.Builder.Magazin;

public class Decoratiune implements IDecoratiuni{
	private ETipMaterial tipMaterial;
	private String denumire;
	
	public Decoratiune(ETipMaterial tipMaterial, String denumire) {
		super();
		this.tipMaterial = tipMaterial;
		this.denumire = denumire;
	}

	@Override
	public ETipMaterial getMaterial() {
		return this.tipMaterial;
	}

	@Override
	public String toString() {
		return "Decoratiune [tipMaterial=" + tipMaterial + ", denumire=" + denumire + "]";
	}

	
}
