package dp.C3.O.Before;

public class Lucrator {
    private String nume;
    private double tarifOra;
    private int nrOreLucrate;

    public Lucrator(String nume, double tarifOra, int nrOreLucrate) {
        this.nume = nume;
        this.tarifOra = tarifOra;
        this.nrOreLucrate = nrOreLucrate;
    }

    public String getNume() {
        return nume;
    }

    public double getTarifOra() {
        return tarifOra;
    }

    public int getNrOreLucrate() {
        return nrOreLucrate;
    }
}
