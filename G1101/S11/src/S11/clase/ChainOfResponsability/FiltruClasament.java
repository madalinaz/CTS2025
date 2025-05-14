package S11.clase.ChainOfResponsability;

import java.util.ArrayList;
import java.util.List;

public class FiltruClasament extends FiltruAbstract{
    private int nrLocuriDisponibile = 2;

    public FiltruClasament setNrLocuriDisponibile(int nrLocuriDisponibile) {
        this.nrLocuriDisponibile = nrLocuriDisponibile;
        return this;
    }


    @Override
    public List<Candidat> filtrare(List<Candidat> candidati) {
        List<Candidat> candidatiAdmis = new ArrayList<>();
     for(int i = 0; i < candidati.size(); i++) {
         for(int j = i + 1; j < candidatiAdmis.size(); j++) {
             if(candidati.get(i).getMedieExamen() < candidati.get(j).getMedieExamen()) {
                 Candidat aux = candidati.get(i);
                 candidati.set(i, candidati.get(j));
                 candidati.set(j, candidati.get(j));
                 candidati.set(j, aux);
             }
          }
     }
//     if(nrLocuriDisponibile >= candidati.size()) {
//        candidatiAdmis = candidati;
//     }
     for(int i = 0; i < nrLocuriDisponibile && i < candidati.size(); i++) {
         candidatiAdmis.add(i, candidati.get(i));
     }
        System.out.println("Dupa filtrare clasament au ramas " + candidatiAdmis.size() + " candidati.");

        if(nextHandler != null) {
            return nextHandler.filtrare(candidatiAdmis);
        } else {
            System.out.println("S-a terminat filtrarea.");
            return candidatiAdmis;
        }
    }
}
