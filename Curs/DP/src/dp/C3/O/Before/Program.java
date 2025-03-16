package dp.C3.O.Before;

public class Program {

    public static void main(String[] args) {
        Lucrator l=new Lucrator("Gigel", 80,80);
        Manager m = new Manager("Costel",5,10000);

        CalculatorSalariu calculatorSalariu = new CalculatorSalariu();
        System.out.println(calculatorSalariu.calculSalariuLucrator(l));
        System.out.println(calculatorSalariu.calculSalariuManager(m));
    }
}
