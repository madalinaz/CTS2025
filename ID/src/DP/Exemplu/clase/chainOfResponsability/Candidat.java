package DP.Exemplu.clase.chainOfResponsability;

public class Candidat implements ICandidat {
    private String nume;
    private String scrisoareIntentie;
    private String facultate;
    private int nrAniExperienta;

    public Candidat(String nume, String scrisoareIntentie, String facultate, int nrAniExperienta) {
        this.nume = nume;
        this.scrisoareIntentie = scrisoareIntentie;
        this.facultate = facultate;
        this.nrAniExperienta = nrAniExperienta;
    }

    @Override
    public String getNume() {
        return nume;
    }

    @Override
    public String getScrisoareIntentie() {
        return scrisoareIntentie;
    }

    @Override
    public String getFacultate() {
        return facultate;
    }

    @Override
    public int getNrAniExperienta() {
        return nrAniExperienta;
    }

    @Override
    public String toString() {
        return "Candidat{" +
                "nume='" + nume + '\'' +
                ", scrisoareIntentie='" + scrisoareIntentie + '\'' +
                ", facultate='" + facultate + '\'' +
                ", nrAniExperienta=" + nrAniExperienta +
                '}';
    }
}
