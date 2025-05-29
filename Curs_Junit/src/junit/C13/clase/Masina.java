package junit.C13.clase;

public class Masina {
    private double capacitateRezervor;      // capacitate totală a rezervorului (litri)
    private double combustibilCurent;       // combustibil disponibil (litri)
    private int kilometriParcursi;          // kilometri la bord
    private double consumPer100Km;          // consum mediu (litri/100km)

    // Constructor
    public Masina(double capacitateRezervor, double consumPer100Km) {
        this.capacitateRezervor = capacitateRezervor;
        this.consumPer100Km = consumPer100Km;
        this.combustibilCurent = 0;
        this.kilometriParcursi = 0;
    }

    // Alimentare
    public void alimenteaza(double litri) {
        if (litri > 0) {
            combustibilCurent = Math.min(combustibilCurent + litri, capacitateRezervor);
        }
    }

    // Deplasare
    public void deplaseaza(int kilometri) {
        double combustibilNecesar = (kilometri / 100.0) * consumPer100Km;
        if (combustibilNecesar <= combustibilCurent && kilometri > 0) {
            combustibilCurent -= combustibilNecesar;
            kilometriParcursi += kilometri;
        }
    }

    // Settere și gettere
    public void setConsumPer100Km(double consum) {
        this.consumPer100Km = consum;
    }

    public double getCombustibilCurent() {
        return combustibilCurent;
    }

    public int getKilometriParcursi() {
        return kilometriParcursi;
    }

    public double getCapacitateRezervor() {
        return capacitateRezervor;
    }

    public double getConsumPer100Km() {
        return consumPer100Km;
    }
}

