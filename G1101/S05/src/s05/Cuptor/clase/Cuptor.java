package s05.Cuptor.clase;

import java.util.ArrayList;
import java.util.List;

public class Cuptor {
    private static Cuptor instance;
    private List<Preparat> listaAsteptare;
    private int nrMaximGrade;

    static{
        //preluare info din surse externe
        instance = new Cuptor(270);
    }

    private Cuptor(int nrMaximGrade){
        this.nrMaximGrade=nrMaximGrade;
        this.listaAsteptare=new ArrayList<>();
    }

    public static Cuptor getInstance(){
        return instance;
    }

    //singleton method
    public void addPreparat(Preparat p){
        if(p.getNrGradeGatire()<=this.nrMaximGrade)
            this.listaAsteptare.add(p);
    }

    public void afisareInfoCuptor(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Cuptor{" +
                "listaAsteptare=" + listaAsteptare +
                ", nrMaximGrade=" + nrMaximGrade +
                '}';
    }
}
