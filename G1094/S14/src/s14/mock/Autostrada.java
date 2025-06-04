package s14.mock;

import java.util.List;

public class Autostrada {
    public static int getNrAmenzi
            (List<AbstractMasina> listaMasini,
             AbstractVreme vreme){
        int ct=0;
        double vitezaMaxima = 130;
        if(vreme.suntPrecipitatii()){
            vitezaMaxima=90;
        }
        for(AbstractMasina m:listaMasini){
            if(m.areSemnLamaie()) {
                if (m.getViteza() > vitezaMaxima - 20)
                    ct++;
            }
            else{
                if(m.getViteza()>vitezaMaxima)
                    ct++;
            }
        }
        return ct;
    }
}
