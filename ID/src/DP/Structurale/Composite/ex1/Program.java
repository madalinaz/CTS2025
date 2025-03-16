package DP.Structurale.Composite.ex1;


public class Program {

	public static void main(String[] args) {
		//definire nivel 0 arborescenta
				Structura structuraMeniu = new Structura("Meniu restaurant");
				
				Meniu meniu = new Meniu(structuraMeniu, "Pizzeria ASE");
				
				//definire nivel 1 arborescenta
				ANod structuraBauturi = new Structura("Bauturi");
				ANod structuraMancare = new Structura("Mancare");
				structuraMeniu.adaugaNod(structuraBauturi);
				structuraMeniu.adaugaNod(structuraMancare);
				
				//definire noduri nivel 2 arborescenta (Bauturi)
				structuraBauturi.adaugaNod(new Produs("CocaCola", 10));
				structuraBauturi.adaugaNod(new Produs("Pepsi", 9));
				
				//definire noduri nivel 2 arborescenta (Mancare)
				Structura structuraMancarePizza = new Structura("Pizza");
				Structura structuraMancarePaste = new Structura("Paste");
				structuraMancare.adaugaNod(structuraMancarePizza);
				structuraMancare.adaugaNod(structuraMancarePaste);
				
				//definire noduri nivel 3 arborescenta (Mancare - Pizza)
				structuraMancarePizza.adaugaNod(new Produs("Pizza Margherita", 25));
				structuraMancarePizza.adaugaNod(new Produs("Pizza Capriciosa", 29));
			
				//definire noduri nivel 3 arborescenta (Mancare - Paste)
				structuraMancarePaste.adaugaNod(new Produs("Paste carbonara", 27));
				structuraMancarePaste.adaugaNod(new Produs("Paste branza", 32));
			
				//afisare structura Meniu
				System.out.println(meniu.getNumeRestaurant());
				System.out.println(structuraMeniu.getInfo());

	}

}
