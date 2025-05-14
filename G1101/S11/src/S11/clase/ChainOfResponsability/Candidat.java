package S11.clase.ChainOfResponsability;

public class Candidat {
    private String nume;
    private String eseu;
    private double medieBac;
    private double medieExamen;

    public Candidat(String nume, String eseu, double medieBac, double medieExamen) {
        this.nume = nume;
        this.eseu = eseu;
        this.medieBac = medieBac;
        this.medieExamen = medieExamen;
    }

    public String getNume() {
        return nume;
    }

    public String getEseu() {
        return eseu;
    }

    public double getMedieBac() {
        return medieBac;
    }

    public double getMedieExamen() {
        return medieExamen;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Candidat{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", eseu='").append(eseu).append('\'');
        sb.append(", medieBac=").append(medieBac);
        sb.append(", medieExamen=").append(medieExamen);
        sb.append('}');
        return sb.toString();
    }
}
