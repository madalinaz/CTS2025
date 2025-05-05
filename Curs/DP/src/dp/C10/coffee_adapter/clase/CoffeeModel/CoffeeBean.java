package dp.C10.coffee_adapter.clase.CoffeeModel;

public class CoffeeBean {
    private String name;
    private double quantity;

    public CoffeeBean(String name, double quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() { return name; }
    public double getQuantity() { return quantity; }
    public void setQuantity(double quantity) { this.quantity = quantity; }
}

