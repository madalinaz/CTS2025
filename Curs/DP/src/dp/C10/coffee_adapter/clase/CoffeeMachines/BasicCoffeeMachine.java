package dp.C10.coffee_adapter.clase.CoffeeMachines;


import dp.C10.coffee_adapter.clase.CoffeeMachines.Interface.FilterCoffeeMachine;
import dp.C10.coffee_adapter.clase.CoffeeModel.Coffee;
import dp.C10.coffee_adapter.clase.CoffeeModel.CoffeeType;
import dp.C10.coffee_adapter.clase.CoffeeModel.GroundCoffee;
import dp.C10.coffee_adapter.clase.Exception.CoffeeException;

import java.util.Map;

public class BasicCoffeeMachine implements FilterCoffeeMachine {
    private Configuration config;
    private Map<CoffeeType, GroundCoffee> groundCoffee;
    private BrewingUnit brewingUnit;

    public BasicCoffeeMachine(Map<CoffeeType, GroundCoffee> coffee) {
        this.groundCoffee = coffee;
        this.brewingUnit = new BrewingUnit();
        this.config = new Configuration(30, 480);
    }

    @Override
    public Coffee brewCoffee() {
        GroundCoffee coffee = this.groundCoffee.get(CoffeeType.FILTER_COFFEE);
        return this.brewingUnit.brew(CoffeeType.FILTER_COFFEE, coffee, config.getQuantityWater());
    }

    public void addGroundCoffee(CoffeeType sel, GroundCoffee newCoffee) throws CoffeeException {
        GroundCoffee existingCoffee = this.groundCoffee.get(sel);

        if (existingCoffee != null) {
            if (existingCoffee.getName().equals(newCoffee.getName())) {
                existingCoffee.setQuantity(existingCoffee.getQuantity() + newCoffee.getQuantity());
            } else {
                throw new CoffeeException("Only one kind of coffee supported for each CoffeeType.");
            }
        } else {
            this.groundCoffee.put(sel, newCoffee);
        }
    }
}

