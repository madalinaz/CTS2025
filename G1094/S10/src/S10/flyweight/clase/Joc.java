package S10.flyweight.clase;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Joc {
    private int numarPuncte=0;
    private Map<Integer, Set<Integer>> mapa= new HashMap<>();

    public void adaugaElement(TipElement tipElement, int x, int y){
        FlyweightFactory.getElement(tipElement).desenare(x,y);
        if(!mapa.containsKey(x)){
            mapa.put(x,new HashSet<>(y));
        }
        else{
            mapa.get(x).add(y);
        }
    }

    public void lanseazaBullet(int x){
        numarPuncte+=mapa.get(x).size();
    }

    public void afisareCanvas(){
        System.out.printf("POZITII ELEMENTE PE CANVAS");
        for(int x: mapa.keySet()){
            System.out.printf("\n");
            System.out.print(x+": ");
            for(int y:mapa.get(x)){
                System.out.printf(y+", ");
            }
        }
    }

    public int getNumarPuncte() {
        return numarPuncte;
    }

    public Joc setNumarPuncte(int numarPuncte) {
        this.numarPuncte = numarPuncte;
        return this;
    }
}
