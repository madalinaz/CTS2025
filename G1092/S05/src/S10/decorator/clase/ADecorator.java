package S10.decorator.clase;

public abstract class ADecorator implements IBon{
    private IBon bon;

    public ADecorator(IBon bon) {
        this.bon = bon;
    }

    @Override
    public double getTotal() {
        return bon.getTotal();
    }

    @Override
    public void printare() {
        bon.printare();
    }

    @Override
    public Client getClient() {
        return bon.getClient();
    }

    public void setTotal(double total)
    {
        bon.setTotal(total);
    }
}
