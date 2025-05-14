package DP.Comportamentale.ChainOfResponsability.Banca;

public class Client {
    private String nume;
    private double salariu;
    private boolean areDatorii;
    private int nrPersoaneIntretinere;

    public Client(String nume, boolean areDatorii, double salariu, int nrPersoaneIntretinere) {
        this.nume = nume;
        this.areDatorii = areDatorii;
        this.salariu = salariu;
        this.nrPersoaneIntretinere = nrPersoaneIntretinere;
    }

    public String getNume() {
        return nume;
    }

    public double getSalariu() {
        return salariu;
    }

    public boolean isAreDatorii() {
        return areDatorii;
    }

    public int getNrPersoaneIntretinere() {
        return nrPersoaneIntretinere;
    }

    @Override
    public String toString() {
        return "Client{" +
                "nume='" + nume + '\'' +
                ", salariu=" + salariu +
                ", areDatorii=" + areDatorii +
                ", nrPersoaneIntretinere=" + nrPersoaneIntretinere +
                '}';
    }
}
