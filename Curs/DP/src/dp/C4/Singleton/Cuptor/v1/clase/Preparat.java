package dp.C4.Singleton.Cuptor.v1.clase;

public class Preparat {
    private String denumire;
    private int nrGradeGatire;
    private int nrMinute;

    public Preparat(String denumire, int nrGradeGatire, int nrMinute) {
        this.denumire = denumire;
        this.nrGradeGatire = nrGradeGatire;
        this.nrMinute = nrMinute;
    }

    public String getDenumire() {
        return denumire;
    }

    public int getNrGradeGatire() {
        return nrGradeGatire;
    }

    public int getNrMinute() {
        return nrMinute;
    }

    @Override
    public String toString() {
        return "Preparat{" +
                "denumire='" + denumire + '\'' +
                ", nrGradeGatire=" + nrGradeGatire +
                ", nrMinute=" + nrMinute +
                '}';
    }
}
