package dp.C12.state.clase;

public class Bucatar {
	private String  nume;
	private int nrComenziInEfectuare;
	AStare stare;
	
	public Bucatar(String nume, int nrComenziInEfectuare) {
		super();
		this.nume = nume;
		this.nrComenziInEfectuare = nrComenziInEfectuare;
		this.stare = new StareLiber(this);
	}
	
	public void preparaComanda(String comanda) {
		this.stare.preiaComanda(comanda);
	}
	
	public void iaPauza() {
		this.stare.iaPauza();
	}

	public String getNume() {
		return nume;
	}

	public int getNrComenziInEfectuare() {
		return nrComenziInEfectuare;
	}

	public void setNrComenziInEfectuare(int nrComenziInEfectuare) {
		this.nrComenziInEfectuare = nrComenziInEfectuare;
		if(this.nrComenziInEfectuare>=5)
			this.stare= new StareOcupat(this);
		else
			this.stare = new StareLiber(this);
	}
	
	
}
