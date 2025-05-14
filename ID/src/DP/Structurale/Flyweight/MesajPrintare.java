package DP.Structurale.Flyweight;

//clasa concrete flyweight din diagrama
public class MesajPrintare implements IPrintare{
	private ETipPrintare tipPrintare;
	private String mesajPrintare;
	
	public MesajPrintare(ETipPrintare tipPrintare) {
		this.tipPrintare=tipPrintare;
		System.out.println("S-a creat obj cu printare: " + this.tipPrintare);
	}

	public ETipPrintare getTipPrintare() {
		return tipPrintare;
	}

	//meth aceasta reuneste cele 2 zone ale obiectului (zona shared de zona unshared)
	@Override
	public void printareBon(Bon bon) {
		System.out.println("Pentru printare s-a folosit formatul: "
				+ this.getTipPrintare());
					System.out.println("Se printeaza bonul de la masa "+ bon.getNrMasa());
	}
	
	
}
