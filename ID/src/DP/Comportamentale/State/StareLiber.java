package DP.Comportamentale.State;

public class StareLiber extends AStare{

	public StareLiber(Bucatar bucatar) {
		super(bucatar);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void preiaComanda(String comanda) {
		System.out.println(this.bucatar.getNume() 
				+ " a preluat comanda " + comanda);
		bucatar.setNrComenziInEfectuare
		(bucatar.getNrComenziInEfectuare()+1);
	}

	@Override
	public void iaPauza() {
		System.out.println(this.bucatar.getNume() + " poate lua pauza caci este liber");
	}

}
