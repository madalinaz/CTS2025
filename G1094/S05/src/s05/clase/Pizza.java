package s05.clase;

public class Pizza implements  Preparat{
    private int id;
    private String denumire;
    private int diametru;
    private boolean areCarne;

    public Pizza(int id, String denumire, int diametru, boolean areCarne) {
        this.id = id;
        this.denumire = denumire;
        this.diametru = diametru;
        this.areCarne = areCarne;
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
                ", areCarne=" + areCarne +
                '}';
    }
}
