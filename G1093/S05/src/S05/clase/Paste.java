package S05.clase;

public class Paste implements  Preparat{
    private int id;
    private String denumire;
    private String tipSos;
    private boolean areCarne;

    public Paste(int id, String denumire, String tipSos, boolean areCarne) {
        this.id = id;
        this.denumire = denumire;
        this.tipSos = tipSos;
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
        return "Paste{" +
                "id=" + id +
                ", denumire='" + denumire + '\'' +
                ", tipSos='" + tipSos + '\'' +
                ", areCarne=" + areCarne +
                '}';
    }
}
