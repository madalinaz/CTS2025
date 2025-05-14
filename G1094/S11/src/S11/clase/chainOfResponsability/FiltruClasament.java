package S11.clase.chainOfResponsability;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FiltruClasament extends AHandler{
    @Override
    public List<Candidat> filtrare(List<Candidat> listaCandidat, Facultate facultate) {
        List<Candidat> listaFiltrata=new ArrayList<>();

            listaCandidat.sort(Comparator.comparing(Candidat::getMedieAdmitere).reversed());
            for (int i = 0; i < facultate.getNrLocuri() && i< listaCandidat.size(); i++) {
               listaFiltrata.add(listaCandidat.get(i));
            }

        System.out.println("Dupa filtrare clasament au ramas:"+listaCandidat.size());
        if(this.succesor!=null){
            return this.succesor.filtrare(listaFiltrata,facultate);
        }else {
            System.out.println("S-a terminat filtrarea");
            return listaFiltrata;
        }
    }
}
