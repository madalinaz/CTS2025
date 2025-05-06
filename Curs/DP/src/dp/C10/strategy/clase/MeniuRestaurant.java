package dp.C10.strategy.clase;

import java.util.ArrayList;

//sau clasa "Ospatar" din povestea cerintei initiale
public class MeniuRestaurant {
	private ArrayList<OfertaMeniu> listaMeniuri = new ArrayList();
	private IProcesabil strategieAlegere;
	
	public void addOfertaMeniu(OfertaMeniu ofertaMeniu){
		this.listaMeniuri.add(ofertaMeniu);
	}

	//meth care seteaza "din exterior" strategia aleasa
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
