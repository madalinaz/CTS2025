package S5.clase;

public class Masa {
    private int id;
    private int nrScaune;
    private boolean esteAfara;

    public Masa(int id, int nrScaune, boolean esteAfara) {
        this.id = id;
        this.nrScaune = nrScaune;
        this.esteAfara = esteAfara;
    }

    public int getId() {
        return id;
    }

    public int getNrScaune() {
        return nrScaune;
    }

    public boolean isEsteAfara() {
        return esteAfara;
    }

    @Override
    public String toString() {
        return "Masa{" +
                "id=" + id +
                ", nrScaune=" + nrScaune +
                ", esteAfara=" + esteAfara +
                '}';
    }
}
