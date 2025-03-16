package DP.Structurale.Composite.ex1;


public abstract class ANod {
	//nod frunza
	public abstract String getDenumire();
	public abstract int getPret();
	
	//pentru toate nodurile
	public String getInfo(){
		return this.getDenumire() + " " + this.getPret();
	}
	
	//metode specifice nodurilor structura
	public void adaugaNod(ANod elemStructura){
		throw new UnsupportedOperationException();
	}
	
	public void eliminaNod(ANod elemStructura){
		throw new UnsupportedOperationException();
	}
	
	public ANod getNod (int i){
		throw new UnsupportedOperationException();
	}
}
