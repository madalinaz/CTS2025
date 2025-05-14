package S11.clase.chainOfResponsability;

public class Facultate {
    private String denumire;
    private int nrLocuri;

    public Facultate(String denumire, int nrLocuri) {
        this.denumire = denumire;
        this.nrLocuri = nrLocuri;
    }

    public String getDenumire() {
        return denumire;
    }

    public int getNrLocuri() {
        return nrLocuri;
    }

    @Override
    public String toString() {
        return "Facultate{" +
                "denumire='" + denumire + '\'' +
                ", nrLocuri=" + nrLocuri +
                '}';
    }
}
