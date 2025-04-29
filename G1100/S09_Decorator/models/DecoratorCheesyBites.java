package S09_Decorator.models;

public class DecoratorCheesyBites extends ADecorator {
    public DecoratorCheesyBites(IPizza pizza) {
        super(pizza);
    }

    @Override
    public String getListaIngrediente() {
        return super.getListaIngrediente() + ", Margine Cheesy Bites";
    }

    @Override
    public double getPret() {
        return super.getPret() + 10;
    }
}
