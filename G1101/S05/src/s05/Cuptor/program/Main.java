package s05.Cuptor.program;

import s05.Cuptor.clase.Cuptor;
import s05.Cuptor.clase.Preparat;

public class Main {
    public static void main(String[] args) {
        //avem un unic cuptor la nivel de restaurant
        //bucatarii asteapta la coada sa bage preparatele in cuptor
        //la nivel de cuptor->lista de asteptare (preparate -> denumire, nr grade gatire, nr minute gatire

        Cuptor.getInstance().addPreparat(new Preparat("friptura",230,5));
        Cuptor.getInstance().addPreparat(new Preparat("tarta",180,20));
        Cuptor.getInstance().addPreparat(new Preparat("paine",280,50));

        Cuptor.getInstance().afisareInfoCuptor();
    }
}
