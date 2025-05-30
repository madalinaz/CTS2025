package cts.S14.clase;

public class Autostrada {
    public static double amenda(AbstractAutoturism autoturism, AbstractVreme vreme) {
        double vitezaMaxima =130;
        double vitezaCurenta = autoturism.getViteza();
        if(vreme.estePloaie()){
            vitezaMaxima=80;
        }
        if(autoturism.esteIncepator()){
            vitezaMaxima-=20;
        }
        if(vitezaCurenta>vitezaMaxima){
            return 1000;
        }
        return 0;
    }
}
