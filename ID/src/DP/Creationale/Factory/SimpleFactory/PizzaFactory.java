package DP.Creationale.Factory.SimpleFactory;

public class PizzaFactory {
	
	public IPizza crearePizza(ETipPizza tipPizza) throws Exception {
		switch (tipPizza) {
		case VEGETARIANA:
			return new PizzaVegetariana();
		case ROMA:
			return new PizzaRoma();
		default:
			throw new Exception("Nu este tip pizza valid!");
		}
	}
}
