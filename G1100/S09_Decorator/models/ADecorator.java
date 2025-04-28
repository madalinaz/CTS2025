package S09_Decorator.models;

public abstract class ADecorator implements IPizza {
    private IPizza pizza;

    public ADecorator(IPizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getListaIngrediente() {
        return pizza.getListaIngrediente();
    }

    @Override
    public double getPret() {
        return pizza.getPret();
    }
}
