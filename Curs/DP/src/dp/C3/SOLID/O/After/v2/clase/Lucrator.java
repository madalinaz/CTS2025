package dp.C3.SOLID.O.After.v2.clase;

public class Lucrator extends Angajat{

    public Lucrator(int id, String nume, float salariulDeBaza) {
        super(id, nume, salariulDeBaza);
        this.setCalculator(new CalculatorLucrator(this));
    }

}
