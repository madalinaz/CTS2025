package S11.clase.ChainOfResponsability;

import java.util.ArrayList;
import java.util.List;

public class FiltruEseu extends FiltruAbstract{
    @Override
    public List<Candidat> filtrare(List<Candidat> candidati) {
        //se considera eseul corect daca are o lungime impara
        List<Candidat> candidatiEseuAdmis = new ArrayList<>();
        for(Candidat candidat : candidati) {
            if(candidat.getEseu().length() % 2 != 0) {
                candidatiEseuAdmis.add(candidat);
            }
        }
        System.out.println("Dupa filtrare eseu au ramas " + candidatiEseuAdmis.size() + " candidati.");
        if(nextHandler != null) {
            return nextHandler.filtrare(candidatiEseuAdmis);
        } else {
            System.out.println("S-a terminat filtrarea.");
            return candidatiEseuAdmis;
        }
    }
}
