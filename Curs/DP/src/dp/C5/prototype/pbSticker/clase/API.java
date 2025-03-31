package dp.C5.prototype.pbSticker.clase;

import java.util.HashMap;
import java.util.Map;

public class API {
    private static API instance = new API();
    private Map<String, String> listaDimensiuni;
    private API(){

    }

    static{
        instance.listaDimensiuni = new HashMap<>();
        instance.listaDimensiuni.put("Skoda-2010","lista dimensiuni Skoda-2010");
        instance.listaDimensiuni.put("Skoda-2015","lista dimensiuni Skoda-2015");

    }

    public static API getInstance(){
        return instance;
    }

    public String getListaDimensiuni(String cheie){
        String rezultat = this.listaDimensiuni.getOrDefault(cheie,null);
        return rezultat;
    }
}
