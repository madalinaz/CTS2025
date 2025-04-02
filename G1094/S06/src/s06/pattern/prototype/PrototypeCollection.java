package s06.pattern.prototype;

import java.util.HashMap;
import java.util.Map;

public class PrototypeCollection {
    private static Map<TipPersonaj,AbstractPersonaj> mapa = new HashMap<>();

    public static AbstractPersonaj getPrototip(TipPersonaj tip) throws CloneNotSupportedException {
        if(!mapa.containsKey(tip)){
            switch (tip){
                case ANIMAL -> {
                    mapa.put(tip,new Animal());
                }
                case VRAJITOR -> {
                    mapa.put(tip,new Vrajitor());
                }
            }
        }
        return mapa.get(tip).clone();
    }
}
