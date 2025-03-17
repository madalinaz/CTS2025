package dp.C3.SOLID.O.Before;

public class Manager {
    private String nume;
    private int nrProiecte;
    private double salariuBaza;

    public Manager(String nume, int nrProiecte, double salariuBaza) {
        this.nume = nume;
        this.nrProiecte = nrProiecte;
        this.salariuBaza = salariuBaza;
    }

    public String getNume() {
        return nume;
    }

    public int getNrProiecte() {
        return nrProiecte;
    }

    public double getSalariuBaza() {
        return salariuBaza;
    }
}
