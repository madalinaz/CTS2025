package s14.clase;

import s14.exceptii.ExceptieModel;
import s14.exceptii.ExceptiePret;

public class Masina {
    private String model;
    private double pret;

    public Masina(String model, double pret) throws ExceptieModel, ExceptiePret {
        if(model==null || model.length()<=2){
            throw new ExceptieModel();
        }
        if(pret<2000 || pret>=50000){
            throw new ExceptiePret();
        }
        this.model = model;
        this.pret = pret;
    }

    public Masina() {
        this.model = "Anonim";
        this.pret = 2000;
    }

    public String getModel() {
        return model;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) throws ExceptiePret {
        if(pret<2000 || pret>=50000){
            throw new ExceptiePret();
        }
        this.pret = pret;
    }
}
