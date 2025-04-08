package dp.C9.flyweight.program;

import dp.C9.flyweight.clase.Bon;
import dp.C9.flyweight.clase.ETipPrintare;
import dp.C9.flyweight.clase.MesajPrintareFactory;
import java.util.Random;

public class Program {

	public static void main(String[] args) {
		ETipPrintare[] tipuri = ETipPrintare.values();
		Random random = new Random();

		for (int i = 0; i < 25; i++) {
			Bon bon = new Bon(10 + i, 410 + i);

			ETipPrintare tip = tipuri[random.nextInt(tipuri.length)];

			MesajPrintareFactory.getMesajPrintare(tip).printareBon(bon);
		}

		System.out.println(MesajPrintareFactory.getNrBonuriPrintate() + " bonuri printate");
		System.out.println(MesajPrintareFactory.getNrMatriteBonuri() + " matrite bonuri folosite");
	}

}
