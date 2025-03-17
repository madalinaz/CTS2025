package dp.C3.SOLID.O.After.v1;

public class Manager extends Angajat {
    static CalculatorSalariu calculatorSalariu = new CalculatorSalariuManager();
    boolean areMBA;
    double salariuBaza;

    public Manager(String nume, boolean areMBA, double salariuBaza) {
        super(nume);
        this.areMBA=areMBA;
        this.salariuBaza=salariuBaza;
    }


    @Override
    public double getSalariu() {
        return calculatorSalariu.getSalariu(this);
    }

    public boolean getAreMBA() {
        return areMBA;
    }

    public double getSalariuBaza() {
        return salariuBaza;
    }
}
