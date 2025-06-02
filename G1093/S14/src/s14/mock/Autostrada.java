package s14.mock;

import java.util.List;

public class Autostrada {
    public static int getNrAmenzi(List<AbstractMasina> listaMasini, AbstractVreme vreme){
        double vitezaMaxima = 130;
        int ct=0;
        if(vreme.estePloaie())
            vitezaMaxima=90;
        for(AbstractMasina masina : listaMasini){
            if(masina.getViteza() > vitezaMaxima){
                ct++;
            }
        }
        return ct;
    }
}
