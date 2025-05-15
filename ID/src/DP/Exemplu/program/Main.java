package DP.Exemplu.program;

import DP.Exemplu.clase.chainOfResponsability.*;
import DP.Exemplu.clase.facade.DepartamentHR;
import DP.Exemplu.clase.strategy.StrategieGDPR;
import DP.Exemplu.clase.strategy.StrategieNoGDPR;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ICandidat c1=new Candidat("Gigel1","sunt responsabil","CSIE",4);
        ICandidat c2=new Candidat("Gigel2","sunt dedicat","CSIE",4);
        ICandidat c3=new Candidat("Gigel3","sunt responsabil","FABIZ",4);
        ICandidat c4=new Candidat("Gigel4","sunt responsabil","CSIE",1);
        ICandidat c5=new Candidat("Gigel5","sunt responsabil","CSIE",6);
        ICandidat c6=new Candidat("Gigel6","sunt responsabil","CSIE",8);

        List<ICandidat> listaCandidati = new ArrayList<ICandidat>();
        listaCandidati.add(c1);
        listaCandidati.add(c2);
        listaCandidati.add(c3);
        listaCandidati.add(c4);
        listaCandidati.add(c5);
        listaCandidati.add(c6);

        //responsabili/filtre selectie candidati
        IFiltrare filtruScrisoare = new FiltruScrisoareIntentie();
        IFiltrare filtruFacultate = new FiltruFacultate("CSIE");
        IFiltrare filtruAniExperienta = new FiltruAniExperienta();

        //creare lant responsabili
        filtruScrisoare.setSuccesor(filtruFacultate);
        filtruFacultate.setSuccesor(filtruAniExperienta);

        //utilizare lant de responsabili prin lansare "cerere"
        //List<ICandidat> listaFiltrata = filtruScrisoare.filtrare(listaCandidati);
        //System.out.println(listaFiltrata);

        System.out.println(filtruScrisoare.filtrare(listaCandidati));

        //FOLOSIND FACADE
        DepartamentHR hr = new DepartamentHR(new FiltruFacultate("CSIE"),new FiltruAniExperienta(),new FiltruScrisoareIntentie());
        hr.adaugaCandidat(c1);
        hr.adaugaCandidat(c2);
        hr.adaugaCandidat(c3);
        hr.adaugaCandidat(c4);
        hr.adaugaCandidat(c5);
        hr.adaugaCandidat(c6);

        //AGAUGARE STRATEGY DP IN POVESTE
        hr.setStrategy(new StrategieGDPR());
       //hr.setStrategy(new StrategieNoGDPR());
        hr.procesFiltrareCandidati();

    }
}
