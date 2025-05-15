package S11_Chain.models;

import java.util.*;

public class FacadeFiltrare {
    private static String packagePath = "week11_Chain.models";
    private static Map<String, Filtrare> optiuniFiltrare = new HashMap<>();

    static {
        // Aici ar trebui sa incarc toate clasele din pachet care implementeaza Filtrare si sa adaug ca key in map valoarea statica denumireFiltru

        ServiceLoader loader = ServiceLoader.load(Filtrare.class);
        for (Object filtru : loader) {
            String name = filtru.getClass().getSimpleName();
            optiuniFiltrare.put(name, (Filtrare) filtru);
        }
    }

    public static void adaugareHandler(String denumireFiltru, Filtrare filtru) {
        optiuniFiltrare.put(denumireFiltru, filtru);
    }

    private Filtrare getFiltrare(String denumireFiltru) {
        return optiuniFiltrare.getOrDefault(denumireFiltru, null);
    }

    public void admitere(List<String> filtreAdmitere, List<Candidat> candidati, boolean shuffle) {
        Collections.shuffle(filtreAdmitere);
        for (String filtru : filtreAdmitere) {
            Filtrare handlerFiltru = optiuniFiltrare.getOrDefault(filtru, null);

            if (handlerFiltru == null) {
                System.out.println("Filtrul ales este invalid");
            } else {
                candidati = handlerFiltru.filtrare(candidati);
            }
        }
    }
}
