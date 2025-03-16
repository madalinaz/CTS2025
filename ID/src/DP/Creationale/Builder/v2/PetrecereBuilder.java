package DP.Creationale.Builder.v2;

public class PetrecereBuilder implements IBuilder{
	private int nrPersoane;
	private boolean areBaloane;
	private boolean areTort;
	private boolean areArtificii;
	
	public PetrecereBuilder() {
		this.nrPersoane=0;
		this.areArtificii=false;
		this.areTort=false;
		this.areBaloane=false;
	}

	@Override
	public Petrecere build() {
		//aici se adauga restrictii de intersectie intre componente
		return new Petrecere(nrPersoane, areBaloane, areTort, areArtificii);
	}
	
	public PetrecereBuilder setNrPersoane(int nrPersoane) {
		this.nrPersoane=nrPersoane;
		return this;
	}
	
	public PetrecereBuilder setAreBaloane(boolean areBaloane) {
		this.areBaloane=areBaloane;
		return this;
	}
	
	public PetrecereBuilder setAreTort(boolean areTort) {
		this.areTort=areTort;
		return this;
	}
	
	public PetrecereBuilder setAreArtificii(boolean areArtificii) {
		this.areArtificii=areArtificii;
		return this;
	}
}
