package S09_Composite.models;

// colet este un nod frunza
public class Colet implements INod {
    private double greutate;
    private boolean esteFragil;

    public Colet(double greutate, boolean esteFragil) {
        this.greutate = greutate;
        this.esteFragil = esteFragil;
    }

    @Override
    public double getGreutate() {
        return this.greutate;
    }

    @Override
    public boolean esteFragil() {
        return this.esteFragil;
    }

    @Override
    public void addNod(INod nod) {
        throw new UnsupportedOperationException("Not supported!");
    }

    @Override
    public void stergeNod(INod nod) {
        throw new UnsupportedOperationException("Not supported!");
    }

    @Override
    public INod getNod(int index) {
        return null;
    }
}
