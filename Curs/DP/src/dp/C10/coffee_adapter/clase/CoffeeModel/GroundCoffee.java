package dp.C10.coffee_adapter.clase.CoffeeModel;

public class GroundCoffee {
    private String name;
    private double quantity;

    public GroundCoffee(String name, double quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() { return name; }
    public double getQuantity() { return quantity; }
    public void setQuantity(double quantity) { this.quantity = quantity; }
}
