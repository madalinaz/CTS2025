package dp.C3.SOLID.O.After.v1;

public abstract class Angajat {
    protected String nume;

    public Angajat(String nume) {
        this.nume = nume;
    }

    public abstract double getSalariu();


}
