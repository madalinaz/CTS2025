package dp.C3.O.After;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        Angajat a1 = new Lucrator("Gigel",80,80);
        Angajat a2 = new Manager ("Costel",true,12000);

        List<Angajat> listaAngajati = new ArrayList<>();
        listaAngajati.add(a1);
        listaAngajati.add(a2);

        double totalSalarii=0;
        for(Angajat a:listaAngajati){
            totalSalarii+=a.getSalariu();
        }
        System.out.println("Total salarii lista angajati: "+totalSalarii);
    }

}
