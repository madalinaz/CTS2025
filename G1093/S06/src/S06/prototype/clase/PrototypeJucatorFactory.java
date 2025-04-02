package S06.prototype.clase;

import java.util.HashMap;
import java.util.Map;

public class PrototypeJucatorFactory {
    private static Map<TipSport,AbstractJucator> listaPrototipuri
            = new HashMap<>();

    public static AbstractJucator getPrototip(TipSport tipSport) throws CloneNotSupportedException {
        AbstractJucator rezultat = listaPrototipuri.getOrDefault(tipSport,null);
        if(rezultat!=null){
            return rezultat.clone();
        } else{
            Jucator jucator = new Jucator(tipSport);
            listaPrototipuri.put(tipSport,jucator);
            return jucator.clone();
        }
    }
}
