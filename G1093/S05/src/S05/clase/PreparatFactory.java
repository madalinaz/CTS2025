package S05.clase;

public class PreparatFactory implements IFactory{
    private static PreparatFactory instance;
    int contor=1;
    int nrMaximPreparate;

    private PreparatFactory(int nrMaximPreparate){
        this.nrMaximPreparate=nrMaximPreparate;
    }

    public static PreparatFactory getInstance(int nrMaximPreparate){
        if(instance==null){
            instance = new PreparatFactory(nrMaximPreparate);
        } else{
            instance.setNrMaximPreparate(nrMaximPreparate);
        }
        return instance;
    }

    private void setNrMaximPreparate(int nrMaximPreparate){
        if(nrMaximPreparate>this.nrMaximPreparate)
            this.nrMaximPreparate=nrMaximPreparate;
    }

    @Override
    public Preparat crearePreparat(TipPreparat tipPreparat, String denumire) {
        if(contor<=nrMaximPreparate) {
            int id = contor++;
            switch (tipPreparat) {
                case PASTE -> {
                    return new Paste(id, denumire, null, false);
                }

                case PIZZA -> {
                    return new Pizza(id, denumire, 20);
                }
            }
        }
        System.out.println("A atins limita");
        return null;
    }
}
