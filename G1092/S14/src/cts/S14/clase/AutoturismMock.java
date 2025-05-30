package cts.S14.clase;

public class AutoturismMock implements AbstractAutoturism{
    private double viteza;
    private boolean esteIncepator;

    public AutoturismMock(double viteza, boolean esteIncepator) {
        this.viteza = viteza;
        this.esteIncepator = esteIncepator;
    }

    @Override
    public double getViteza() {
        return this.viteza;
    }

    @Override
    public boolean esteIncepator() {
        return this.esteIncepator;
    }
}
