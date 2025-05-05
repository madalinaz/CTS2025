package dp.C10.coffee_adapter.clase.CoffeeMachines.Adapter;

import dp.C10.coffee_adapter.clase.CoffeeMachines.Interface.FilterCoffeeMachine;
import dp.C10.coffee_adapter.clase.CoffeeMachines.PremiumCoffeeMachine.PremiumCoffeeMachine;
import dp.C10.coffee_adapter.clase.CoffeeModel.Coffee;
import dp.C10.coffee_adapter.clase.CoffeeModel.CoffeeType;
import dp.C10.coffee_adapter.clase.Exception.CoffeeException;

public class FilterCoffeeAdapter implements FilterCoffeeMachine {
    private PremiumCoffeeMachine machine;

    public FilterCoffeeAdapter(PremiumCoffeeMachine machine) {
        this.machine = machine;
    }

    @Override
    public Coffee brewCoffee() {
        try {
            return machine.brewCoffee(CoffeeType.FILTER_COFFEE);
        } catch (CoffeeException e) {
            System.out.println("exceptie " + e);
            return null;
        }
    }
}
