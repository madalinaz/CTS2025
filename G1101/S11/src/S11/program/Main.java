package S11.program;


import S11.clase.ChainOfResponsability.Candidat;
import S11.clase.ChainOfResponsability.FiltruClasament;
import S11.clase.ChainOfResponsability.FiltruEseu;
import S11.clase.ChainOfResponsability.FiltruNote;
import S11.clase.Facade.Admitere;
import S11.clase.Strategy.StrategieCustomizabila;
import S11.clase.Strategy.StrategiePrestabilita;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Candidat candidat1 = new Candidat("Andrei", "1", 7, 8);
        Candidat candidat2 = new Candidat("Andrei", "2", 7, 7);
        Candidat candidat3 = new Candidat("Andrei", "1", 7, 6);
        Candidat candidat4 = new Candidat("Andrei", "1", 7, 4);
        Candidat candidat5 = new Candidat("Andrei", "1", 5, 6);
        Candidat candidat6 = new Candidat("Andrei", "11", 7, 6);

        List<Candidat> candidati = new ArrayList<>();
        candidati.add(candidat1);
        candidati.add(candidat2);
        candidati.add(candidat3);
        candidati.add(candidat4);
        candidati.add(candidat5);
        candidati.add(candidat6);

        //adaugare responsabili concreti
//        FiltruAbstract filtruEseu = new FiltruEseu();
//        FiltruAbstract filtruNote = new FiltruNote();
//        FiltruAbstract filtruClasament = new FiltruClasament();
//
//        //creare lant de responsibilitati
//        filtruEseu.setNextHandler((filtruNote));
//        filtruNote.setNextHandler((filtruClasament));
//
//        //lansare cerere in lant catre primul responsabil
//        System.out.println(filtruEseu.filtrare(candidati));

        //ce faceam in main am facut  in facade
        Admitere admitere = new Admitere(new FiltruEseu(), new FiltruNote(), new FiltruClasament());
        admitere.adaugaCandidat(candidat1);
        admitere.adaugaCandidat(candidat2);
        admitere.adaugaCandidat(candidat3);
        admitere.adaugaCandidat(candidat4);
        admitere.adaugaCandidat(candidat5);
        admitere.adaugaCandidat(candidat6);

       // admitere.lansareProcesAdmitere();

        //utilizand Strategy ca mecanism de setare a responsabililor/filtrelor si a ordinii de executie a filtrelor
        //admitere.setStrategieCurenta(new StrategiePrestabilita());
        admitere.setStrategieCurenta(new StrategieCustomizabila());
        admitere.lansareProcesAdmitere();
    }
}