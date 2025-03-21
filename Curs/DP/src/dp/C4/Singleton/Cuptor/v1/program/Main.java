package dp.C4.Singleton.Cuptor.v1.program;

import dp.C4.Singleton.Cuptor.v1.clase.Cuptor;
import dp.C4.Singleton.Cuptor.v1.clase.Preparat;

public class Main {

    public static void main(String[] args) {
        Cuptor cuptor = Cuptor.getInstance();

        cuptor.addPreparat(new Preparat("Paste",170,20));
        cuptor.addPreparat(new Preparat("Friptura",220,10));
        cuptor.addPreparat(new Preparat("Pizza",280,7));

        cuptor.afisarePreparate();
    }
}
