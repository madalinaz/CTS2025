package DP.Creationale.Builder.Magazin;

import java.util.ArrayList;

public class Magazin extends AMagazin{

	Magazin(IPodea podea, float suprafata, int nrIntrari, String denumire) {
		super(podea, suprafata, nrIntrari, denumire);
		// TODO Auto-generated constructor stub
	}
	
	void addDecoratiune(IDecoratiuni decoratiune) {
		if(this.listaDecoratiuni==null) {
			this.listaDecoratiuni= new ArrayList<>();
		}
		if(decoratiune!=null) {
			this.listaDecoratiuni.add(decoratiune);
		}
	}

	@Override
	public String toString() {
		return "Magazin [podea=" + podea + ", listaDecoratiuni=" + listaDecoratiuni + ", suprafata=" + suprafata
				+ ", nrIntrari=" + nrIntrari + ", denumire=" + denumire + "]";
	}
	
	
}
