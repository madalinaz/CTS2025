package DP.Structurale.Composite.ex2;

public class Colet extends ANode {

	private float greutate;
	private boolean fragil;
	
	@Override
	public float getGreutate() {		
		return this.greutate;
	}

	@Override
	public boolean esteFragil() {
		return this.fragil;
	}

	public Colet(float greutate, boolean fragil) {
		super();
		this.greutate = greutate;
		this.fragil = fragil;
	}

	@Override
	public void adauga(ANode copil) {
		throw new UnsupportedOperationException("Nu se poate adauga un colet decat intrun container");
		
	}

	@Override
	public void sterge(ANode copil) {
		throw new UnsupportedOperationException("Nu se poate sterge un colet decat dintrun container");
		
	}

	@Override
	public ANode getCopil(int index) {
		throw new UnsupportedOperationException("Nu se poate obtine un colet decat dintrun container");	
	}

}
