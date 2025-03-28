package s05.Cuptor.clase;

public class Preparat {
    private String denumire;
    private int nrGradeGatire;
    private int nrMinuteGatire;

    public Preparat(String denumire, int nrGradeGatire, int nrMinuteGatire) {
        this.denumire = denumire;
        this.nrGradeGatire = nrGradeGatire;
        this.nrMinuteGatire = nrMinuteGatire;
    }

    public String getDenumire() {
        return denumire;
    }

    public int getNrGradeGatire() {
        return nrGradeGatire;
    }

    public int getNrMinuteGatire() {
        return nrMinuteGatire;
    }

    @Override
    public String toString() {
        return "Preparat{" +
                "denumire='" + denumire + '\'' +
                ", nrGradeGatire=" + nrGradeGatire +
                ", nrMinuteGatire=" + nrMinuteGatire +
                '}';
    }
}
