package DP.Structurale.Flyweight;

public class Program {

	public static void main(String[] args) {
		Bon bon = new Bon(10,410);
		//din fabrica de mesaje de printare precum mesajul de tip TIP1 si pe baza lui printez respectivul bon
		for(int i=0;i<100;i++) {
			MesajPrintareFactory.getMesajPrintare(ETipPrintare.TIP1).printareBon(bon);
		}

		//SA NU APELATI CONSTRUCTORUL DIN CLASA MESAJ PRINTARE, CI CONSTRUITI OBJ DE TIP
		//FLYWEIGHT(MESAJ PRINTARE) DOAR FOLOSIND GETTER-UL DIN CLASA MESAJ PRINTARE FACTORY
		//IPrintare mesaj1 = new MesajPrintare(ETipPrintare.TIP1);//asa NU
		//mesaj1.printareBon(bon);


		System.out.println(MesajPrintareFactory.getNrBonuriPrintate() + " bonuri printate");
		System.out.println(MesajPrintareFactory.getNrMatriteBonuri() + " matrite bonuri folosite");
	}

}
