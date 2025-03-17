package dp.C4.Factory.FactoryMethod;

public class Program {

	public static void main(String[] args) {
		IFactory factory = null;
		factory = new FactoryPizzaRoma();
		
		IPizza pizza=null;
		pizza = factory.crearePizza();
		pizza.afisareDescriere();
	}

}
