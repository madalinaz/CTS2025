package s05.Restaurant.clase;

public class Masa {
    private int id;
    private int nrScaune;
    private boolean esteAfara;
    private boolean esteLibera;

    public Masa(int id, int nrScaune, boolean esteAfara, boolean esteLibera) {
        this.id = id;
        this.nrScaune = nrScaune;
        this.esteAfara = esteAfara;
        this.esteLibera = esteLibera;
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

    public boolean isEsteLibera() {
        return esteLibera;
    }

    public void setEsteLibera(boolean esteLibera) {
        this.esteLibera = esteLibera;
    }

    @Override
    public String toString() {
        return "Masa{" +
                "id=" + id +
                ", nrScaune=" + nrScaune +
                ", esteAfara=" + esteAfara +
                ", esteLibera=" + esteLibera +
                '}';
    }
}
