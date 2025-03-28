package s05.Restaurant.clase;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private static Restaurant instance = new Restaurant();
    //singletonData
    private List<Masa> listaMese;
    private String denumire;

    private Restaurant(){
        listaMese = new ArrayList<>();
    }

    public static Restaurant getInstance(){
        return instance;
    }

    //singleton methods+operations
    public void addMasa(Masa m){
        this.listaMese.add(m);
    }

    public Masa getMasaLibera(int nrPersoane, boolean afara){
        for(Masa m:listaMese){
            if(m.isEsteLibera() && m.getNrScaune()>=nrPersoane && m.isEsteAfara()==afara)
                return m;
        }
        return null;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "listaMese=" + listaMese +
                '}';
    }
}
