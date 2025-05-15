package S11_Chain.models;

import java.util.List;

public class FiltrareBac extends Filtrare{
    public static final String denumireFiltru = "bac";

    public FiltrareBac() {
        super("bac");
    }

    @Override
    public List<Candidat> filtrare(List<Candidat> candidati) {
        // Se accepta doar candidatii cu media bac mai mare ca 6
        System.out.println("================ Se filtreaza dupa media de bac! ================");
        System.out.println("\tAvem " + candidati.size() + " candidati");

        List<Candidat> listaFiltrata = candidati.stream()
                .filter(candidat -> candidat.getNotaBac() > 6)
                .toList();

        if (listaFiltrata.isEmpty()) {
            System.out.println("Nu sunt candidati cu eseu de lungime para");
            return listaFiltrata;
        }

        if (this.nextHandler != null) {
            return this.nextHandler.filtrare(candidati);
        }

        System.out.println("Au ramas doar: " + listaFiltrata.size() + " candidati");
        return listaFiltrata;
    }
}
