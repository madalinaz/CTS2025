package dp.C10.coffee_adapter.clase.CoffeeMachines;


import dp.C10.coffee_adapter.clase.CoffeeModel.Coffee;
import dp.C10.coffee_adapter.clase.CoffeeModel.CoffeeType;
import dp.C10.coffee_adapter.clase.CoffeeModel.GroundCoffee;

//is part of both basic and premium
public class BrewingUnit {
    public Coffee brew(CoffeeType selection, GroundCoffee groundCoffee, int quantityWater) {
        return new Coffee(selection);
    }
}

