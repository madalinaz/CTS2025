package DP.Comportamentale.Strategy;

import java.util.ArrayList;



public class StrategieCarbohidratiMinim implements IProcesabil{
	@Override
	public OfertaMeniu alegereMeniu(ArrayList<OfertaMeniu> listaMeniuri) {
		OfertaMeniu ofertaMeniuCarbohidratiMinim = listaMeniuri.get(0);
		for(OfertaMeniu oferta: listaMeniuri){
			if(oferta.getNrCarbohidrati() < ofertaMeniuCarbohidratiMinim.getNrCarbohidrati())
				ofertaMeniuCarbohidratiMinim = oferta;
		}
		
		return ofertaMeniuCarbohidratiMinim;
	}
}
