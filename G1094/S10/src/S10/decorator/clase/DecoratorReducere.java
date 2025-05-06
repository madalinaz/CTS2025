package S10.decorator.clase;

public class DecoratorReducere extends DecoratorAbstract{
    private static int contor = 100;
    private static double pragMinim = 150;

    public DecoratorReducere(IComanda comanda) {
        super(comanda);
        contor++;
    }

    public static void setPragMinim(double pragMinim) {
        DecoratorReducere.pragMinim = pragMinim;
    }

    @Override
    public void printare() {
        super.printare();

        if (comanda.getTotal() >= pragMinim){
            System.out.println("S-a oferit codul de reducere XYZ" + contor );
        }

    }


}
