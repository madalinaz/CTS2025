package dp.C11.observer.program;

import dp.C11.observer.clase.Client;
import dp.C11.observer.clase.Restaurant;

public class Program {

	public static void main(String[] args) {
		Client client1 = new Client("Florin");
		Client client2 = new Client("Florinel");
		Client client3 = new Client("Floricica");

		Restaurant restaurant = new Restaurant("Pizzeria ASE");
		restaurant.addObserver(client1);
		restaurant.addObserver(client2);
		restaurant.addObserver(client3);
		
		restaurant.addMeniu("Pizza vegetariana. 23 lei");
		restaurant.removeObserver(client1);
		restaurant.reducerePretMeniu("Pizza vegetariana", 20);
	}

}
