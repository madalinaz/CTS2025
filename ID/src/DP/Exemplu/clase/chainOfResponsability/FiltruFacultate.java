package DP.Exemplu.clase.chainOfResponsability;

import java.util.ArrayList;
import java.util.List;

public class FiltruFacultate extends AbstractHandler{
    private String facultateCautata;

    public FiltruFacultate(String facultateCautata) {
        this.facultateCautata = facultateCautata;
    }

    @Override
    public List<ICandidat> filtrare(List<ICandidat> listaCandidati) {
        List<ICandidat> listaFiltrata = new ArrayList<ICandidat>();

        //se pastreaza candidatii care au facultatea CSIE
        for(ICandidat candidat : listaCandidati){
            if(candidat.getFacultate().equals(facultateCautata)){
                listaFiltrata.add(candidat);
            }
        }
        System.out.println("Dupa filtrare dupa facultate au ramas: "+listaFiltrata.size()+" candidati");
        //dupa ce am aplicat filtrul curent pe baza regulii, trimit mai departe in chain
        if(super.getSuccesor()!=null){
            //daca am un succesor dupa mine
            return super.getSuccesor().filtrare(listaFiltrata);
        } else{
            System.out.println("S-a terminat filtrarea");
            return listaFiltrata;
        }
    }
}
