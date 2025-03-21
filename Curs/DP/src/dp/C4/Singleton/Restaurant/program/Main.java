package dp.C4.Singleton.Restaurant.program;

import dp.C4.Singleton.Restaurant.clase.Ospatar;
import dp.C4.Singleton.Restaurant.clase.Restaurant;

public class Main {

    public static void main(String[] args) {
        //utilizarea concreta a DP Singleton
        Ospatar o1 = new Ospatar("Gigel");
        Ospatar o2 = new Ospatar("Costel");

        o1.preiaComanda();
        o2.preiaComanda();
        o1.preiaComanda();
        o2.preiaComanda();

        Restaurant.getInstance().afisareDisponibilitateMese();
        }
    }

