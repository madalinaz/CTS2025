package S10.decorator.clase;

public abstract class DecoratorAbstract implements IComanda{
    protected IComanda comanda;

    public DecoratorAbstract(IComanda comanda) {
        this.comanda = comanda;
    }

    @Override
    public void printare() {
        comanda.printare();
    }

    @Override
    public double getTotal() {
        return comanda.getTotal();
    }
}
