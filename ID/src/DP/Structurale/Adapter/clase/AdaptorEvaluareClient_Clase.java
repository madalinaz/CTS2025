package DP.Structurale.Adapter.clase;

import DP.Structurale.Adapter.RestaurantA.EvaluareClientFirmaA;
import DP.Structurale.Adapter.RestaurantB.Client;
import DP.Structurale.Adapter.RestaurantB.IEvaluareClientFirmaB;

//CE ESTE EXTENDS INSEAMNA CA SE COMPORTA CA CE EXTINDE
//CAND ZIC IMPLEMENTS, INSEAMNA CA ARATA PRECUM CEEA CE IMPLEMENTS
public class AdaptorEvaluareClient_Clase extends EvaluareClientFirmaA implements IEvaluareClientFirmaB {
	private int costTotalEvenimente(Client client){
		System.out.println("Transformare input din client in float(total)");
		int costTotalEvenimente = 0;
		for(int i=0; i<client.getNrEvenimente(); i++)
			costTotalEvenimente += client.getCostEvenimente()[i];
		return costTotalEvenimente;
	}

	@Override
	public void analizaClientFirmaB(Client client) {
		System.out.println("Pare ca ar face B-ul analiza clientului dar...");
		//deleg responsabilitatea firmei A sa se ocupe de evaluarea clientului
		//firma A avea nevoie de un total, nu de un client ce are la dispozitie firma B
		//pentru asta, s-a implementat o functie ajutatoare de transformare (costTotalEvenimente)
		this.analizaClientFirmaA(costTotalEvenimente(client));
	}
}
