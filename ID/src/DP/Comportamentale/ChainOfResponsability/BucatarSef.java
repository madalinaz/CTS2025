package DP.Comportamentale.ChainOfResponsability;

public class BucatarSef extends AHandler{

	@Override
	void procesareComanda(Comanda comanda) {
		System.out.println("Bucatarul sef a procesat comanda " 
				+ comanda.getProdus());
		
	}

}
