package DP.Creationale.Builder.v1;

public class Petrecere {
	private int nrPersoane;
	private boolean areBaloane;
	private boolean areTort;
	private boolean areArtificii;
	
	Petrecere(int nrPersoane, boolean areBaloane, boolean areTort, boolean areArtificii) {
		super();
		this.nrPersoane = nrPersoane;
		this.areBaloane = areBaloane;
		this.areTort = areTort;
		this.areArtificii = areArtificii;
	}

	public int getNrPersoane() {
		return nrPersoane;
	}

	void setNrPersoane(int nrPersoane) {
		this.nrPersoane = nrPersoane;
	}

	public boolean isAreBaloane() {
		return areBaloane;
	}

	void setAreBaloane(boolean areBaloane) {
		this.areBaloane = areBaloane;
	}

	public boolean isAreTort() {
		return areTort;
	}

	void setAreTort(boolean areTort) {
		this.areTort = areTort;
	}

	public boolean isAreArtificii() {
		return areArtificii;
	}

	void setAreArtificii(boolean areArtificii) {
		this.areArtificii = areArtificii;
	}

	@Override
	public String toString() {
		return "Petrecere [nrPersoane=" + nrPersoane + ", areBaloane=" + areBaloane + ", areTort=" + areTort
				+ ", areArtificii=" + areArtificii + "]";
	}
}
