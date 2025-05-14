package S11.clase.chainOfResponsability;

import java.util.ArrayList;
import java.util.List;

public class FiltruEseu extends AHandler{
    @Override
    public List<Candidat> filtrare(List<Candidat> listaCandidat, Facultate facultate) {
        List<Candidat> listaFiltrata=new ArrayList<>();
        for (Candidat  candidat : listaCandidat) {
            if (candidat.getEseu().contains(facultate.getDenumire())){
                listaFiltrata.add(candidat);
            }
        }
        System.out.println("Dupa filtrare eseu au ramas: "+listaCandidat.size());
        if(this.succesor!=null){
            return this.succesor.filtrare(listaFiltrata,facultate);
        }else {
            System.out.println("S-a terminat filtrarea");
            return listaFiltrata;
        }
    }
}
