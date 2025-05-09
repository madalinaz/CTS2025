package S10.decorator.clase;

public abstract class AbstractDecorator implements IComanda{
    protected IComanda comanda;


    public AbstractDecorator(IComanda comanda) {
        this.comanda = comanda;
    }


    @Override
    public Produs getProdus() {
        return comanda.getProdus();
    }

    @Override
    public void printare() {
        comanda.printare();
    }
}
