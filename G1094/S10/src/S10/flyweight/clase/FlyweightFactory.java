package S10.flyweight.clase;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private static Map<TipElement,IElement> mapa = new HashMap<>();
    static {
        mapa.put(TipElement.BARCA,new Element(TipElement.BARCA,"bitmapBarca"));
        mapa.put(TipElement.NAVA,new Element(TipElement.NAVA,"bitmapNava"));
        mapa.put(TipElement.SUBMARIN,new Element(TipElement.SUBMARIN,"bitmapSubmarin"));
    }
    public static IElement getElement(TipElement tipElement){
        //nu se poate modifica enum-ul
        //return mapa.getOrDefault(tipElement,mapa.get(TipElement.BARCA));
        return mapa.get(tipElement);
    }
}
