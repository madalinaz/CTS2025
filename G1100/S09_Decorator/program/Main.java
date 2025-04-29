package S09_Decorator.program;

import S09_Decorator.models.*;

public class Main {
    public static void main(String[] args) {
        IPizza pizza = new PizzaItaliana();
        IPizza pizza2 = new PizzaRoma();

        System.out.println(pizza.getListaIngrediente());
        System.out.println(pizza2.getListaIngrediente());

        System.out.println("\n =============== Dupa Decorator ===============\n");
        IPizza pizzaDecorata = new DecoratorCheesyBites(pizza);
        IPizza pizzaDecorata2 = new DecoratorCheesyBites(new PizzaItaliana());

        System.out.println("Pizza decorare 1:");
        System.out.println(pizzaDecorata.getListaIngrediente());
        System.out.println(pizzaDecorata.getPret());

        System.out.println("Pizza decorare 2:");
        System.out.println(pizzaDecorata2.getListaIngrediente());
        System.out.println(pizzaDecorata2.getPret());

        System.out.println("Pizza decorata dublu");
        IPizza pizzaDecorataDublu = new DecoratorIuteala(pizzaDecorata, 2);
        System.out.println(pizzaDecorataDublu.getListaIngrediente());
        System.out.println(pizzaDecorataDublu.getPret());
    }
}
