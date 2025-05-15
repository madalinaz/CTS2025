package S10_FlyWeight.models;

import java.util.HashMap;
import java.util.Map;

public class FlyWeightFactory {
    private static Map<TipForma, FormaGeometrica> registry = new HashMap<TipForma, FormaGeometrica>();

    // eager initialization
    static {
        registry.put(TipForma.CERC, new FormaGeometrica(TipForma.CERC, "Cercul are raza de 4 cm."));
        registry.put(TipForma.PATRAT, new FormaGeometrica(TipForma.PATRAT, "Patratur are latura de 21 cm."));
        registry.put(TipForma.TRIUNGHI,
                new FormaGeometrica(TipForma.TRIUNGHI, "Triunghi echilateral cu latura de 10 cm."));
    }

    public static FormaGeometrica getFormaGeometrica(TipForma key) {
        // Pentru ca folosim ENUM presupunem ca sigur exista in mapa noastra obiectul
        // cautat
        return registry.get(key);
    }
}
