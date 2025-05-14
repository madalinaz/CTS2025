package DP.Structurale.Adapter;

import DP.Structurale.Adapter.RestaurantA.EvaluareClientFirmaA;
import DP.Structurale.Adapter.RestaurantA.IEvaluareClientFirmaA;
import DP.Structurale.Adapter.RestaurantB.Client;
import DP.Structurale.Adapter.RestaurantB.EvaluareClientFirmaB;
import DP.Structurale.Adapter.RestaurantB.IEvaluareClientFirmaB;
import DP.Structurale.Adapter.clase.AdaptorEvaluareClient_Clase;
import DP.Structurale.Adapter.obiecte.AdaptorEvaluareClient_Obiect;

public class Program {

	public static void main(String[] args) {
		//RESTAURANT A
		System.out.println(".....ce se intampla in restaurant A.....");
		IEvaluareClientFirmaA evA = new EvaluareClientFirmaA();
		evA.analizaClientFirmaA(1200);

		//RESTAURANT B
		System.out.println(".....ce se intampla in restaurant B.....");
		int[] costEvenimente = new int[]{1000,2000,20000,1000,5000};
		Client client = new Client("XYZ", 5, costEvenimente);
		IEvaluareClientFirmaB evB = new EvaluareClientFirmaB();
		evB.analizaClientFirmaB(client);


		//IN ACEST PUNCT RESTAURANT B A FOST CUMPARAT DE RESTAURANTUL A
		//TREBUIE ADAUGAT UN BRIDGE/CONEXIUNE/ADAPTER INTRE CELE 2 FRAMEWORK-URI

		//folosind adapter pe clase
		System.out.println(".....ce se intampla in restaurant B dupa ce a fost cumparat.....");
		int[] costEvenimente2 = new int[]{1000,2000,20000,1000,5000};
		Client client2 = new Client("XYZ", 5, costEvenimente2);
		IEvaluareClientFirmaB evB2 = new AdaptorEvaluareClient_Clase();
		evB2.analizaClientFirmaB(client2);

		//folosind adapter pe obiecte
		System.out.println(".....ce se intampla in restaurant B dupa ce a fost cumparat.....");
		int[] costEvenimente3 = new int[]{1000,2000,20000,1000,5000};
		Client client3 = new Client("XYZ", 5, costEvenimente3);
		IEvaluareClientFirmaB evB3 = new AdaptorEvaluareClient_Obiect(new EvaluareClientFirmaA());
		evB2.analizaClientFirmaB(client3);
	}

}
