package dp.C3.O.After;

public class CalculatorSalariuLucrator implements  CalculatorSalariu{
    @Override
    public double getSalariu(Angajat a) {
        if(a instanceof Lucrator){
            Lucrator l = (Lucrator) a;
            return l.getNrOreLucrate()*l.getTarifOra();
        }
        throw new IllegalArgumentException();
    }
}
