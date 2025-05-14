package S11.clase.Strategy;

import S11.clase.ChainOfResponsability.FiltruAbstract;
import S11.clase.ChainOfResponsability.FiltruClasament;
import S11.clase.ChainOfResponsability.FiltruEseu;
import S11.clase.ChainOfResponsability.FiltruNote;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StrategieCustomizabila implements IStrategy{

    private static Map<String, FiltruAbstract> mapaFiltre;

    static{
        mapaFiltre = new HashMap<>();
        mapaFiltre.put("eseu",new FiltruEseu());
        mapaFiltre.put("note",new FiltruNote());
        mapaFiltre.put("clasament",new FiltruClasament());
    }

    @Override
    public TehnicaFiltrare generareStrategie() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceti primul filtru (eseu, note, clasament): ");
        String filtru1Key = scanner.nextLine().toLowerCase();

        System.out.print("Introduceti al doilea filtru (eseu, note, clasament): ");
        String filtru2Key = scanner.nextLine().toLowerCase();

        System.out.print("Introduceti al treilea filtru (eseu, note, clasament): ");
        String filtru3Key = scanner.nextLine().toLowerCase();

        FiltruAbstract filtru1 = mapaFiltre.get(filtru1Key);
        FiltruAbstract filtru2 = mapaFiltre.get(filtru2Key);
        FiltruAbstract filtru3 = mapaFiltre.get(filtru3Key);

        if (filtru1 == null || filtru2 == null || filtru3 == null) {
            throw new IllegalArgumentException("Unul sau mai multe filtre introduse nu sunt valide.");
        }

        return new TehnicaFiltrare(filtru1, filtru2, filtru3);
    }
}
