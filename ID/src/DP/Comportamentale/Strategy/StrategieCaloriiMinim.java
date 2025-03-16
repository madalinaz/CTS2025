package DP.Comportamentale.Strategy;

import java.util.ArrayList;


public class StrategieCaloriiMinim implements IProcesabil{
	@Override
	public OfertaMeniu alegereMeniu(ArrayList<OfertaMeniu> listaMeniuri) {
		OfertaMeniu ofertaMeniuCaloriiMinime = listaMeniuri.get(0);
		for(OfertaMeniu oferta: listaMeniuri){
			if(oferta.getNrCalorii() < ofertaMeniuCaloriiMinime.getNrCalorii())
				ofertaMeniuCaloriiMinime = oferta;
		}
		
		return ofertaMeniuCaloriiMinime;
	}

}
