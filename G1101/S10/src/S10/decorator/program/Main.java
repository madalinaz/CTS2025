package S10.decorator.program;


import S10.decorator.clase.*;

public class Main {
    public static void main(String[] args) {
        //inainte de decorare
        IComanda comanda = new Comanda(12, new Produs(TipProdus.ELECTRO_MARE, "TV Samsung"));
        comanda.printare();

        //dupa decorare
        IComanda comandaDecorata = new DecoratorCodReducere(comanda);
        comandaDecorata.printare();
    }
}