package S14.clase;

import java.util.List;

public class Autostrada {
    public static int getNrAmenzi(List<AbstractMasina> listaMasini, AbstractVreme vreme){
        int ct =0;
        double vitezaMaxima = 130;
        if(vreme.estePloaie()){
            vitezaMaxima=90;
        }
        for(AbstractMasina masina : listaMasini){
            if(masina.getViteza()>vitezaMaxima){
                ct++;
            }
        }
        return ct;
    }
}
