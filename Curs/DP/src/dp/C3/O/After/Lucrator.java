package dp.C3.O.After;

public class Lucrator extends Angajat{
    static CalculatorSalariu calculatorSalariu = new CalculatorSalariuLucrator();
    private int nrOreLucrate;
    private double tarifOra;
    public Lucrator(String nume, int nrOreLucrate, double tarifOra) {
        super(nume);
        this.nrOreLucrate=nrOreLucrate;
        this.tarifOra=tarifOra;
    }

    @Override
    public double getSalariu() {
        return calculatorSalariu.getSalariu(this);
    }

    public int getNrOreLucrate() {
        return nrOreLucrate;
    }

    public double getTarifOra() {
        return tarifOra;
    }
}
