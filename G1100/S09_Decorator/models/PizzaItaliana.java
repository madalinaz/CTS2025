package S09_Decorator.models;

public class PizzaItaliana implements IPizza{
    @Override
    public String getListaIngrediente() {
        return "Blat, Sos Rosii, Salam";
    }

    @Override
    public double getPret() {
        return 45.5;
    }
}
