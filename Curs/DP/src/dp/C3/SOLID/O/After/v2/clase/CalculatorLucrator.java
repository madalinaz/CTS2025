package dp.C3.SOLID.O.After.v2.clase;

public class CalculatorLucrator extends ICalculator<Lucrator> {
    public CalculatorLucrator(Lucrator angajat) {
        super(angajat);
    }
    public float calculSalariu() {
        return getAngajat().salariulDeBaza;
    }
}
