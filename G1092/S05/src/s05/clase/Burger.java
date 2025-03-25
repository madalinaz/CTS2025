package s05.clase;

public class Burger implements IProdus{
    public int idBurger;
    private String denumire;
    private int numarChifle;

    public Burger(String denumire, int numarChifle, int idBurger) {
        this.denumire = denumire;
        this.numarChifle = numarChifle;
        this.idBurger = idBurger;
    }

    public int getIdBurger() {
        return idBurger;
    }

    @Override
    public String getDenumireProdus() {
        return this.denumire;
    }

    @Override
    public void getDescriere() {
        System.out.println(this.toString());
    }

    @Override
    public int getId() {
        return getIdBurger();
    }

    @Override
    public String toString() {
        return "Burger{" +
                "denumire='" + denumire + '\'' +
                ", numarChifle=" + numarChifle +
                ", id=" + idBurger +
                '}';
    }
}
