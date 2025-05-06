package S09.Composite.clase;

public class Item implements INod{
    //clasa nod - frunza
    private String denumire;
    private float nrCalorii;
    private boolean isVegan;

    public Item(String denumire, float nrCalorii, boolean isVegan) {
        this.denumire = denumire;
        this.nrCalorii = nrCalorii;
        this.isVegan = isVegan;
    }

    @Override
    public float getNumarCalorii() {
        return nrCalorii;
    }

    @Override
    public boolean isVegan() {
        return isVegan;
    }

    @Override
    public void addNod(INod nod) {
        throw new UnsupportedOperationException();
    }

    @Override
    public INod getNod(int index) {
       throw  new UnsupportedOperationException();
    }

    @Override
    public void removeNod(INod nod) {
        throw  new UnsupportedOperationException();
    }
}
