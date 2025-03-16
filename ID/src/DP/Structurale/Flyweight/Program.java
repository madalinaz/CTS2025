package DP.Structurale.Flyweight;

public class Program {

	public static void main(String[] args) {
		Bon bon = new Bon(10,410);
		MesajPrintareFactory.getMesajPrintare(ETipPrintare.TIP1).printareBon(bon);
		

		System.out.println(MesajPrintareFactory.getNrBonuriPrintate() + " bonuri printate");
		System.out.println(MesajPrintareFactory.getNrMatriteBonuri() + " matrite bonuri folosite");
	}

}
