package S10.decorator.clase;

public class DecoratorCodReducere extends AbstractDecorator{
    private static int contor = 100;

    public DecoratorCodReducere(IComanda comanda) {
        super(comanda);
    }

    @Override
    public void printare() {
        super.printare();
        contor++;
        //indiferent de tipul produsului prin decorator
        //printam si un cod de reducere
        if(this.comanda.getProdus().getTipProdus() == TipProdus.ELECTRO_MARE) {
            System.out.println("Ati primit cod reducere: XYZ" + contor);
        }


    }
}
