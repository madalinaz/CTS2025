package dp.C5.prototype.pbSticker.clase;

import java.util.HashMap;
import java.util.Map;

public class PrototypeStickerFactory {
    private static Map<String,Sticker> listaPrototipuri;

    //versiune eager
    static{
        listaPrototipuri = new HashMap<>();
        listaPrototipuri
                .put("Skoda-2010",new Sticker(new Masina("Skoda",2010)));
        listaPrototipuri
                .put("Skoda-2015",new Sticker(new Masina("Skoda",2015)));

    }

    public static Sticker getPrototip(String cheie) throws CloneNotSupportedException {
        Sticker clona = listaPrototipuri.getOrDefault(cheie,null);
        if(clona!=null){
            return clona.clone();
        }
        return null;
    }
}
