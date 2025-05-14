package DP.Structurale.Adapter.obiecte;

import DP.Structurale.Adapter.RestaurantA.IEvaluareClientFirmaA;
import DP.Structurale.Adapter.RestaurantB.Client;
import DP.Structurale.Adapter.RestaurantB.IEvaluareClientFirmaB;

public class AdaptorEvaluareClient_Obiect implements IEvaluareClientFirmaB {
    private IEvaluareClientFirmaA evaluareClientFirmaA;

    public AdaptorEvaluareClient_Obiect(IEvaluareClientFirmaA evaluareClientFirmaA) {
        this.evaluareClientFirmaA = evaluareClientFirmaA;
    }

    //meth folosita pentru pregatire input pentru evaluare client firma A
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
        this.evaluareClientFirmaA.analizaClientFirmaA(costTotalEvenimente(client));
    }
}
