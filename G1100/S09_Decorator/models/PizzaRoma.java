package S09_Decorator.models;

public class PizzaRoma implements IPizza{
    @Override
    public String getListaIngrediente() {
        return "Blat, Sos Rosii, Ciuperci";
    }

    @Override
    public double getPret() {
        return 25.5;
    }
}
