package dp.C10.coffee_adapter.clase.CoffeeMachines;

public class Configuration {
    private int quantityCoffee;
    private int quantityWater;

    public Configuration(int quantityCoffee, int quantityWater) {
        this.quantityCoffee = quantityCoffee;
        this.quantityWater = quantityWater;
    }

    public int getQuantityCoffee() { return quantityCoffee; }
    public int getQuantityWater() { return quantityWater; }
}
