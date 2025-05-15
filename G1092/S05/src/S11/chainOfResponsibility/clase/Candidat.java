package S11.chainOfResponsibility.clase;

public class Candidat {
    private String eseu;
    private float medieBac;
    private float examenMate;

    public Candidat(String eseu, float medieBac, float examenMate) {
        this.eseu = eseu;
        this.medieBac = medieBac;
        this.examenMate = examenMate;
    }

    public String getEseu() {
        return eseu;
    }

    public void setEseu(String eseu) {
        this.eseu = eseu;
    }

    public float getMedieBac() {
        return medieBac;
    }

    public void setMedieBac(float medieBac) {
        this.medieBac = medieBac;
    }

    public float getExamenMate() {
        return examenMate;
    }

    public void setExamenMate(float examenMate) {
        this.examenMate = examenMate;
    }

    @Override
    public String toString() {
        return "Candidat{" +
                "eseu='" + eseu + '\'' +
                ", medieBac=" + medieBac +
                ", examenMate=" + examenMate +
                '}';
    }
}
