package S09_Decorator.models;

public class DecoratorIuteala extends ADecorator{
    private int nivelIuteala;

    public DecoratorIuteala(IPizza pizza, int nivelIuteala) {
        super(pizza);
        this.nivelIuteala = nivelIuteala;
    }

    @Override
    public String getListaIngrediente() {
        return super.getListaIngrediente() + ", Uiteala de nivel: " + this.nivelIuteala;
    }

    @Override
    public double getPret() {
        return super.getPret() + 5.5;
    }
}
