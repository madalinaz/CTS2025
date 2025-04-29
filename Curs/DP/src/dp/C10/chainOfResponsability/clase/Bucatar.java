package dp.C10.chainOfResponsability.clase;

public class Bucatar extends AHandler{

	@Override
	public void procesareComanda(Comanda comanda) {
		System.out.println("Bucatarul a procesat comanda " 
				+ comanda.getProdus());
	}

}
