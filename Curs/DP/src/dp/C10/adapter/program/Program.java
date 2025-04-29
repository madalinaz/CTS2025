package dp.C10.adapter.program;


import dp.C10.adapter.clase.AdaptorEvaluareClient;
import dp.C10.adapter.clase.Client;
import dp.C10.adapter.clase.IEvaluareClientFirmaB;

public class Program {

	public static void main(String[] args) {
		int[] costEvenimente = new int[]{1000,2000,20000,1000,5000};
		Client client = new Client("XYZ", 5, costEvenimente);
		IEvaluareClientFirmaB evaluareClientB = new AdaptorEvaluareClient();
		evaluareClientB.analizaClientFirmaB(client);

	}

}
