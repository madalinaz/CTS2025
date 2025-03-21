package dp.C4.Singleton.Cuptor.v2.clase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cuptor {
    private Cuptor instance=null;//vedeti daca mai aveti nevoie de el

    //lista de cuptoare (statica)
    private static Map<Integer,Cuptor> cuptoare = null;

    //obligatoriu sectiune de static block
    static{
        cuptoare= new HashMap<>();
        //preluare info din surse externe/fisiere
        cuptoare.put(1,new Cuptor(1,250));
        cuptoare.put(2,new Cuptor(2,280));
        cuptoare.put(3,new Cuptor(3,300));
        cuptoare.put(4,new Cuptor(4,270));
    }


    //singleton data (datele stocate la nivel de fiecare cuptor in parte)
    private int id;
    private int nrMaximGrade;
    private List<Preparat> listaAsteptare;

    private Cuptor(int id, int nrMaximGrade){
        this.id=id;
        this.nrMaximGrade=nrMaximGrade;
        this.listaAsteptare=new ArrayList<>();
    }

    //nu as merge pe meth getInstance in stil clasic (adica sa primesc un id si sa intorc un cuptor)
    //adica NU veti folosi getInstance ca sa intoarca orice id de cuptor si pe baza lui sa adaugati in lista de asteptare
    //meth de adaugarePreparat (o sa adauge acel preparat in lista de asteptare a cuptorului care minimizeaza timpul de asteptare)
    //in meth de adaugare de avut grija si la gradele cuptorului precum si al preparatului

    //meth de afisare a TUTUROR cuptoarelor detinute
}
