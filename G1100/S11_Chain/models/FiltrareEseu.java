package S11_Chain.models;

import java.util.List;

// Concrete Handler
public class FiltrareEseu extends Filtrare {
    public static final String denumireFiltru = "eseu";

    public FiltrareEseu() {
        super("eseu");
    }

    @Override
    public List<Candidat> filtrare(List<Candidat> candidati) {
        // Se accepta doar candidatii cu eseu de lungime para
        System.out.println("================ Se filtreaza dupa eseul candidatului! ================");
        System.out.println("\tAvem " + candidati.size() + " candidati");

        List<Candidat> listaFiltrata = candidati.stream()
                .filter(candidat -> candidat.getEseu().length() % 2 == 0)
                .toList();

        if (listaFiltrata.isEmpty()) {
            System.out.println("Nu sunt candidati cu eseu de lungime para");
            return listaFiltrata;
        }

        System.out.println("Au ramas doar: " + listaFiltrata.size() + " candidati");

        if (this.nextHandler != null) {
            return this.nextHandler.filtrare(candidati);
        }

        return listaFiltrata;
    }
}
