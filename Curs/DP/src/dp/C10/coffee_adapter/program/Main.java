package dp.C10.coffee_adapter.program;

import dp.C10.coffee_adapter.clase.CoffeeMachines.Adapter.FilterCoffeeAdapter;
import dp.C10.coffee_adapter.clase.CoffeeMachines.BasicCoffeeMachine;
import dp.C10.coffee_adapter.clase.CoffeeMachines.Interface.FilterCoffeeMachine;
import dp.C10.coffee_adapter.clase.CoffeeMachines.PremiumCoffeeMachine.PremiumCoffeeMachine;
import dp.C10.coffee_adapter.clase.CoffeeModel.CoffeeBean;
import dp.C10.coffee_adapter.clase.CoffeeModel.CoffeeType;
import dp.C10.coffee_adapter.clase.CoffeeModel.GroundCoffee;
import dp.C10.coffee_adapter.clase.Exception.CoffeeException;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws CoffeeException {

        //premium cu adapter
        Map<CoffeeType, CoffeeBean> premiumBeans = new HashMap<>();
        premiumBeans.put(CoffeeType.FILTER_COFFEE, new CoffeeBean("Premium beans", 1000));
        premiumBeans.put(CoffeeType.ESPRESSO, new CoffeeBean("Espresso beans", 500));

        PremiumCoffeeMachine premiumMachine = new PremiumCoffeeMachine(premiumBeans);
        FilterCoffeeMachine adapter = new FilterCoffeeAdapter(premiumMachine);
        FilterCoffeeApp app = new FilterCoffeeApp(adapter);
        app.prepareCoffee();
        //premium simplu neintegrat
//        premiumMachine.brewCoffee(CoffeeType.ESPRESSO);

        //basic
        Map<CoffeeType, GroundCoffee> basicBeans = new HashMap<>();
        basicBeans.put(CoffeeType.FILTER_COFFEE, new GroundCoffee("Basic beans", 1000));
        
        BasicCoffeeMachine basicMachine = new BasicCoffeeMachine(basicBeans);
        FilterCoffeeApp basicApp = new FilterCoffeeApp(basicMachine);
        basicApp.prepareCoffee();

    }
}
