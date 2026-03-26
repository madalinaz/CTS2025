package DP.Structurale.Decorator;

public class Program {

	public static void main(String[] args) {
		//inainte de decorator
		APizza pizza = new PizzaVegetariana();
		System.out.println(pizza.getComponente());
		System.out.println(pizza.getPret());
		
		//folosind decorator, dar asta nu inseamna ca nu se pot genera si Pizza "simple" precum inainte
		//aveti grija sa indepliniti DIP
		APizza pizzaDecorata = new DecoratorCrown(pizza);
		System.out.println(pizzaDecorata.getComponente());
		System.out.println(pizzaDecorata.getPret());

		//decorare multipla
		APizza pizzaDecorataMultiplu = new DecoratorPicant
				(new DecoratorCrown
						(new PizzaVegetariana()), 10);
		System.out.println(pizzaDecorataMultiplu.getComponente());
		System.out.println(pizzaDecorataMultiplu.getPret());

		//TO DO
		//1. De implementat astfel incat sa nu se permita anumite decorari multiple dupa niste reguli furnizate de voi (Nu permite decorare Crown peste o alta decorare Crown)

	}

}
