package DP.Structurale.Adapter;

public class Program {

	public static void main(String[] args) {
		int[] costEvenimente = new int[]{1000,2000,20000,1000,5000};
		Client client = new Client("XYZ", 5, costEvenimente);
		
		
		IEvaluareClientFirmaB evaluareClientB = new AdaptorEvaluareClient();
		evaluareClientB.analizaClientFirmaB(client);

	}

}
