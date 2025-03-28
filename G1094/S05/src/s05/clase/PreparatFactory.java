package s05.clase;

import s05.exceptii.ExceptieId;

import java.util.ArrayList;
import java.util.List;

public class PreparatFactory {
    private static PreparatFactory instance;
    private List<Integer> listaId;
    private int nrMaximPreparate;

    private PreparatFactory(int nrMaximPreparate){
        this.nrMaximPreparate=nrMaximPreparate;
        listaId = new ArrayList<>();
    }

    public static synchronized PreparatFactory getInstance(int nrMaximPreparate){
        if(instance==null){
            instance = new PreparatFactory(nrMaximPreparate);
        } else{
            instance.setNrMaximPreparate(nrMaximPreparate);
        }
        return instance;
    }

    private void setNrMaximPreparate(int nrMaximPreparate){
        if(nrMaximPreparate>=this.nrMaximPreparate){
            this.nrMaximPreparate=nrMaximPreparate;
        }
    }

    private boolean existaId(int id){
        if(this.listaId.contains(id))
            return true;
        return false;
    }

    public Preparat crearePreparat(TipPreparat tipPreparat, int id, String denumire) throws Exception {
        if(this.nrMaximPreparate>this.listaId.size()) {
            if (!existaId(id)) {
                this.listaId.add(id);
                switch (tipPreparat) {
                    case PIZZA -> {
                        return new Pizza(id, denumire, 0, false);
                    }
                    case BURGER -> {
                        return new Burger(id, denumire, "-");
                    }
                    case null, default -> {
                        return null;
                    }
                }
            }
            throw new ExceptieId();
        }
        throw new Exception("Am depasit limita de nr obiecte");
    }
}
