package s14.clase;

import s14.exceptii.ExceptieModelNull;
import s14.exceptii.ExceptiePret;

public class Masina {
    private String model;
    private double pret;

    public Masina(String model, double pret) throws ExceptieModelNull, ExceptiePret {
        if(model==null)
            throw new ExceptieModelNull();
        if(pret<2000 || pret>=100000)
            throw new ExceptiePret();
        this.model = model;
        this.pret = pret;
    }

    public Masina() {
        this.model = "Default";
        this.pret = 2000;
    }

    public String getModel() {
        return model;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) throws ExceptiePret {
        if(pret<2000 || pret>=100000)
            throw new ExceptiePret();
        this.pret = pret;
    }
}
