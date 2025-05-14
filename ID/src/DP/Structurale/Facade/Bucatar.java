package DP.Structurale.Facade;

public class Bucatar {
    private String nume;
    private boolean esteOcupat;

    public Bucatar(String nume, boolean esteOcupat) {
        this.nume = nume;
        this.esteOcupat = esteOcupat;
    }

    public String getNume() {
        return nume;
    }

    public boolean isEsteOcupat() {
        return esteOcupat;
    }
}
