package s14.mock;

public class MasinaMock implements AbstractMasina{
    private double viteza;
    private boolean areSemnLamaie;

    public MasinaMock(double viteza, boolean areSemnLamaie) {
        this.viteza = viteza;
        this.areSemnLamaie = areSemnLamaie;
    }

    @Override
    public double getViteza() {
        return this.viteza;
    }

    @Override
    public boolean areSemnLamaie() {
        return this.areSemnLamaie;
    }
}
