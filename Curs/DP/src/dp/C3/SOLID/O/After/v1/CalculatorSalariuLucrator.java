package dp.C3.SOLID.O.After.v1;

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
