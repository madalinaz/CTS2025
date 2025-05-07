package S10.flyweight.clase;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Canvas {
    private Map<Integer, Set<Integer>> mapa=new HashMap<>();
    public void addElementGrafic(TipGrafic tip, int x, int y){
        ElementeGraficeFactory.getElementGrafic(tip).deseneaza(x,y);
        if(!mapa.containsKey(x)){
            mapa.put(x, new HashSet<>());

        }
        mapa.get(x).add(y);
    }
    public void afisareCoordonate(){
        for(int x:mapa.keySet()){
            for(int y:mapa.get(x)){
                System.out.println(x+ ":"+y);
            }
        }
    }
}
