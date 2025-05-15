package S11_Chain.models;

import java.util.List;

public class FiltrareExamenAdmitere extends Filtrare {
    public static final String denumireFiltru = "admitere";


    public FiltrareExamenAdmitere() {
        super("admitere");
    }

    @Override
    public List<Candidat> filtrare(List<Candidat> candidati) {
        // Se accepta doar candidatii cu nota de examen mai mare ca 8
        System.out.println("================ Se filtreaza dupa media examenului! ================");
        System.out.println("\tAvem " + candidati.size() + " candidati");

        List<Candidat> listaFiltrata = candidati.stream()
                .filter(candidat -> candidat.getNotaExamenAdmitere() > 8)
                .toList();

        if (listaFiltrata.isEmpty()) {
            System.out.println("Nus unt candidati cu eseu de lungime para");
            return listaFiltrata;
        }

        if (this.nextHandler != null) {
            return this.nextHandler.filtrare(candidati);
        }

        System.out.println("Au ramas doar: " + listaFiltrata.size() + " candidati");
        return listaFiltrata;
    }
}
