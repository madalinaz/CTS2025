package DP.Creationale.Factory.FactoryMethod;

public class Program {

	public static void main(String[] args) {
		IFactory factory = null;
		factory = new FactoryPizzaRoma();
		
		IPizza pizza=null;
		pizza = factory.crearePizza();
		pizza.afisareDescriere();
	}

}
