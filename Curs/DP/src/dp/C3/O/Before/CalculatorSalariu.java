package dp.C3.O.Before;

public class CalculatorSalariu {
    public double calculSalariuLucrator(Lucrator l){
        return l.getNrOreLucrate()*l.getTarifOra();
    }

    public double calculSalariuManager(Manager m){
        return m.getSalariuBaza() + m.getNrProiecte()*1000;
    }
}
