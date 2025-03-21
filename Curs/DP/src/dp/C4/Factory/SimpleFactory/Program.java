package dp.C4.Factory.SimpleFactory;

import dp.C4.Factory.SimpleFactory.clase.ETipPizza;
import dp.C4.Factory.SimpleFactory.clase.IPizza;
import dp.C4.Factory.SimpleFactory.clase.PizzaFactory;

public class Program {

	public static void main(String[] args) {
		PizzaFactory pizzaFactory = new PizzaFactory();
		IPizza pizza = null;
		try {
			pizza = pizzaFactory.crearePizza(ETipPizza.ROMA);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		pizza.afisareDescriere();
	}

}
