package S10.flyweight.clase;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private static Map<TipImagine, IImage> mapa;
    static {
        //initializare eager
        mapa = new HashMap<>();
        mapa.put(TipImagine.CERC, new Image("Detalii cerc", TipImagine.CERC));
        mapa.put(TipImagine.PATRAT, new Image("Detalii patrat", TipImagine.PATRAT));
        mapa.put(TipImagine.TRIUNGHI, new Image("Detalii triunghi", TipImagine.TRIUNGHI));
    }

    public static IImage getImage(TipImagine tipImagine) {
        //presupunem ca nu extindem enumeratia si ne limitam la cele initiale
        return mapa.getOrDefault(tipImagine, null);
    }
}
