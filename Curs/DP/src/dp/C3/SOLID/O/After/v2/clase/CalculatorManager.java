package dp.C3.SOLID.O.After.v2.clase;


public class CalculatorManager extends ICalculator<Manager> {
    public CalculatorManager(Manager angajat) {
        super(angajat);
    }
    @Override
    public float calculSalariu() {
        return getAngajat().salariulDeBaza + getAngajat().salariulDeBaza * 0.20f;
    }
}
