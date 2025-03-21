package dp.C4.Singleton.Restaurant.clase;

import dp.C5.builder.v2.clase.Petrecere;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private static Restaurant instance = new Restaurant();
    private List<Masa> listaMese;

    private Restaurant(){
        //preluare info din surse externe
        this.listaMese=new ArrayList<>();
        this.listaMese.add(new Masa(1));
        this.listaMese.add(new Masa(2));
        this.listaMese.add(new Masa(3));
    }
    public static Restaurant getInstance(){
        return instance;
    }

    public int getMasaLibera(){
        for(Masa m: listaMese) {
            if(m.isEsteLibera()) {
                m.setEsteLibera(false);
                return m.getId();
            }
        }
        return -1;
    }

    public void elibereazaMasa(int id){
        for(Masa m:listaMese){
            if(m.getId()==id){
                if(!m.isEsteLibera())
                    m.setEsteLibera(true);
                else
                    System.out.println("Masa NU era ocupata inainte");
            }
        }
    }

    public void afisareDisponibilitateMese(){
        for(Masa m: listaMese){
            System.out.println(m);
        }
    }
}
