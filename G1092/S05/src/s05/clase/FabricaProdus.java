package s05.clase;

public class FabricaProdus implements IFactory {

    private static FabricaProdus instance = new FabricaProdus();
    private int contor;
    private int nrMaxProduse;
    private FabricaProdus(){
        this.contor = 0;
        this.nrMaxProduse = 0;
    }

    private void setNrMaxProduse(int nrMaxProduse) {
        this.nrMaxProduse = nrMaxProduse;
    }

    public static FabricaProdus getInstance(int maxProduse){
        instance.setNrMaxProduse(maxProduse);
        return instance;
    }



    @Override
    public IProdus creareProdus(TipProdus tipProdus, String denumire) {
        if(this.nrMaxProduse <= this.contor) {
            return null; //exceptie
        }
        else {
            int id = this.contor + 100;
            this.contor ++;
            switch (tipProdus){
                case PIZZA -> {
                    return new Pizza(denumire, null, id);
                }
                case BURGER -> {
                    return new Burger(denumire, 0, id);
                }
                default -> {
                    return null;
                }
            }
        }
    }
}
