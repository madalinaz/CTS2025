package DP.Creationale.Builder.Magazin;

import java.util.ArrayList;
import java.util.List;



public class BuilderMagazin implements IBuilder{
	private IPodea podea;
	private List<IDecoratiuni> listaDecoratiuni = null;
	private float suprafata;
	private int nrIntrari;
	private String denumire;
	
	//contine zona obligatorie a obj complex creat
	public BuilderMagazin(float suprafata, int nrIntrari, String denumire) {
		super();
		this.suprafata = suprafata;
		this.nrIntrari = nrIntrari;
		this.denumire = denumire;
		this.listaDecoratiuni = new ArrayList<>();
	}
	
	//setteri pentru zona optionala
	public BuilderMagazin setPodea(IPodea p) {
		this.podea=p;
		return this;
	}
	
	public BuilderMagazin addDecoratiune(IDecoratiuni d) {
		if(d!=null) {
			this.listaDecoratiuni.add(d);
		}
		return this;
	}

	@Override
	public Magazin build() {
		Magazin m =null;
		if(this.suprafata/100>this.nrIntrari)
			return null;
		if(this.podea==null) {
			this.podea = new PodeaCiment();
		}
		if(this.podea.getDuritate()<2) {
			for(IDecoratiuni d:this.listaDecoratiuni) {
				if(d.getMaterial()==ETipMaterial.STICLA)
					return null;
			}
		}
		m = new Magazin(podea, suprafata, nrIntrari, denumire);
		for(IDecoratiuni d:this.listaDecoratiuni) {
			m.addDecoratiune(d);
		}
		return m;
	}

}
