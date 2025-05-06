package dp.C10.coffee_adapter.program;

import dp.C10.coffee_adapter.clase.CoffeeMachines.Interface.FilterCoffeeMachine;
import dp.C10.coffee_adapter.clase.CoffeeModel.Coffee;

public class FilterCoffeeApp {
    private FilterCoffeeMachine coffeeMachine;

    public FilterCoffeeApp(FilterCoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    public Coffee prepareCoffee() {
        Coffee coffee = coffeeMachine.brewCoffee();
        System.out.println("Coffee is ready!");
        System.out.println(" -> " + coffee);
        return coffee;
    }
}
