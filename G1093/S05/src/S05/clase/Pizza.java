package S05.clase;

public class Pizza implements  Preparat{
    private int id;
    private String denumire;
    private int diametru;

    public Pizza(int id, String denumire, int diametru) {
        this.id = id;
        this.denumire = denumire;
        this.diametru = diametru;
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
        return "Pizza{" +
                "id=" + id +
                ", denumire='" + denumire + '\'' +
                ", diametru=" + diametru +
                '}';
    }
}
