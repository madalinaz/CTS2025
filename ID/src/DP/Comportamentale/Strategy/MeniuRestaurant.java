package DP.Comportamentale.Strategy;

import java.util.ArrayList;

public class MeniuRestaurant {
	private ArrayList<OfertaMeniu> listaMeniuri = new ArrayList();
	private IProcesabil strategieAlegere;
	
	public void addOfertaMeniu(OfertaMeniu ofertaMeniu){
		this.listaMeniuri.add(ofertaMeniu);
	}
	
	public void setStrategieAlegere(IProcesabil strategieAlegere){
		this.strategieAlegere = strategieAlegere;
	}
	
	public OfertaMeniu alegereOferta(){
		if(strategieAlegere != null){
			return strategieAlegere.alegereMeniu(listaMeniuri);
		}
		else
			throw new UnsupportedOperationException();
	}
}
