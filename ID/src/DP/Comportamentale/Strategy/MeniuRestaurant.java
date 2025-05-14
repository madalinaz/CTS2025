package DP.Comportamentale.Strategy;

import java.util.ArrayList;

//clasa Context/Obiect din diagramele GoF
public class MeniuRestaurant {
	private ArrayList<OfertaMeniu> listaMeniuri = new ArrayList();
	private IProcesabil strategieAlegere; //referinta strategiei curente
	
	public void addOfertaMeniu(OfertaMeniu ofertaMeniu){
		this.listaMeniuri.add(ofertaMeniu);
	}

	//meth care permite schimbarea strategiei curente
	public void setStrategieAlegere(IProcesabil strategieAlegere){
		this.strategieAlegere = strategieAlegere;
	}

	//meth care, pe baza strategiei curente, "rezolva cerinte principala, adica alegerea unui meniu"
	public OfertaMeniu alegereOferta(){
		if(strategieAlegere != null){
			return strategieAlegere.alegereMeniu(listaMeniuri);
		}
		else
			throw new UnsupportedOperationException();
	}
}
