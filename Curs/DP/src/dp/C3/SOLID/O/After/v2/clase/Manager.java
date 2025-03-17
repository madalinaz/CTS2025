package dp.C3.SOLID.O.After.v2.clase;

public class Manager extends Angajat{
    public Manager(int id, String nume, float salariulDeBaza) {
        super(id, nume, salariulDeBaza);
        this.setCalculator(new CalculatorManager(this));
    }
}
