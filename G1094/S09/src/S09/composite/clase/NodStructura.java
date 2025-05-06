package S09.composite.clase;

import java.util.ArrayList;
import java.util.List;

public class NodStructura implements INod {
    private String denumire;
    private List<INod> listaFii;

    public NodStructura(String denumire) {
        this.denumire = denumire;
        this.listaFii = new ArrayList<>();
    }

    @Override
    public double getNrCalorii() {
        double nrCalorii = 0;
        for(INod nod : this.listaFii) {
            nrCalorii += nod.getNrCalorii();
        }
        return nrCalorii;
    }

    @Override
    public boolean isBio() {
        for(INod nod : this.listaFii) {
            if(!nod.isBio()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void addNod(INod nod) {
        if(nod!=null){
            this.listaFii.add(nod);
        }
    }

    @Override
    public void removeNod(INod nod) {
        if(nod!=null){
            this.listaFii.remove(nod);
        }
    }

    @Override
    public INod getNod(int index) {
        if(index>=0 && index<this.listaFii.size()){
            return this.listaFii.get(index);
        }
        return null;
    }
}
