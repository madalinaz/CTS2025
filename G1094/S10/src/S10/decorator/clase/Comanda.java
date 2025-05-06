package S10.decorator.clase;

import java.util.List;

public class Comanda implements IComanda{
    private int id;
    private List<Produs> listaProduse;

    public Comanda(int id, List<Produs> listaProduse) {
        this.id = id;
        this.listaProduse = listaProduse;
    }
    @Override
    public void printare() {
        System.out.println(this);
    }

    @Override
    public double getTotal() {
        double total = 0;
        for (Produs produs: listaProduse){
            total += produs.getPret();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Comanda{" +
                "id=" + id +
                ", listaProduse=" + listaProduse +
                '}';
    }
}
