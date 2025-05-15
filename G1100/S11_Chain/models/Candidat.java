package S11_Chain.models;

public class Candidat {
    private String nume;
    private String eseu;
    private double notaBac;
    private double notaExamenAdmitere;

    public Candidat(String nume, String eseu, double notaBac, double notaExamenAdmitere) {
        this.nume = nume;
        this.eseu = eseu;
        this.notaBac = notaBac;
        this.notaExamenAdmitere = notaExamenAdmitere;
    }

    public String getNume() {
        return nume;
    }

    public String getEseu() {
        return eseu;
    }

    public double getNotaBac() {
        return notaBac;
    }

    public double getNotaExamenAdmitere() {
        return notaExamenAdmitere;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Candidat{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", eseu='").append(eseu).append('\'');
        sb.append(", notaBac=").append(notaBac);
        sb.append(", notaExamenAdmitere=").append(notaExamenAdmitere);
        sb.append('}');
        return sb.toString();
    }
}
