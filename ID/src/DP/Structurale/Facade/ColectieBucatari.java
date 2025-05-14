package DP.Structurale.Facade;

import java.util.ArrayList;
import java.util.List;

public class ColectieBucatari {
    private List<Bucatar>listaBucatari=new ArrayList<>();

    public void addBucatar(Bucatar bucatar) {
        this.listaBucatari.add(bucatar);
    }

    public int getNumarBucatariLiberiData(String data){
        int contor =0;
        for(Bucatar bucatar : listaBucatari){
            if(!bucatar.isEsteOcupat())
                contor++;
        }
        return contor;
    }
}
