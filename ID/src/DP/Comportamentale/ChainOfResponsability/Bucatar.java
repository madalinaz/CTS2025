package DP.Comportamentale.ChainOfResponsability;

public class Bucatar extends AHandler{
	@Override
	void procesareComanda(Comanda comanda) {
		if(comanda.getGrad()>5 && comanda.getGrad()<=100) {
		System.out.println("Bucatarul a procesat comanda " 
				+ comanda.getProdus());
		}
		else if(comanda.getGrad()<=5) {
			System.out.println("Nu trebuia sa ajunga aici!");
		}
		else if(this.getNextHandler()!=null) {
			System.out.println("Bucatarul nu poate procesa comanda");
			this.getNextHandler().procesareComanda(comanda);
		}
		else {
			System.out.println("Inca nu exista un responsabil pentru asta");
		}
	}
}
