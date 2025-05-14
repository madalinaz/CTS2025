package S11_Chain.program;

import S11_Chain.models.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Candidat> candidates = new ArrayList<>();

        // Adaugam candidati in lista
        candidates.add(new Candidat("Ion Popescu", "fdsjkllfsdfjsdfds jfldsfjlsdk", 8.0, 7.5));
        candidates.add(new Candidat("Maria Ionescu", "fdsjkllfsdfjsd fds jfldsfjlsdk", 9.0, 8.5));
        candidates.add(new Candidat("Andrei Georgescu", "fdsjkllfsdfjsd fds jfldsfjlsdk", 7.0, 6.5));


//        FiltrareEseu feseu = new FiltrareEseu();
//        FiltrareBac fmedie = new FiltrareBac();
//        FiltrareExamenAdmitere fexam = new FiltrareExamenAdmitere();

//        feseu.setNextHandler(fmedie);
//        fmedie.setNextHandler(fexam);
//        List<Candidat> filteredCandidates = feseu.filtrare(candidates);
//        System.out.println("Candidatii ramasi in lista sunt:");
//        for (Candidat c : filteredCandidates) {
//            System.out.println(c.getNume());
//        }
        FacadeFiltrare procesAdmitere = new FacadeFiltrare();
        procesAdmitere.admitere( new ArrayList<>( List.of("bac", "admitere", "eseu") ), candidates, true);
    }
}
