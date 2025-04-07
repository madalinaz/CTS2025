package dp.C7.composite.clase;

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
