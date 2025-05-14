package DP.Comportamentale.ChainOfResponsability.Restaurant;

public class Program {

	public static void main(String[] args) {
		Ospatar ospatar = new Ospatar();
		Bucatar bucatar = new Bucatar();
		BucatarSef bucatarSef = new BucatarSef();
		
		ospatar.setNextHandler(bucatar);
		bucatar.setNextHandler(bucatarSef);
		
		Comanda comanda1 = new Comanda("Pizza", 2, 15);
		Comanda comanda2 = new Comanda("Bautura", 1, 3);
		Comanda comanda3 = new Comanda("Cafea", 1, 4);
		
		System.out.println("COMANDA 1");
		ospatar.procesareComanda(comanda1);
		
		System.out.println("\nCOMANDA 2");
		ospatar.procesareComanda(comanda2);
		
		System.out.println("\nCOMANDA 3");
		ospatar.procesareComanda(comanda3);
		
		//stil romanesc
		System.out.println("\nCOMANDA 3 ROMANESC");
		bucatar.procesareComanda(comanda3);

	}

}
