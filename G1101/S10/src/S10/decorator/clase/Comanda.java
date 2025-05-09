package S10.decorator.clase;

public class Comanda implements IComanda{
    private int id;
    private Produs produs;

    public Comanda(int id, Produs produs) {
        this.id = id;
        this.produs = produs;
    }

    @Override
    public Produs getProdus() {
        return this.produs;
    }

    @Override
    public void printare() {
        System.out.println("Se printeaza comanda " + this.id);
        System.out.println(this.produs.toString());
    }
}
