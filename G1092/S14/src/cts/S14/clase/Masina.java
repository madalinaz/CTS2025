package cts.S14.clase;

import cts.S14.exceptii.ExceptieAnFabricatie;
import cts.S14.exceptii.ExceptieModelNull;

public class Masina {
    private String model;
    private int consum;
    private int anFabricatie;
    private double pret;

    public Masina(int consum, String model, int anFabricatie, double pret) throws ExceptieModelNull {
        if(model==null) {
            throw new ExceptieModelNull();
        }
        this.consum = consum;
        this.model = model;
        this.anFabricatie = anFabricatie;
        this.pret = pret;
    }

    public Masina() {
        this.consum = 0;
        this.model = "NA";
        this.anFabricatie = 1900;
        this.pret = 0;
    }

    public String getModel() {
        return model;
    }

    public int getConsum() {
        return consum;
    }

    public int getAnFabricatie() {
        return anFabricatie;
    }

    public double getPret() {
        return pret;
    }

    public void setAnFabricatie(int anFabricatie) throws ExceptieAnFabricatie {
        if(anFabricatie <1900 || anFabricatie > 2025)
            throw new ExceptieAnFabricatie();
        this.anFabricatie = anFabricatie;
    }
}
