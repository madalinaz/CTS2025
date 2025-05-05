package dp.C10.coffee_adapter.clase.CoffeeMachines.PremiumCoffeeMachine;


import dp.C10.coffee_adapter.clase.CoffeeMachines.BrewingUnit;
import dp.C10.coffee_adapter.clase.CoffeeMachines.Configuration;
import dp.C10.coffee_adapter.clase.CoffeeModel.Coffee;
import dp.C10.coffee_adapter.clase.CoffeeModel.CoffeeBean;
import dp.C10.coffee_adapter.clase.CoffeeModel.CoffeeType;
import dp.C10.coffee_adapter.clase.CoffeeModel.GroundCoffee;
import dp.C10.coffee_adapter.clase.Exception.CoffeeException;

import java.util.HashMap;
import java.util.Map;

public class PremiumCoffeeMachine {
    private Map<CoffeeType, Configuration> configMap;
    private Map<CoffeeType, CoffeeBean> beans;
    private Grinder grinder;
    private BrewingUnit brewingUnit;

    public PremiumCoffeeMachine(Map<CoffeeType, CoffeeBean> beans) {
        this.beans = beans;
        this.grinder = new Grinder();
        this.brewingUnit = new BrewingUnit();
        this.configMap = new HashMap<>();
        this.configMap.put(CoffeeType.FILTER_COFFEE, new Configuration(30, 480));
        this.configMap.put(CoffeeType.ESPRESSO, new Configuration(8, 28));
    }

    public Coffee brewCoffee(CoffeeType selection) throws CoffeeException {
        switch (selection) {
            case FILTER_COFFEE:
                return brewFilterCoffee();
            case ESPRESSO:
                return brewEspresso();
            default:
                throw new CoffeeException("Unsupported selection: " + selection);
        }
    }

    private Coffee brewEspresso() {
        Configuration config = configMap.get(CoffeeType.ESPRESSO);
        GroundCoffee groundCoffee = grinder.grind(beans.get(CoffeeType.ESPRESSO), config.getQuantityCoffee());
        return brewingUnit.brew(CoffeeType.ESPRESSO, groundCoffee, config.getQuantityWater());
    }

    private Coffee brewFilterCoffee() {
        Configuration config = configMap.get(CoffeeType.FILTER_COFFEE);
        GroundCoffee groundCoffee = grinder.grind(beans.get(CoffeeType.FILTER_COFFEE), config.getQuantityCoffee());
        return brewingUnit.brew(CoffeeType.FILTER_COFFEE, groundCoffee, config.getQuantityWater());
    }

    public void addCoffeeBeans(CoffeeType sel, CoffeeBean newBeans) throws CoffeeException {
        CoffeeBean existingBeans = this.beans.get(sel);

        if (existingBeans != null) {
            if (existingBeans.getName().equals(newBeans.getName())) {
                existingBeans.setQuantity(existingBeans.getQuantity() + newBeans.getQuantity());
            } else {
                throw new CoffeeException("Only one kind of coffee supported for each CoffeeType.");
            }
        } else {
            this.beans.put(sel, newBeans);
        }
    }
}
