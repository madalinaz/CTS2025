package dp.C9.decorator.program;

import dp.C9.decorator.clase.APizza;
import dp.C9.decorator.clase.DecoratorCrown;
import dp.C9.decorator.clase.DecoratorPicant;
import dp.C9.decorator.clase.PizzaVegetariana;

public class Program {

	public static void main(String[] args) {
		APizza pizza = new PizzaVegetariana();
		System.out.println(pizza.getComponente());
		System.out.println(pizza.getPret());
		
		//folosind decorator
		APizza pizzaDecorata = new DecoratorCrown(pizza);
		System.out.println(pizzaDecorata.getComponente());
		System.out.println(pizzaDecorata.getPret());

		//decorare multipla
		APizza pizzaDecorataMultiplu = new DecoratorPicant
				(new DecoratorCrown
						(new PizzaVegetariana()), 10);
		System.out.println(pizzaDecorataMultiplu.getComponente());
		System.out.println(pizzaDecorataMultiplu.getPret());
	}

}
