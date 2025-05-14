package S11.clase.chainOfResponsability;

public class Candidat {
    private String nume;
    private String eseu;
    private float medieAdmitere;

    public Candidat(String nume, String eseu, float medieAdmitere) {
        this.nume = nume;
        this.eseu = eseu;
        this.medieAdmitere = medieAdmitere;
    }

    public String getNume() {
        return nume;
    }

    public String getEseu() {
        return eseu;
    }

    public float getMedieAdmitere() {
        return medieAdmitere;
    }

    @Override
    public String toString() {
        return "Candidat{" +
                "nume='" + nume + '\'' +
                ", eseu='" + eseu + '\'' +
                ", medieAdmitere=" + medieAdmitere +
                '}';
    }
}
