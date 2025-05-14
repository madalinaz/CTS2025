package S11.clase.strategy;

import S11.clase.chainOfResponsability.AHandler;
import S11.clase.chainOfResponsability.FiltruClasament;
import S11.clase.chainOfResponsability.FiltruEseu;
import S11.clase.chainOfResponsability.FiltruNote;

import java.util.*;

public class StrategyCustom implements IStrategy {
    private static Map<String, AHandler> mapaFiltre;

    static {
        mapaFiltre = new HashMap<>();
        mapaFiltre.put("eseu", new FiltruEseu());
        mapaFiltre.put("note", new FiltruNote());
        mapaFiltre.put("clasament", new FiltruClasament());
    }

    @Override
    public List<AHandler> generareFiltre() {
        List<AHandler> listaAHandlers = new ArrayList<AHandler>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceti primul filtru (eseu, note, clasament): ");
        String filtru1Key = scanner.nextLine().toLowerCase();

        System.out.print("Introduceti al doilea filtru (eseu, note, clasament): ");
        String filtru2Key = scanner.nextLine().toLowerCase();

        System.out.print("Introduceti al treilea filtru (eseu, note, clasament): ");
        String filtru3Key = scanner.nextLine().toLowerCase();

        listaAHandlers.add(mapaFiltre.get(filtru1Key));
        listaAHandlers.add(mapaFiltre.get(filtru2Key));
        listaAHandlers.add(mapaFiltre.get(filtru3Key));

        return listaAHandlers;
    }
}
