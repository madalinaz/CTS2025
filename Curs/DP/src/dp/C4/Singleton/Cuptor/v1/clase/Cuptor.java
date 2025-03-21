package dp.C4.Singleton.Cuptor.v1.clase;

import java.util.ArrayList;
import java.util.List;

public class Cuptor {
    //in context de singleton
    //singleton data => lista de preparate care sunt in asteptare
    //int gradeMaxime

    //static block initialization (se simuleaza citirea din exterior/din resurse exterioare/din BD/din fisiere text/din specificatii)
    //ori in constructor iar constructorul sa preia din surse externe necesarul pentru initializare(nr maxim de grade)

    private static Cuptor instance=new Cuptor();
    private List<Preparat> listaAsteptare;
    private int nrMaximGrade;

    private Cuptor(){
        this.nrMaximGrade=270;
        this.listaAsteptare=new ArrayList<>();
    }

    public static Cuptor getInstance(){
        return instance;
    }

    public void addPreparat(Preparat p){
        if(p!=null) {
            if (p.getNrGradeGatire() > this.nrMaximGrade) {
                System.out.println("Nu se poate prepara. Nu suporta atatea grade");
            } else {
                this.listaAsteptare.add(p);
            }
        } else{
            System.out.println("Adaugati un preparat valid");
        }
    }

    public void afisarePreparate(){
        for(Preparat p:listaAsteptare){
            System.out.println(p);
        }
    }
}
