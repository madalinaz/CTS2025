package s14.mock;

public class MasinaMock implements AbstractMasina{
    private double viteza;

    public MasinaMock(double viteza) {
        this.viteza = viteza;
    }

    @Override
    public double getViteza() {
        return this.viteza;
    }
}
