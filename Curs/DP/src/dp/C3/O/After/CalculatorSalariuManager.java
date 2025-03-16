package dp.C3.O.After;

public class CalculatorSalariuManager implements CalculatorSalariu{
    @Override
    public double getSalariu(Angajat a) {
        if(a instanceof Manager){
            Manager m = (Manager) a;
            return m.getSalariuBaza()+ (m.getAreMBA()? 1000 : 0);
        }
        throw new IllegalArgumentException();
    }
}
