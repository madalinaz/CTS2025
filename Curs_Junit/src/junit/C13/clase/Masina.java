package junit.C13.clase;

public class Masina {
    private String model;
    private double capacitateRezervor;      // capacitate totală a rezervorului (litri)
    private double combustibilCurent;       // combustibil disponibil (litri)
    private int kilometriParcursi;          // kilometri la bord
    private double consumPer100Km;          // consum mediu (litri/100km)

    // Constructor
    public Masina(String model, double capacitateRezervor, double consumPer100Km) throws ExceptieConstructorMasina, ExceptieAlimentare {
        if(model == null || model.length() <=1)
            throw new ExceptieConstructorMasina();
        this.model = model;
        this.capacitateRezervor = capacitateRezervor;
        //this.consumPer100Km = consumPer100Km;
        setConsumPer100Km(consumPer100Km);//adaugam si testari boundary suplimentare la nivel de constructor
        this.combustibilCurent = 0;
        this.kilometriParcursi = 0;
    }

    // Alimentare (consider functia f din testarea Inverse relationship)
    public void alimenteaza(double litri) {
        if (litri > 0) {
            combustibilCurent = Math.min(combustibilCurent + litri, capacitateRezervor);
        }
    }

    //meth este functia inversa din testarea de tip Inverse Relationship
    public void consuma(double litri) {
        if (litri > 0) {
            combustibilCurent=Math.max(combustibilCurent - litri, 0);
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
    public void setConsumPer100Km(double consum) throws ExceptieAlimentare {
        if(consum<=3 || consum>30.0) {
            throw new ExceptieAlimentare();
        }
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

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}

