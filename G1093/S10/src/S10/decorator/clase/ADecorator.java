package S10.decorator.clase;

public abstract class ADecorator implements IBon{
    protected IBon bon;

    public ADecorator(IBon bon) {
        this.bon = bon;
    }

    @Override
    public void printare() {
        bon.printare();
    }

    @Override
    public String getData() {
        return bon.getData();
    }

    @Override
    public float getSuma() {
        return bon.getSuma();
    }
}
