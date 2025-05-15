package S11.chainOfResponsibility.program;

import S11.chainOfResponsibility.clase.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Candidat c1 = new Candidat("eseu11", 10, 2);
        Candidat c2 = new Candidat("eseu21", 6, 7);
        Candidat c3 = new Candidat("eseu1", 5, 6);
        Candidat c4 = new Candidat("eseu41", 8, 5);
        Candidat c5 = new Candidat("eseu51", 10, 7);
        List<Candidat> candidati = new ArrayList<>();
        candidati.add (c1);
        candidati.add (c2);
        candidati.add (c3);
        candidati.add (c4);
        candidati.add (c5);
        AnalizaEseuHandler analizaEseuHandler = new AnalizaEseuHandler();
        AnalizaExamenMateHandler analizaExamenMateHandler = new AnalizaExamenMateHandler();
        AnalizaMedieBacHandler analizaMedieBacHandler = new AnalizaMedieBacHandler();

//        analizaEseuHandler.setNext(analizaMedieBacHandler);
//        analizaMedieBacHandler.setNext(analizaExamenMateHandler);

//        analizaEseuHandler.admitere(candidati);


        //folosind DP facade
        Admitere admitere = new Admitere(analizaEseuHandler, analizaExamenMateHandler, analizaMedieBacHandler);
        for (Candidat candidat : candidati)
        {
            admitere.addCandidat(candidat);
        }
        admitere.filtrareCandidati();


    }
}
