package DP.Structurale.Facade;

import java.util.ArrayList;
import java.util.List;

public class ColectieOspatari {
    private List<Ospatar> listaOspatari = new ArrayList<Ospatar>();

    public void addOspatar(Ospatar ospatar){
        this.listaOspatari.add(ospatar);
    }

    public int getNrOspatariData(String data){
        int contor=0;
        for(Ospatar ospatar:listaOspatari){
            if(!ospatar.isEsteOcupat())
                contor++;
        }
        return contor;
    }
}
