package DP.Comportamentale.State;

public class StareOcupat extends AStare{

	public StareOcupat(Bucatar bucatar) {
		super(bucatar);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void preiaComanda(String comanda) {
		System.out.println(this.bucatar.getNume() + " nu a preluat comanda " + comanda);
		System.out.println("Are prea multe comenzi in desfasurare");
	}

	@Override
	public void iaPauza() {
		System.out.println(this.bucatar.getNume() 
				+ " nu poate lua pauza caci este ocupat");
		
	}

}
