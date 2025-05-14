package S11.program;


import S11.clase.chainOfResponsability.*;
import S11.clase.facade.Admitere;
import S11.clase.strategy.StrategyCustom;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Facultate facultate=new Facultate("ASE",5);
        List<Candidat> listaCandidati=new ArrayList<>();
        Candidat c1=new Candidat("C1","Eseu ASE",8.5f);
        Candidat c2=new Candidat("C2","Eseu ",8.5f);
        Candidat c3=new Candidat("C3","Eseu ASE",4.5f);
        Candidat c4=new Candidat("C4","Eseu ASE",8.5f);
        Candidat c5=new Candidat("C5","Eseu ASE",8.5f);
        Candidat c6=new Candidat("C6","Eseu ASE",8.5f);
        Candidat c7=new Candidat("C7","Eseu ASE",8.5f);

        listaCandidati.add(c1);
        listaCandidati.add(c2);
        listaCandidati.add(c3);
        listaCandidati.add(c4);
        listaCandidati.add(c5);
        listaCandidati.add(c6);
        listaCandidati.add(c7);

//        //Adaugare responsabili concreti
//        AHandler handlerNote=new FiltruNote();
//        AHandler handlerEseu=new FiltruEseu();
//        AHandler handlerClasament= new FiltruClasament();
//
//        //Creare lant intre responsabili
//        handlerNote.setSuccesor(handlerEseu);
//        handlerEseu.setSuccesor(handlerClasament);
//
//        //lansare cerere catre primul responsabil
//        System.out.println(handlerNote.filtrare(listaCandidati,facultate));

        //Folosind facade
        Admitere admitere=new Admitere(facultate,new FiltruNote(),new FiltruEseu(),new FiltruClasament());
        admitere.adaugaCandidat(c1);
        admitere.adaugaCandidat(c2);
        admitere.adaugaCandidat(c3);
        admitere.adaugaCandidat(c4);
        admitere.adaugaCandidat(c5);
        admitere.adaugaCandidat(c6);
        admitere.adaugaCandidat(c7);
        //admitere.lansareProcesAdmitere();

        //adaugand strategy la nivel de context(clasa Admitere)
        Admitere admitere2 = new Admitere(facultate);
        admitere2.adaugaCandidat(c1);
        admitere2.adaugaCandidat(c2);
        admitere2.adaugaCandidat(c3);
        admitere2.adaugaCandidat(c4);
        admitere2.adaugaCandidat(c5);
        admitere2.adaugaCandidat(c6);
        admitere2.adaugaCandidat(c7);

        admitere2.setStrategieCurenta(new StrategyCustom());
        admitere2.lansareProcesAdmitere();
    }
}