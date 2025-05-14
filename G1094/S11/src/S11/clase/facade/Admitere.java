package S11.clase.facade;


import S11.clase.chainOfResponsability.AHandler;
import S11.clase.chainOfResponsability.Candidat;
import S11.clase.chainOfResponsability.Facultate;
import S11.clase.strategy.IStrategy;

import java.util.ArrayList;
import java.util.List;

public class Admitere {
    private Facultate facultate;
    private List<Candidat> listaCandidati;
    private AHandler filtru1;
    private AHandler filtru2;
    private AHandler filtru3;
    private IStrategy strategieCurenta;

    public Admitere(Facultate facultate, AHandler filtru1, AHandler filtru2, AHandler filtru3) {
        this.facultate = facultate;
        this.filtru1 = filtru1;
        this.filtru2 = filtru2;
        this.filtru3 = filtru3;
        this.listaCandidati = new ArrayList<Candidat>();
    }

    public Admitere(Facultate facultate) {
        this.facultate = facultate;
        this.listaCandidati=new ArrayList<>();
    }

    private void creareLant(){
        if(strategieCurenta != null){
            List<AHandler> listaHandler=this.strategieCurenta.generareFiltre();
            filtru1=listaHandler.get(0);
            filtru2=listaHandler.get(1);
            filtru3=listaHandler.get(2);
        }
        filtru1.setSuccesor(filtru2);
        filtru2.setSuccesor(filtru3);
    }

    public void lansareProcesAdmitere(){
        creareLant();
        System.out.println("A inceput admiterea");
        System.out.println(this.filtru1.filtrare(listaCandidati, facultate));
    }

    public void adaugaCandidat(Candidat c) {
        listaCandidati.add(c);
    }

    public void setStrategieCurenta(IStrategy strategieCurenta) {
        this.strategieCurenta = strategieCurenta;
    }
}
