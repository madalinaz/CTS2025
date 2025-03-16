package DP.Structurale.Adapter;

public class EvaluareClientFirmaA implements IEvaluareClientFirmaA{
	@Override
	public void analizaClientFirmaA(int costTotalEvenimente) {
		System.out.println("Metoda analiza client Firma A");
		double procentDiscount = 0;
		
		if(costTotalEvenimente > 1000)
			procentDiscount = 0.10;
		else
			if(costTotalEvenimente >500)
				procentDiscount = 0.05;
			else procentDiscount = 0.00;
		System.out.println("S-a oferit un discount de "+ 
			procentDiscount);
	}
}
