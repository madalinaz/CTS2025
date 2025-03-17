package dp.C3.SOLID.O.After.v2.clase;

public abstract class Angajat {

    private ICalculator<? extends Angajat> calculator;
    int id;
    String nume;
    float salariulDeBaza;

    public Angajat(int id, String nume, float salariulDeBaza) {
        this.id = id;
        this.nume = nume;
        this.salariulDeBaza = salariulDeBaza;
        calculator = null;
    }

    public ICalculator<? extends Angajat> getCalculator() {
        return calculator;
    }
    public void setCalculator(ICalculator<? extends Angajat> calculator) {
        this.calculator = calculator;
    }
}
