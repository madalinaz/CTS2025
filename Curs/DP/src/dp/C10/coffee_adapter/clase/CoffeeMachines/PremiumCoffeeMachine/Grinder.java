package dp.C10.coffee_adapter.clase.CoffeeMachines.PremiumCoffeeMachine;

import dp.C10.coffee_adapter.clase.CoffeeModel.CoffeeBean;
import dp.C10.coffee_adapter.clase.CoffeeModel.GroundCoffee;

//only part of premium coffee machine
public class Grinder {
    public GroundCoffee grind(CoffeeBean beans, int quantityCoffee) {
        return new GroundCoffee(beans.getName(), quantityCoffee);
    }
}
