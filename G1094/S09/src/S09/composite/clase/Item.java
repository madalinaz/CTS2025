package S09.composite.clase;

public class Item implements INod {
    private String denumire;
    private double nrCalorii;
    private boolean esteBio;

    public Item(String denumire, double nrCalorii, boolean esteBio) {
        this.denumire = denumire;
        this.nrCalorii = nrCalorii;
        this.esteBio = esteBio;
    }

    @Override
    public double getNrCalorii() {
        return this.nrCalorii;
    }

    @Override
    public boolean isBio() {
        return this.esteBio;
    }

    @Override
    public void addNod(INod nod) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void removeNod(INod nod) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public INod getNod(int index) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
