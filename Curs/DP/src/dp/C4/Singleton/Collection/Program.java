package dp.C4.Singleton.Collection;

import java.util.Collections;
import java.util.Set;

public class Program {

    public static void main(String[] args) {
        Set<Angajat> ceo = Collections.singleton(new Angajat("Gigel"));

        Angajat a = new Angajat("Costel");
        //ceo.add(a);
        //ceo.clear();
        //ceo.remove(a);

        for(Angajat ang: ceo) {
            ang.setNume("Costel");
            System.out.println(ang.toString());
        }
    }

}
