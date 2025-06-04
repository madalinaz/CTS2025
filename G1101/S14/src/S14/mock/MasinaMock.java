package S14.mock;

import S14.clase.AbstractMasina;

public class MasinaMock implements AbstractMasina {
    private double viteza;

    public MasinaMock(double viteza) {
        this.viteza = viteza;
    }

    @Override
    public double getViteza() {
        return this.viteza;
    }
}
