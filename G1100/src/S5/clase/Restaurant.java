package S5.clase;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private static Restaurant instance;
    //singleton data(non-static)
    private List<Masa> listaMese;
    private String denumire;

    private Restaurant(String denumire){
        this.listaMese = new ArrayList<>();
        this.denumire=denumire;
    }

    public static Restaurant getInstance(){
        if(instance==null){
           instance = new Restaurant(null);
        }

        return instance;
    }

    //singleton methods + operations
    public Masa getMasa(boolean esteAfara, int nrPers){
        for(Masa m: listaMese){
            if(m.getNrScaune()>=nrPers && m.isEsteAfara()==esteAfara)
                return m;
        }
        return null;
    }

    public void addMasa(Masa m){
        this.listaMese.add(m);
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "listaMese=" + listaMese +
                '}';
    }
}
