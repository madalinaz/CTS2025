package seminar9.composite.clase;

public class Colet implements INod{
    private float greutate;
    private boolean esteFragil;

    public Colet(float greutate, boolean esteFragil) {
        this.greutate = greutate;
        this.esteFragil = esteFragil;
    }

    @Override
    public float getGreutate() {
        return greutate;
    }

    @Override
    public boolean isFragil() {
        return false;
    }

    @Override
    public void adaugaNod(INod nod) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void stergeNod(INod nod) {
        throw new UnsupportedOperationException();
    }

    @Override
    public INod getNod(int index) {
        throw new UnsupportedOperationException();
    }
}
