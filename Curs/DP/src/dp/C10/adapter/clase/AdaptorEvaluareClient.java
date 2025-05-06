	package dp.C10.adapter.clase;

public class AdaptorEvaluareClient extends EvaluareClientFirmaA implements IEvaluareClientFirmaB{
	public int costTotalEvenimente(Client client){
		int costTotalEvenimente = 0;
		for(int i=0; i<client.getNrEvenimente(); i++)
			costTotalEvenimente += client.getCostEvenimente()[i];
		return costTotalEvenimente;
	}

	@Override
	public void analizaClientFirmaB(Client client) {
		System.out.println("Arata ca si cum Firma B face analiza....");
		this.analizaClientFirmaA(costTotalEvenimente(client));
		
	}
}
