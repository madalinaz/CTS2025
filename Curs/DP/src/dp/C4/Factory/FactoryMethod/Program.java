package dp.C4.Factory.FactoryMethod;

import dp.C4.Factory.FactoryMethod.clase.FactoryPizzaRoma;
import dp.C4.Factory.FactoryMethod.clase.IFactory;
import dp.C4.Factory.FactoryMethod.clase.IPizza;

public class Program {

	public static void main(String[] args) {
		IFactory factory = null;
		factory = new FactoryPizzaRoma();
		
		IPizza pizza=null;
		pizza = factory.crearePizza();
		pizza.afisareDescriere();
	}

}
