package DP.Exemplu.clase.facade;

import DP.Exemplu.clase.chainOfResponsability.ICandidat;
import DP.Exemplu.clase.chainOfResponsability.IFiltrare;
import DP.Exemplu.clase.strategy.IStrategy;

import java.util.ArrayList;
import java.util.List;

public class DepartamentHR {
    private IFiltrare filtru1;
    private IFiltrare filtru2;
    private IFiltrare filtru3;
    private List<ICandidat> listaCandidati;
    private IStrategy strategieCurenta; //pentru strategy DP

    public DepartamentHR(IFiltrare filtru1, IFiltrare filtru2, IFiltrare filtru3) {
        this.filtru1 = filtru1;
        this.filtru2 = filtru2;
        this.filtru3 = filtru3;
        this.listaCandidati = new ArrayList<ICandidat>();
        creareLant();
    }

    //pentru Strategy DP
    public void setStrategy(IStrategy strategieCurenta) {
        this.strategieCurenta = strategieCurenta;
    }

    public void adaugaCandidat(ICandidat candidat){
        this.listaCandidati.add(candidat);
    }

    //o metoda interna care este utilizata doar in interiorul clasei
    private void creareLant(){
        filtru1.setSuccesor(filtru2);
        filtru2.setSuccesor(filtru3);
    }

    public void procesFiltrareCandidati(){
       List<ICandidat> listaFiltrata = filtru1.filtrare(listaCandidati);
       if(this.strategieCurenta!=null){
           //daca am o strategie curenta setata
           this.strategieCurenta.printare(listaFiltrata);
       } else{
           System.out.println("Nu avem tehnica de printare stabilita inca");
       }
    }
}
