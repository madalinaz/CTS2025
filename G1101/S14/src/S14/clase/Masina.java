package S14.clase;

import S14.exceptii.ExceptieAn;
import S14.exceptii.ExceptieModel;

public class Masina {
    private String model;
    private double pret;
    private int anFabricatie;

    public Masina(String model, double pret, int anFabricatie) throws ExceptieModel, ExceptieAn {
        if(model==null || model.length()<=2){
            throw new ExceptieModel();
        }
        if(anFabricatie<1900 || anFabricatie>2025){
            throw new ExceptieAn();
        }
        this.model = model;
        this.pret = pret;
        this.anFabricatie = anFabricatie;
    }

    public Masina() {
        this.model = "Default";
        this.pret = 2000;
        this.anFabricatie = 1900;
    }

    public String getModel() {
        return model;
    }

    public int getAnFabricatie() {
        return anFabricatie;
    }

    public double getPret() {
        return pret;
    }

    public void setAnFabricatie(int anFabricatie) throws ExceptieAn {
        if(anFabricatie<1900 || anFabricatie>2025){
            throw new ExceptieAn();
        }
        this.anFabricatie = anFabricatie;
    }
}
