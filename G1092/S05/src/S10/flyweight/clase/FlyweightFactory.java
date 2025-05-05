package S10.flyweight.clase;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private static Map<String, FormaGeometrica> formaGeometricaMap = new HashMap<>();

    static {
        formaGeometricaMap.put("cerc", new FormaGeometrica("cerc", "detalii cerc"));
        formaGeometricaMap.put("patrat", new FormaGeometrica("patrat", "detalii patrat"));
        formaGeometricaMap.put("romb", new FormaGeometrica("romb", "detalii romb"));
    }

    public static FormaGeometrica getFlyweight(String cheie)
    {
        //presupunem despre cheie ca e de tip enum
        //stim sigur ca obiectul e in mapa
//        if (!formaGeometricaMap.containsKey(cheie))
//        {
//            formaGeometricaMap.put(cheie, new FormaGeometrica(cheie, "detalii " + cheie));
//        }
        return formaGeometricaMap.get(cheie);
    }
}
