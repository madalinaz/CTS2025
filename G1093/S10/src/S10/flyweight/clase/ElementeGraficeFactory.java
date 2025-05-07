package S10.flyweight.clase;

import java.util.HashMap;
import java.util.Map;

public class ElementeGraficeFactory {
    private static Map<TipGrafic, IElementGrafic> listaElemente=new HashMap<>();
    static{
        listaElemente.put(TipGrafic.AVION, new ElementGrafic(TipGrafic.AVION, "detaliiDesenareAvion"));
        listaElemente.put(TipGrafic.ASTEROID,new ElementGrafic(TipGrafic.ASTEROID, "detaliiDesenareAsteroid"));
        listaElemente.put(TipGrafic.NAVA, new ElementGrafic(TipGrafic.NAVA, "detaliiDesenareNava"));
    }
    public static IElementGrafic getElementGrafic(TipGrafic tipGrafic){
        return listaElemente.get(tipGrafic);
    }

}
