package DP.Structurale.Composite.ex1;

public class Produs extends ANod{
	
	String denumire;
	int pret;
	
	public Produs(String denumire, int pret){
		this.denumire = denumire;
		this.pret = pret;
	}
	@Override
	public String getDenumire() {
		return this.denumire;
	}

	@Override
	public int getPret() {
		return this.pret;
	}

}
