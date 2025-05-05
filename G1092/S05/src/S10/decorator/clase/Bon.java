package S10.decorator.clase;

public class Bon implements IBon{
    private double total;
    private Client client;

    public Bon(int total, Client client) {
        this.total = total;
        this.client = client;
    }

    @Override
    public double getTotal() {
        return total;
    }

    @Override
    public void printare() {
        System.out.println("total pe bon " + this.getTotal() + " lei");
    }

    @Override
    public Client getClient() {
        return client;
    }

    @Override
    public void setTotal(double total) {
        this.total = total;
    }


}
