package s05.clase;

public class Burger implements  Preparat{
    private int id;
    private String denumire;
    private String tipCarne;

    public Burger(int id, String denumire, String tipCarne) {
        this.id = id;
        this.denumire = denumire;
        this.tipCarne = tipCarne;
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public String getDenumire() {
        return this.denumire;
    }

    @Override
    public void afisare() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Burger{" +
                "id=" + id +
                ", denumire='" + denumire + '\'' +
                ", tipCarne='" + tipCarne + '\'' +
                '}';
    }
}
