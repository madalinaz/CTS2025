package DP.Structurale.Flyweight;

//zona ne-partajabila, zona unshared, zona extrinseca
public class Bon{
	//Bon este starea temporara din diagrama GoF
	private int nrMasa;
	private float costTotal;
	
	public Bon(int nrMasa, float costTotal) {
		super();
		this.nrMasa = nrMasa;
		this.costTotal = costTotal;
	}

	public int getNrMasa() {
		return nrMasa;
	}

	public float getCostTotal() {
		return costTotal;
	}

	
}
